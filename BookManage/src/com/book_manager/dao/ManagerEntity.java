package com.book_manager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.book_manager.entity.User;



public class ManagerEntity {

	
	public List<User> findAll(){
		try{
			List<User> list=new ArrayList<User>();
			Connection con=BaseDao.getCon();
			PreparedStatement pstm=con.prepareStatement("select * from user");
			ResultSet rs=pstm.executeQuery();
			User u=null;
			while(rs.next()){
				u=new User();
				u.setId(rs.getInt(1));
				u.setUsername(rs.getString(2));
				u.setName(rs.getString(3));
				u.setSex(rs.getString(4));
				u.setPhone(rs.getString(5));
				u.setAddress(rs.getString(6));
				u.setPower(rs.getString(7));
				u.setPassword(rs.getString(8));
				u.setLoginNum(rs.getInt(9));
				list.add(u);
				System.out.println(u);
			}
			
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	public boolean addUser(User u){
		try{
			Connection con=BaseDao.getCon();
			PreparedStatement pstm=con.prepareStatement("insert into user(username,name,phone,address,power) values(?,?,?,?,?)");
			pstm.setString(1, u.getUsername());
			pstm.setString(2, u.getName());
			pstm.setString(3, u.getPhone());
			pstm.setString(4, u.getAddress());
			pstm.setString(5, u.getPower());
			int rs = pstm.executeUpdate();
			if(rs>0){
				return true;
			}else{
				return false;
			}
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	
	public boolean updateUser(User u){
		try{
			Connection con=BaseDao.getCon();
			PreparedStatement pstm=con.prepareStatement("update user set username=?,name=?,phone=?,address=? where id=?");
			pstm.setInt(5,u.getId());
			pstm.setString(1, u.getUsername());
			pstm.setString(2, u.getName());
			pstm.setString(3, u.getPhone());
			pstm.setString(4, u.getAddress());
            int rs = pstm.executeUpdate();
            System.out.println(rs);
            if(rs>0){
				return true;
			}else{
				return false;
			}
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	public boolean deleteUserById(int id){
		try{
			Connection con=BaseDao.getCon();
			PreparedStatement pstm=con.prepareStatement("delete from user where id=?");
			pstm.setInt(1, id);
			int rs=pstm.executeUpdate();
			if(rs>0){
				return true;
			}else{
				return false;
			}
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	

	
	public User findUserById(int id){
		try{
			Connection con=BaseDao.getCon();
			PreparedStatement pstm=con.prepareStatement("select * from user where id=?");
			pstm.setInt(1, id);
			ResultSet rs=pstm.executeQuery();
			User u=null;
			while(rs.next()){
				u=new User();
				u.setId(rs.getInt(1));
				u.setUsername(rs.getString(2));
				u.setName(rs.getString(3));
				u.setSex(rs.getString(5));
				u.setPhone(rs.getString(4));
				u.setAddress(rs.getString(6));
				u.setPower(rs.getString(7));
				u.setPassword(rs.getString(8));
				u.setLoginNum(rs.getInt(9));
//				System.out.println(m);
			}
			return u;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}



	public boolean isExist(int id) {
		return findUserById(id)==null?false:true;
	}


}
