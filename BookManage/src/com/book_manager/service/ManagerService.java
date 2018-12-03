package com.book_manager.service;


import java.util.List;

import com.book_manager.dao.ManagerEntity;
import com.book_manager.entity.User;


public class ManagerService {

	ManagerEntity be=new ManagerEntity();
	
	
	/*
	 * 查询管理用户方法
	 */
	public List<User> findAll() {
		List<User> list=be.findAll();
		return list;
	}
	
	
	/*
	 * 验证查询用户方法<根据id>
	 */
	public User findUserById(int id){
		User m=be.findUserById(id);
		return m;
	}
	
	
	/*
	 * 添加user信息
	 */
	public boolean addUser(User u){
		if(!be.isExist((u.getId()))){
			be.addUser(u);
			return true;
		}else{
			System.out.println("此用户已存在");
			return false;
		}
		
	}
	
	
	/* 
	  * 验证user修改方法	
	  */
	 
	public boolean updateUser(User u){
		if(be.isExist(u.getId())){
			be.updateUser(u);
			return true;
		}else{
			return false;
		}
	}
	
	 /*
	  * * 验证user删除方法	
	  */
	 
	public boolean deleteUserById(int id){
		if(be.isExist(id)){
			be.deleteUserById(id);
			return true;
		}else{
			return false;
		}
	}


	
}
