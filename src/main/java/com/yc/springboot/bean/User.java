package com.yc.springboot.bean;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;

import javax.annotation.Generated;

import org.springframework.core.serializer.Serializer;
import org.springframework.stereotype.Component;

public class User implements Serializable {	
	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = 8285714299993958470L;
	private Integer id;
	private String name;
	private String password;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	

}
