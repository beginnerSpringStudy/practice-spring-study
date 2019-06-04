package egovframework.com.cmm.service;

import java.util.List;
import java.util.Map;

/**
 * @author 공통 서비스 개발팀 이삼섭
 * @Class Name : EgovFileMngService.java
 * @Description : 파일정보의 관리를 위한 서비스 인터페이스
 * @Modification Information
 * <p>
 * 수정일       수정자         수정내용
 * -------        -------     -------------------
 * 2009. 3. 25.     이삼섭    최초생성
 * @see
 * @since 2009. 3. 25.
 */
public interface EgovFileMngService {

  /**
   * 파일에 대한 목록을 조회한다.
   */
  List<FileVO> selectFileInfs(FileVO fvo) throws Exception;

  /**
   * 하나의 파일에 대한 정보(속성 및 상세)를 등록한다.
   */
  String insertFileInf(FileVO fvo) throws Exception;

  /**
   * 여러 개의 파일에 대한 정보(속성 및 상세)를 등록한다.
   */
  String insertFileInfs(List<?> fvoList) throws Exception;

  /**
   * 여러 개의 파일에 대한 정보(속성 및 상세)를 수정한다.
   */
  void updateFileInfs(List<?> fvoList) throws Exception;

  /**
   * 여러 개의 파일을 삭제한다.
   */
  void deleteFileInfs(List<?> fvoList) throws Exception;

  /**
   * 하나의 파일을 삭제한다.
   */
  void deleteFileInf(FileVO fvo) throws Exception;

  /**
   * 파일에 대한 상세정보를 조회한다.
   */
  FileVO selectFileInf(FileVO fvo) throws Exception;

  /**
   * 파일 구분자에 대한 최대값을 구한다.
   */
  int getMaxFileSN(FileVO fvo) throws Exception;

  /**
   * 전체 파일을 삭제한다.
   */
  void deleteAllFileInf(FileVO fvo) throws Exception;

  /**
   * 파일명 검색에 대한 목록을 조회한다.
   */
  Map<String, Object> selectFileListByFileNm(FileVO fvo) throws Exception;

  /**
   * 이미지 파일에 대한 목록을 조회한다.
   */
  List<FileVO> selectImageFileList(FileVO vo) throws Exception;
}
