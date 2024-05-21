package com.railways;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.railway.model.userP;
import com.railways.dao.userImpl;

/**
 * Servlet implementation class userDetails
 */
@WebServlet("/userDetails")
public class userDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       userP obj=new userP();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		String userName=request.getParameter("name");
//		String email=request.getParameter("email");
//		String phone=request.getParameter("number");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String userName=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("number");
	
	obj.setName(userName);
	obj.setEmail(email);
	obj.setPhonenumber(phone);
		
	    try {
			userImpl.insert(obj);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
