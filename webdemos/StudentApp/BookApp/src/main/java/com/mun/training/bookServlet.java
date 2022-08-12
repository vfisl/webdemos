package com.mun.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class bookServlet
 */
@WebServlet("/bookServlet")
public class bookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String title=request.getParameter("title");
		int id=Integer.parseInt(request.getParameter("bookId"));
		String author=request.getParameter("author");
		String category=request.getParameter("category");
		double price=Double.parseDouble(request.getParameter("price"));
				
		request.setAttribute("mytitle", title);
		request.setAttribute("bookId", id);
		request.setAttribute("author", author);
		request.setAttribute("category", category);
		request.setAttribute("price", price);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("succes.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
