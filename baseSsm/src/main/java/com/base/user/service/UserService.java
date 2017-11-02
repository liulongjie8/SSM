package com.base.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.user.dao.UserDao;
import com.base.user.entity.User;

/**
 * 用户服务接口
 * 
 * @author LLS
 * 
 */
@Service
public class UserService {

	@Autowired
	private UserDao dao;

	/**
	 * 是否能登陆
	 */
	public boolean doLogin(User user) {
		List<User> list = dao.selectById(user.getUserName());
		if (list.size() == 0) {
			return false;
		} else {
			if (list.get(0).getPassWord().equals(user.getPassWord())) {
				return true;
			} else {
				return false;
			}
		}
	}

	public List<User> findList() {
		return dao.findList();
	}

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

}
