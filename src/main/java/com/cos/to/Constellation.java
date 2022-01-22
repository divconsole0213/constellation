package com.cos.to;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Constellation
 */
@WebServlet("/constellation")
public class Constellation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setCharacterEncoding("utf-8");
			resp.setContentType("text/html; charset=utf-8");
			PrintWriter out = resp.getWriter();
		    String birth = req.getParameter("date_");
            String[] birthDay = birth.split("-");
            int[] birthDate = Arrays.stream(birthDay).mapToInt(Integer::parseInt).toArray();
 
       
            	if(birthDate[1] == 3) {
            		if(birthDate[2] >= 21) {
            			out.println("양자리 입니다.");
            		}
            		else if(birthDate[2] <= 20) {
            			 out.println("물고기 자리입니다.");
            		}
            
            	    }
            	if(birthDate[1] == 4) {
            		if(birthDate[2] >= 19) {
            			out.println("양자리 입니다.");
            		}
            		else if(birthDate[2] <= 18) {
            			 out.println("황소 자리입니다.");
            		}
            	
            	    }
            	if(birthDate[1] == 5) {
            		if(birthDate[2] >= 21) {
            			out.println("쌍둥이자리 입니다.");
            		}
            		else if(birthDate[2] <= 20) {
            			 out.println("황소자리입니다.");
            		}
            	    }
            	if(birthDate[1] == 6) {
            		if(birthDate[2] >= 22) {
            			out.println("게자리입니다.");
            		}
            		else if(birthDate[2] <= 21) {
            			 out.println("쌍둥이자리입니다.");
            		}
            
            	    }
            	if(birthDate[1] == 7) {
            		if(birthDate[2] >= 23) {
            			out.println("사자자리 입니다.");
            		}
            		else if(birthDate[2] <= 22) {
            			 out.println("게자리입니다.");
            		}
            	    }
            	if(birthDate[1] == 8) {
            		if(birthDate[2] >= 23) {
            			out.println("처녀자리 입니다.");
            		}
            		else if(birthDate[2] <= 22) {
            			 out.println("사자자리입니다.");
            		}
            	    }
            	if(birthDate[1] == 9) {
            		if(birthDate[2] >= 24) {
            			out.println("천칭자리입니다.");
            		}
            		else if(birthDate[2] <= 23) {
            			 out.println("처녀자리입니다.");
            		}
            
            	    }
            	if(birthDate[1] == 10) {
            		if(birthDate[2] >= 23) {
            			out.println("전갈자리입니다.");
            		}
            		else if(birthDate[2] <= 22) {
            			 out.println("천칭자리입니다.");
            		}
            	    }
            	if(birthDate[1] == 11) {
            		if(birthDate[2] >= 23) {
            			out.println("궁수자리입니다.");
            		}
            		else if(birthDate[2] <= 22) {
            			 out.println("전갈자리입니다.");
            		}
            	
            	    }
            	if(birthDate[1] == 12) {
            		if(birthDate[2] >= 25) {
            			out.println("염소자리입니다.");
            		}
            		else if(birthDate[2] <= 24) {
            			 out.println("궁수자리입니다.");
            		}
            	    }
            	if(birthDate[1] == 1) {
            		if(birthDate[2] >= 20) {
            			out.println("물병자리입니다.");
            		}
            		else if(birthDate[2] <= 20) {
            			 out.println("물고기자리입니다.");
            		}
            	    }
            	if(birthDate[1] == 2) {
            		if(birthDate[2] >= 19) {
            			out.println("물고기자리입니다.");
            		}
            		else if(birthDate[2] <= 18) {
            			 out.println("물병자리입니다.");
            		}
            	    }
            	  
            	  
        }
            	
            }
            
            
            
            
            
            
	
	
			