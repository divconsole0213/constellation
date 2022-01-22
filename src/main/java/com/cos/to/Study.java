package com.cos.to;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Study
 */
@WebServlet("/study")
public class Study extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  resp.setCharacterEncoding("utf-8"); // encoding을 한국어 버젼으로 할거구요 ^_^
	  resp.setContentType("text/html; charset=utf-8"); //브라우저야; 한국어 버젼이야 ^,,^
	  PrintWriter out  = resp.getWriter();
// count = ? 에 숫자를 심으면 
// 숫자를 심는대로 페이지에 문자를 출력하라
// 에러 페이지 없이...
	  //변수 지정 
	  // temp가 있어야 하는 이유  count를 담아줘야함 우리가 사이트 주소에서 숫자를 심는건 
	  // 숫자가 아닌 문자형태이다
	String temp = req.getParameter("cnt");
	int cnt = 0;
	
	  if(temp != null && !temp.equals("")) // temp = "" 을 입력하지 않음 nullPointer발생 //temp의 값이 ("")와 동등하지 않을 경우 출력해라!
		   cnt = Integer.parseInt(temp);
		  for(int i = 0; i < cnt; i++) {
			  out.println((i+1)+":나는 해낸다!");
		  }
     
	  }
	}


