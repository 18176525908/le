package com.book_manager.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDao {
	//加载数据库驱动-->数据库连接-->执行Sql语句-->返回结果记录集
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static Connection getCon(){
		try{
			Connection con=DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/book_manage_system?useUnicode=true&characterEncoding=UTF-8","root","123456");
			return con;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

}
