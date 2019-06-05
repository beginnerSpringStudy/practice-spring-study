package com.study.myhome.user.service.impl;

import com.study.myhome.common.service.impl.CommonDAO;
import com.study.myhome.user.service.UserVO;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDAO extends CommonDAO {

  /**
   * 사용자 조회
   *
   * @author 정명성
   * create date : 2016. 10. 4.
   */
  public List<UserVO> findUsers(UserVO userVO) throws Exception {
    return sessionTemplate.selectList("UserDAO.selectUsers", userVO);
  }

  /**
   * 사용자 전체 리스트 카운트
   *
   * @author 정명성
   * create date : 2016. 10. 4.
   */
  public Integer getTotalUser(UserVO userVO) throws Exception {
    return sessionTemplate.selectOne("UserDAO.selectUsersTotalCnt", userVO);
  }

  /**
   * 사용자 정보 입력
   *
   * @author 정명성
   * create date : 2016. 10. 4.
   */
  public void insertUser(UserVO userVO) throws Exception {
    sessionTemplate.insert("UserDAO.insertUser", userVO);
  }

  /**
   * 사용자 조회
   *
   * @author 정명성
   * create date : 2016. 10. 6.
   */
  public UserVO findUser(UserVO userVO) throws Exception {
    return sessionTemplate.selectOne("UserDAO.selectUser", userVO);
  }
}
