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


public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password1");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
System.out.println("phone= "+ phone);
System.out.println("userName= "+ userName);
System.out.println("password= "+ password);
System.out.println("email= "+ email);
System.out.println("address= "+ address);

		
		User u = new User();
		u.setName(userName);
		u.setPassword(password);
		u.setPhone(phone);
		u.setEmail(email);
		u.setAddress(address);
		
		Connection conn = DBUtil.getConn();
		UserService service = new UserService();
		service.setConn(conn);
		boolean saved = service.save(u);
		
		PrintWriter pw = response.getWriter();
		if(saved) {
			pw.write("user add success!");
			return;
		}
		
	}

}
