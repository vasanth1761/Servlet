package com.railways;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.railway.model.railwayPojo;
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
//		String userName=request.getParameter("name");
//		String email=request.getParameter("email");
//		String phone=request.getParameter("number");
//		RequestDispatcher req=request.getRequestDispatcher("user.jsp");
//		req.forward(request, response);
        String action=request.getParameter("action");
        if(action!=null)
        switch(action)
        {
        case"Delete":
        {
        	int deleteid=Integer.parseInt(request.getParameter("delete"));
//        	userImpl userdelete=new userImpl();
        
        	try {
				userImpl.delete(deleteid);
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	 RequestDispatcher req=request.getRequestDispatcher("user.jsp");
     		req.forward(request, response);
        	break;
        }
        	
         case"update":
        	{
        		
        	 userP obj1=new userP();
        	 int upid=Integer.parseInt(request.getParameter("updateid"));
        	 System.out.println("updateid"+upid);
        	 obj1.setId(upid);
        	 obj1.setName(request.getParameter("name"));
        	 obj1.setEmail(request.getParameter("email"));
        	 obj1.setPhonenumber(request.getParameter("number"));
        	 try {
				userImpl.update(obj1, upid);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	}
        	  RequestDispatcher req=request.getRequestDispatcher("user.jsp");
        		req.forward(request, response);
        		break;
        		
        
        case"search":
        {
        	String sear =request.getParameter("Search");
        	System.out.println(sear);
        }
	}
	}

//        case"update":
//        {
//        	int updateid=Integer.parseInt(request.getParameter("up"));
//        	try {
//				userImpl.update(obj, updateid);
//			} catch (ClassNotFoundException | SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//        	RequestDispatcher req=request.getRequestDispatcher("user.jsp");
//    		req.forward(request, response);
//        }
//      
//        }
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
//		doGet(request,response);
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
	    userImpl obj1=new userImpl();
	    try {
			obj1.insertTable();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
//	    RequestDispatcher req=request.getRequestDispatcher("user.html");
//		req.forward(request, response);

	    RequestDispatcher req=request.getRequestDispatcher("user.jsp");
		req.forward(request, response);
		
//		protected void doPost1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
	}

}
