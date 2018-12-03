package com.book_manager.entity;

public class User {
	private Integer id;
	private String username;
	private String name;
	private String sex;
	private String phone;
	private String address;
	private String power;
	private String password;
	private Integer loginNum;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getLoginNum() {
		return loginNum;
	}
	public void setLoginNum(Integer loginNum) {
		this.loginNum = loginNum;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", username=" + username + ", name=" + name + ", sex=" + sex + ", phone=" + phone
				+ ", address=" + address + ", power=" + power + ", password=" + password + ", loginNum=" + loginNum
				+ "]";
	}
	public User(Integer id, String username, String name, String phone,String address) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.phone = phone;
		this.address = address;
		
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
