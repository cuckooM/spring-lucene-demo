package com.mengbin.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

import com.mengbin.user.model.User;

/**
 * 用户数据访问层接口
 * @author mengbin
 */
public interface UserRepository extends 
    PagingAndSortingRepository<User,Long>, JpaRepository<User,Long> {
	
	/**
	 * 根据登录名查询人员
	 * @param loginName 登录名
	 * @return 人员
	 */
    User findByLoginNameIgnoreCase(String loginName);

    /**
     * 修改指定人员的用户名
     * @param userName 用户名
     * @param id 用户id
     */
    @Modifying
    @Transactional
    @Query("UPDATE User user SET user.userName = ?2 WHERE user.id = ?1")
    void updateName(Long userId, String userName);

}
