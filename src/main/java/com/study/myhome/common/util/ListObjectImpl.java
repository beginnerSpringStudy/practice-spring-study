package com.study.myhome.common.util;

import java.util.List;

import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

public class ListObjectImpl<T> implements ListObject<T> {

	private List<T> list;

	private int totalCnt;

	private PaginationInfo paginationInfo;

	public ListObjectImpl(List<T> list, int totalCnt, PaginationInfo paginationInfo) {
		super();
		this.list = list;
		this.totalCnt = totalCnt;
		// 토탈 카운트 갯수 추가
		paginationInfo.setTotalRecordCount(this.totalCnt);
		this.paginationInfo = paginationInfo;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getTotalCnt() {
		return totalCnt;
	}

	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}

	public PaginationInfo getPaginationInfo() {
		return paginationInfo;
	}

	@Override
	public String toString() {
		return "ListObjectImpl{" +
				"list=" + list +
				", totalCnt=" + totalCnt +
				", paginationInfo=" + paginationInfo +
				'}';
	}
}
