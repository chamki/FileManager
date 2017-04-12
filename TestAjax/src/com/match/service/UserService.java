package com.match.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.match.model.User;
import com.match.util.DBUtil;
import com.match.util.MD5Util;

public class UserService {
	
	private Connection conn;
	
	public boolean save(User u) {
		PreparedStatement ps = null;

		String sql = " INSERT INTO f_user ( "
				+ "	u_id, u_name, u_password, u_phone, u_mail, u_address "
				+ " ) VALUES (null,?,?,?,?,?) ";
		
		try {
			int n = 1;
			
			ps = conn.prepareStatement(sql);

			String password = MD5Util.md5Password(u.getPassword());
System.out.println("password ="  + password);
			ps.setString(n++, u.getName());
			ps.setString(n++, password);
			ps.setString(n++, u.getPhone());
			ps.setString(n++, u.getEmail());
			ps.setString(n++, u.getAddress());
System.out.println("sql ="  + sql);
			ps.executeUpdate();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(ps);
		}
		return false;
	}
	
	public User getUser(int id){
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = " select u_id, u_name, u_password, u_phone, u_mail, u_address from f_user where u_id = ?";
		User u = new User();
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next()){
				u.setId(rs.getInt("u_id") + "");
				u.setName(rs.getString("u_name"));
				u.setPassword(rs.getString("u_password"));
				u.setPhone(rs.getString("u_phone"));
				u.setEmail(rs.getString("u_mail"));
				u.setAddress(rs.getString("u_address"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(ps);
		}
		return u;
	}
	
	public User getUser(String userName){
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = " select u_id, u_name, u_password, u_phone, u_mail, u_address from f_user where u_name = ?";
		User u = new User();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, userName);
			rs = ps.executeQuery();
			if(rs.next()){
				u.setId(rs.getInt("u_id") + "");
				u.setName(rs.getString("u_name"));
				u.setPassword(rs.getString("u_password"));
				u.setPhone(rs.getString("u_phone"));
				u.setEmail(rs.getString("u_mail"));
				u.setAddress(rs.getString("u_address"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(ps);
		}
		return u;
	}
	
	public List<User> getUsers(){
		List<User> users = new ArrayList<User>();
		PreparedStatement ps = null;
		ResultSet rs = null;

		String sql = " select u_id, u_name, u_password, u_phone, u_mail, u_address from f_user "
				+ "";
		User u = new User();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()){
				u.setId(rs.getInt("u_id") + "");
				u.setName(rs.getString("u_name"));
				u.setPassword(rs.getString("u_password"));
				u.setPhone(rs.getString("u_phone"));
				u.setEmail(rs.getString("u_mail"));
				u.setAddress(rs.getString("u_address"));
				users.add(u);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(ps);
		}
		return users;
	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}
}
