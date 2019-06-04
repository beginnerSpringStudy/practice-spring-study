package com.study.myhome.user.service;

import com.study.myhome.common.util.ListObject;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import java.util.Map;

public interface UserService {

  Map<String, Object> findUsers(UserVO userVO) throws Exception;

  void insertUsers(UserVO userVO, UserAuthorityVO userAuthorityVO) throws Exception;

  UserVO findUser(UserVO userVO) throws Exception;

  ListObject<UserVO> findUsers(UserVO userVO, PaginationInfo paginationInfo) throws Exception;
}
