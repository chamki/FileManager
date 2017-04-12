package com.match.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.match.model.User;
import com.match.service.UserService;
import com.match.util.DBUtil;
import com.match.util.MD5Util;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		PrintWriter pw = response.getWriter();
		
		Connection conn = DBUtil.getConn();
		UserService service = new UserService();
		service.setConn(conn);
		User user = service.getUser(userName);
		String dbPassword = user.getPassword();
		String dbUserName = user.getName();
		String md5Password = MD5Util.md5Password(password);
System.out.println("userName= " + userName);
System.out.println("dbPassword= " + dbPassword);
System.out.println("dbUserName= " + dbUserName);
System.out.println("md5Password= " + md5Password);
		if(dbUserName.equals(userName) && md5Password.equals(dbPassword)) {
			pw.write("login success!");
			return;
		}
		
	}

}
