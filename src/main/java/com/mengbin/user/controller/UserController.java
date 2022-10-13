package com.mengbin.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mengbin.user.model.User;
import com.mengbin.user.service.UserService;

/**
 * 用户访问接口
 * @author mengbin
 */
@RestController
@RequestMapping("/user")
public class UserController {
	
	/** 用户业务逻辑层对象 */
    @Autowired
    private UserService userService;

    /**
     * 登录
     * @param loginName 用户名
     * @return 结果
     */
    @SuppressWarnings("rawtypes")
	@RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST}, 
    	produces = "text/html;charset=UTF-8")
    public ResponseEntity<?> login(String loginName) {
        String sessionId = null;
        User user = userService.findByLoginName(loginName);
        if (user != null) {
        	// 把用户登录信息放进Session
            Map<String, Object> loginInfo = new HashMap<>();
            loginInfo.put("userId", user.getId());
        	sessionId = "123";
        	System.out.println("sessionID"+sessionId);
        }
        return new ResponseEntity(HttpStatus.OK);
    }

}
