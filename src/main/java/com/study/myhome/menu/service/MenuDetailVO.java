package com.study.myhome.menu.service;

import org.apache.ibatis.type.Alias;

@Alias("MenuDetailVO")
public class MenuDetailVO {

	private int menuIdx;

	private String menuName;

	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	private int order_idx;

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

	public int getOrder_idx() {
		return order_idx;
	}

	public void setOrder_idx(int order_idx) {
		this.order_idx = order_idx;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + menuIdx;
		result = prime * result
				+ ((menuName == null) ? 0 : menuName.hashCode());
		result = prime * result + order_idx;
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MenuDetailVO other = (MenuDetailVO) obj;
		if (menuIdx != other.menuIdx)
			return false;
		if (menuName == null) {
			if (other.menuName != null)
				return false;
		} else if (!menuName.equals(other.menuName))
			return false;
		if (order_idx != other.order_idx)
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

}
