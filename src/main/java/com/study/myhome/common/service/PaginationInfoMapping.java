package com.study.myhome.common.service;

import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.springframework.stereotype.Component;

@Component("paginationMapper")
public class PaginationInfoMapping {

  /**
   * 페이징 값 셋팅을 위한 공통 메서드
   */
  public void setPaginationInfo(PaginationInfo paginationInfo, Pageable obj) throws Exception {

    if (paginationInfo == null || obj == null) {
      throw new Exception("parameter가 올바르지 않습니다.");
    }

    // 필드
    Field[] f = obj.getClass().getSuperclass().getDeclaredFields();
    Method m = null;
    for (Field fi : f) {
      if (fi.getName().equals("p")) {
        m = obj.getClass().getMethod("getP", null);
        paginationInfo.setCurrentPageNo(Integer.parseInt(m.invoke(obj).toString()));
      }
      if (fi.getName().equals("pageSize")) {
        m = obj.getClass().getMethod("getPageSize", null);
        paginationInfo.setPageSize(Integer.parseInt(m.invoke(obj).toString()));
      }
      if (fi.getName().equals("recordCountPerPage")) {
        m = obj.getClass().getMethod("getRecordCountPerPage", null);
        paginationInfo.setRecordCountPerPage(Integer.parseInt(m.invoke(obj).toString()));
      }
    }

    m = obj.getClass().getMethod("setFirstIndex", int.class);
    m.invoke(obj, paginationInfo.getFirstRecordIndex());
    m = obj.getClass().getMethod("setLastIndex", int.class);
    m.invoke(obj, paginationInfo.getLastRecordIndex());
    m = obj.getClass().getMethod("setRecordCountPerPage", int.class);
    m.invoke(obj, paginationInfo.getRecordCountPerPage());

  }
}
