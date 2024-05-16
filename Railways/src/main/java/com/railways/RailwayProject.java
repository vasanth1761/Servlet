package com.railways;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.railway.model.railwayPojo;

/**
 * Servlet implementation class RailwayProject
 */
@WebServlet("/RailwayProject")
public class RailwayProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<railwayPojo>list= new ArrayList<railwayPojo>();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RailwayProject() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String userName=request.getParameter("name");
		String email=request.getParameter("email");
		String date=request.getParameter("date");
		String number=request.getParameter("number");
		String location=request.getParameter("location");
		String password=request.getParameter("password");
		
		
		
		
		PrintWriter out=response.getWriter();
//		out.println(userName);
//		out.println(email);
//		out.println(date);
//		out.println(number);
//		out.println(location);
//		out.println(password);
		list.add(new railwayPojo(userName,email,number,date,location,password));
		request.setAttribute("list",list );
		RequestDispatcher req=request.getRequestDispatcher("output.jsp");
		req.forward(request, response);

		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
