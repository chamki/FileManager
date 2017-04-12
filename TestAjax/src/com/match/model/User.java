package com.match.model;

/**
 * 用户类
 * @author Administrator
 *
 */
public class User {

	//Id
	private String id;
	
	//姓名
	private String name;
	
	//密码
	private String password;
	
	//联系电话
	private String phone;
	
	//邮箱地址
	private String email;
	
	//住址
	private String address;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	/**
	 * 重写toString方法
	 */
	@Override
	public String toString() {
		return "[ id = " + id + "; name = " + name + "; password = " + password + "; phone = "
				+ phone + "; email = "+ email + "; address = "+ address;
	}
	
	/**
	 * 重写equals方法
	 */
	@Override
	public boolean equals(Object o) {
		if(o instanceof User){
			User u = (User)o;
			if(u.getId().equals(id) && u.getName().equals(name) && u.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 重写hashCode方法
	 */
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
