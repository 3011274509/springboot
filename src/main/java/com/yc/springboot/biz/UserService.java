package com.yc.springboot.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.springboot.bean.User;
import com.yc.springboot.dao.UserDao;

@Service
public class UserService {
	@Autowired
	UserDao ud;
	
	public int addUser(String name,String password){
		return ud.addUser( name, password);
	}
	
	public int deleteUser(Integer id){
		return ud.deleteUser(id);
	}
	public int updateUser(User user){
		return ud.updateUser(user);
	}
	public User findUser(int id){
		return ud.findUser(id);
	}
	

}
