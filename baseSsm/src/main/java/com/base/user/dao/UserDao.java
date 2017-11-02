package com.base.user.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.base.user.entity.User;

/**
 * 用户dao操作
 * 
 * @author LLS
 * 
 * @param <User>
 */
@Repository
public interface UserDao {

	List<User> findList();

	List<User> selectById(String userName);

}
