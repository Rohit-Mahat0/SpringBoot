package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.UserBean;
import com.example.demo.dao.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao udao;
	public void addUser(UserBean ub)
	{
		udao.save(ub);
		System.out.println("Employee logged in successfully");
	}

}
