package com.study.myhome.board.service;

import com.study.myhome.common.service.Pageable;
import egovframework.com.cmm.service.FileVO;
import java.util.List;
import org.apache.ibatis.type.Alias;

@Alias("BoardVO")
public class BoardVO extends Pageable {

  private Long row;

  private Long idx;

  private String title;

  private String content;

  private int viewCnt = 0;

  private String useYn = "Y";

  private String atchFileId;

  private String username;

  private String regdate;

  private List<FileVO> files;

  public BoardVO() {

  }

  public BoardVO(String title, String content, String atchFileId) {
    super();
    this.title = title;
    this.content = content;
    this.atchFileId = atchFileId;
  }

  public BoardVO(Long idx, String title, String content, String atchFileId) {
    super();
    this.idx = idx;
    this.title = title;
    this.content = content;
    this.atchFileId = atchFileId;
  }

  public String getRegdate() {
    return regdate;
  }

  public void setRegdate(String regdate) {
    this.regdate = regdate;
  }

  public Long getIdx() {
    return idx;
  }

  public void setIdx(Long idx) {
    this.idx = idx;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public int getViewCnt() {
    return viewCnt;
  }

  public void setViewCnt(int viewCnt) {
    this.viewCnt = viewCnt;
  }

  public String getUseYn() {
    return useYn;
  }

  public void setUseYn(String useYn) {
    this.useYn = useYn;
  }

  public String getAtchFileId() {
    return atchFileId;
  }

  public void setAtchFileId(String atchFileId) {
    this.atchFileId = atchFileId;
  }

  public void setAtch_file_id(List<FileVO> files) {
    if (files != null) {
      this.atchFileId = files.get(0).getAtch_file_id();
    }
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public List<FileVO> getFiles() {
    return files;
  }

  public void setFiles(List<FileVO> files) {
    this.files = files;
  }

  public Long getRow() {
    return row;
  }

  public void setRow(Long row) {
    this.row = row;
  }
}
