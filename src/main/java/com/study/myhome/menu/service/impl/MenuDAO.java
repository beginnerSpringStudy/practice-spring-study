package com.study.myhome.menu.service.impl;

import com.study.myhome.common.service.impl.CommonDAO;
import com.study.myhome.menu.service.MenuDetailVO;
import com.study.myhome.menu.service.MenuVO;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class MenuDAO extends CommonDAO {

  /**
   * 메뉴 구하기
   *
   * @author 정명성
   * create date : 2016. 10. 24.
   */
  public MenuVO findMenus(MenuVO menuVO) throws Exception {
    return sessionTemplate.selectOne("MenuDAO.selectMenu", menuVO);
  }

  /**
   * 하위 메뉴 가져오기
   *
   * @author 정명성
   * create date : 2016. 10. 24.
   */
  public List<MenuDetailVO> findMenuDetails(int menu_idx) throws Exception {
    return sessionTemplate.selectList("MenuDAO.selectMenuDetails", menu_idx);
  }
}
