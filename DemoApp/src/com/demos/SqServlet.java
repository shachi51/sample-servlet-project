package com.demos;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res, HttpSession HttpSession) throws IOException {
		
		//int k=Integer.parseInt(req.getParameter("k"));
		
		//int k=(int)req.getAttribute("k");
		
//		HttpSession=req.getSession();
//		ServletRequest session = null;
//		int k=(int)session.getAttribute("k");
		
		int k=0;
		Cookie cookies[]=req.getCookies();
		
		for(Cookie c:cookies) {
			if(c.getName().equals("k"))
				k=Integer.parseInt(c.getValue());
		}
		k=k*k;
		PrintWriter out=res.getWriter();
		out.print("Result is "+k);
		
		
	}
}
