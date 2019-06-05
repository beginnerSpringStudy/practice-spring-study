package com.study.myhome.user.service;

public interface UserAuthorityService {

  UserAuthorityVO findUserAuthority(UserVO userVO) throws Exception;

  void insertUserAuthority(UserAuthorityVO userAuthorityVO)
      throws Exception;

}
