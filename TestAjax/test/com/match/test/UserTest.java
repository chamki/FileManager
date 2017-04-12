package com.match.test;

import java.sql.Connection;

import org.junit.Test;

import com.match.model.User;
import com.match.service.UserService;
import com.match.util.DBUtil;

public class UserTest {
	
	@Test
	public void getUser(){
		Connection conn  = DBUtil.getConn();
		UserService service = new UserService();
		service.setConn(conn);
		User user = service.getUser(2);
System.out.println(user);
	}
}
