package com.ysdrzp.service;

import com.ysdrzp.pojo.Users;

public interface UserService {

	/**
	 * @Description: 查询用户信息
	 */
	Users queryUserInfo(String userId, String pwd);

}

