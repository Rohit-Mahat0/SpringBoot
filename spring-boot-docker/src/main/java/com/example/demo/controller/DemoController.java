package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Department;
import com.example.demo.bean.Employee;
import com.example.demo.bean.UserBean;
import com.example.demo.service.AdminService;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.UserService;
@CrossOrigin
@RestController
@RequestMapping("/admin")
public class DemoController {
    @Autowired
    private AdminService adserv;
    @Autowired
    private EmployeeService empserv;
    @Autowired
    private UserService userv;
@GetMapping("/welcome")
public String first()
{
    return "<h1>Welcome to Spring Boot</h1>";
}
@PostMapping("/addDept")
public String second(@RequestBody Department dept)
{
    adserv.addDepartment(dept);
    return "<h1>Added successfully...</h1>";
}
@PostMapping("/addEmp")
public String third(@RequestBody Employee emp)
{
    empserv.addEmployee(emp);
    return "<h1>Employee added successfully...</h1>";
}
@PostMapping("/addUser")
public String fourth(@RequestBody UserBean ub)
{
    userv.addUser(ub);
    return "<h1>User Added successfully...</h1>";
}
}
