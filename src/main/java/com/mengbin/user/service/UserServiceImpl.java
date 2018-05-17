package com.mengbin.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mengbin.user.model.User;
import com.mengbin.user.repository.UserRepository;

/**
 * 人员业务逻辑层接口实现类
 * @author mengbin
 */
@Service
public class UserServiceImpl implements UserService {

	/** 用户数据访问层接口对象 */
    @Autowired
    private UserRepository userRepository;

    @Override
    public User add(User user){
        return userRepository.save(user);
    }

    @Override
    public User findByLoginName(String loginName) {
        return userRepository.findByLoginNameIgnoreCase(loginName);
    }
    
    @Override
    public void updateName(Long userId, String userName) {
    	userRepository.updateName(userId, userName);
    }
	
}
