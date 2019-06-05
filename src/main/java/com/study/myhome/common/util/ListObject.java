package com.study.myhome.common.util;

import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import java.util.List;

public interface ListObject<T> {

  List<T> getList();

  PaginationInfo getPaginationInfo();

  int getTotalCnt();
}
