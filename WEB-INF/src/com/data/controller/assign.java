package com.data.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.data.model.data;

@WebServlet("/assign")
public class assign extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	String name=req.getParameter("name");
	String branch=req.getParameter("branch");
	String sub=req.getParameter("sem");
	String sem=req.getParameter("sub");
	new data().assign(name,branch,sem,sub);
	resp.sendRedirect("home.jsp");
}
}
