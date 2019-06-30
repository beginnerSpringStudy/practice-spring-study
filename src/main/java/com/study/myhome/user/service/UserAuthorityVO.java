package com.study.myhome.user.service;

import com.study.myhome.enums.Authority;
import com.study.myhome.menu.service.MenuVO;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import org.apache.ibatis.type.Alias;

@Alias("UserAuthorityVO")
public class UserAuthorityVO implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = -496000620423956080L;

@NotNull
  private String username;

  private Authority authority = Authority.MEMBER;

  // 권한별 메뉴
  private MenuVO menus;

  public UserAuthorityVO(String username, Authority authority) {
    super();
    this.username = username;
    this.authority = authority;
  }

  public UserAuthorityVO(String username, Authority authority, MenuVO menus) {
    super();
    this.username = username;
    this.authority = authority;
    this.menus = menus;
  }

  public UserAuthorityVO() {

  }

  public MenuVO getMenus() {
    return menus;
  }

  public void setMenus(MenuVO menus) {
    this.menus = menus;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Authority getAuthority() {
    return authority;
  }

  public void setAuthority(Authority authority) {
    this.authority = authority;
  }
}
