package com.yc.springboot.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.PathVariable;

import com.yc.springboot.bean.User;
public interface UserDao {
	@Insert("insert into user(name,password) values(#{name},#{password})")
	public int addUser(@Param("name") String name,@Param("password") String password);
	
	@Delete("delete from user where id=#{id} ")
	public int deleteUser(Integer id);
	
	@Update("update user set name=#{name},password=#{password} where id=#{id}")
	public int updateUser(User user);
	
	@Select("select * from user where id=#{id}")
	public User findUser(int id);

}
