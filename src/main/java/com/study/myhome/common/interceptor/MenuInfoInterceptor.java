package com.study.myhome.common.interceptor;

import com.study.myhome.enums.Authority;
import com.study.myhome.menu.service.MenuService;
import com.study.myhome.menu.service.MenuVO;
import egovframework.com.cmm.LoginVO;
import egovframework.com.cmm.util.EgovUserDetailsHelper;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.WebContentInterceptor;

public class MenuInfoInterceptor extends WebContentInterceptor {

  private static Logger LOG = LoggerFactory.getLogger(MenuInfoInterceptor.class);

  @Autowired
  private MenuService menuService;

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    LOG.info("menuInterceptor postHandle");

    MenuVO menu;
    if (EgovUserDetailsHelper.isAuthenticated()) {
      LoginVO loginVO = (LoginVO) EgovUserDetailsHelper.getAuthenticatedUser();
      int menuIdx = loginVO.getUserAuthority().getMenus().getMenuIdx();
      menu = menuService.findMenus(new MenuVO(Authority.values()[menuIdx]));
    } else {
      menu = menuService.findMenus(new MenuVO(Authority.NONMEMBER));
    }

    LOG.info("menuIdx : {}", menu.getMenuIdx());

    request.setAttribute("menuIdx", menu.getMenuIdx());
    request.setAttribute("menus", menu.getMenuDetails());
  }

}
