package com.yc.springboot.web.action;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yc.springboot.bean.User;
import com.yc.springboot.biz.UserService;

@Controller
public class UserAction {
	@Resource
	UserService us;
	
	@RequestMapping("/a")
	public String post(){
		return "index";
	}
	
	@PostMapping("/add")
	public String addU(String name,String password){		
		int a=us.addUser(name,password);
		if(a>0){		
		return "index2";
		}else{
			return "error";
		}
	}
	@DeleteMapping("/delete/{id}")
	public void deleteU(@PathVariable("id") int id,HttpServletResponse response){				
		us.deleteUser(id);
		response.setCharacterEncoding("UTF-8");
		try {
			response.getWriter().print("删除成功");
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
	@PutMapping("/update")
	public void updateU(User user,HttpServletResponse response){
		int i=us.updateUser(user);
		if(i>0){
			System.out.println("ss");
		}
		try {
			response.getWriter().print("修改成功");
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
	
	@GetMapping("/find/{id}")
	public String findU(@PathVariable("id") int id,HttpServletRequest request){
		User user=us.findUser(id);
		request.setAttribute("user", user);
		return "index2";
	}

}
