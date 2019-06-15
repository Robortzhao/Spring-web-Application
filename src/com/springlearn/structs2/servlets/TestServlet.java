package com.springlearn.structs2.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import com.springlearn.structs2.beans.Person;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/**
		 * 1.��Application������еõ�IOC����������
		 * 2.��IOC �����еõ���Ҫ��bean
		 */
		ServletContext servletContext=getServletContext();
		ApplicationContext ctx=(ApplicationContext) servletContext.getAttribute("ApplicationContext");
		Person person=ctx.getBean(Person.class);
		person.hello();
	}
}
