package entity;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.jdbc.Product;


public class Connectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//1.������������
			Class.forName("com.mysql.jdbc.Driver");
			//2.��ȡ���ݿ����Ӷ���
			Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=UTF-8","root","123456");
			//3.ִ��SQL���
			PreparedStatement ps=conn.prepareStatement("select * from product");
			//4.���ؽ����¼��
			ResultSet rs=ps.executeQuery();
			Product p=new Product();
			
			while(rs.next()){
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setPrice(rs.getInt("price"));
				System.out.println(p);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
