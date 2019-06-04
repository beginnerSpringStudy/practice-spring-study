package com.study.myhome.menu.service;

import com.study.myhome.enums.Authority;
import java.util.List;
import org.apache.ibatis.type.Alias;

@Alias("MenuVO")
public class MenuVO {

  private int menuIdx;

  private String menuName;
  // 메뉴 상세
  private List<MenuDetailVO> menuDetails;

  public MenuVO() {

  }

  public MenuVO(Authority authorityMenu) {
    super();
    this.menuIdx = authorityMenu.ordinal();
  }

  public int getMenuIdx() {
    return menuIdx;
  }

  public void setMenuIdx(int menuIdx) {
    this.menuIdx = menuIdx;
  }

  public String getMenuName() {
    return menuName;
  }

  public void setMenuName(String menuName) {
    this.menuName = menuName;
  }

  public List<MenuDetailVO> getMenuDetails() {
    return menuDetails;
  }

  public void setMenuDetails(List<MenuDetailVO> menuDetails) {
    this.menuDetails = menuDetails;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result
        + ((menuDetails == null) ? 0 : menuDetails.hashCode());
    result = prime * result + menuIdx;
    result = prime * result
        + ((menuName == null) ? 0 : menuName.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    MenuVO other = (MenuVO) obj;
    if (menuDetails == null) {
      if (other.menuDetails != null) {
        return false;
      }
    } else if (!menuDetails.equals(other.menuDetails)) {
      return false;
    }
    if (menuIdx != other.menuIdx) {
      return false;
    }
    if (menuName == null) {
      return other.menuName == null;
    } else {
      return menuName.equals(other.menuName);
    }
  }

}
