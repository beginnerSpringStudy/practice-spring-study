package com.study.myhome.common.util;

import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ListObjectImpl<T> implements ListObject<T> {

  private List<T> list;

  private int totalCnt;

  private PaginationInfo paginationInfo;

  public ListObjectImpl(List<T> list, int totalCnt, PaginationInfo paginationInfo) {
    super();
    this.list = list;
    this.totalCnt = totalCnt;
    paginationInfo.setTotalRecordCount(this.totalCnt);
    System.out.println(">>>>>>>>>>>>>>>>>>> " + ToStringBuilder.reflectionToString(paginationInfo));
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
