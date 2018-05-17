package com.mengbin.user.service;

import com.mengbin.user.model.User;

/**
 * 人员业务逻辑层接口
 * @author mengbin
 */
public interface UserService {
	
	/**
	 * 增加用户
	 * @param user 用户
	 * @return 人员
	 */
	User add(User user);
	
	/**
	 * 根据登录名查询人员
	 * @param loginName 登录名
	 * @return 人员
	 */
	User findByLoginName(String loginName);
	
	/**
	 * 编辑用户名
	 * @param userId 用户id
	 * @param userName 用户名
	 */
	void updateName(Long userId, String userName);
}
