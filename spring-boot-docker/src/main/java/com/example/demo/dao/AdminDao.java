package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Department;

@Repository
public interface AdminDao extends JpaRepository<Department, Integer> {

}
