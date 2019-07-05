package com.study.myhome.common.util;

import java.util.List;

import com.study.myhome.board.service.BoardVO;

import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

public class ListObject2Impl<T> implements ListObject<T> {

	public ListObject2Impl(List<BoardVO> list, int totalCount, PaginationInfo paginationInfo, int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<T> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaginationInfo getPaginationInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTotalCnt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
