package com.study.myhome.user.service;

import java.util.Map;

import com.study.myhome.common.util.ListObject;

import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
	
public interface UserService {

	public Map<String, Object> findUsers(UserVO userVO) throws Exception;

	public void insertUsers(UserVO userVO, UserAuthorityVO userAuthorityVO)	throws Exception;
	
	public UserVO findUser(UserVO userVO) throws Exception;
	
	public ListObject<UserVO> findUsers(UserVO userVO, PaginationInfo paginationInfo) throws Exception;
}
