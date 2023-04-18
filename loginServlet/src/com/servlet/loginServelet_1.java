package com.servlet;

import javax.servlet.annotation.WebServlet;

@WebServlet(name="loginServelet_1",urlPatterns = "/loginServlet_1")
public class loginServelet_1 extends javax.servlet.http.HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username==null||username.length()==0){
            //重定向到login_1.jsp
            response.sendRedirect("login_1.jsp");
        }
        else if (password==null||password.length()==0){
            //重定向到login_1.jsp
            response.sendRedirect("login_1.jsp");
        }
        else if (username.equals("admin")&&password.equals("123456")){
            //转发到loginSuccess.jsp
            request.getRequestDispatcher("loginSuccess_1.jsp").forward(request, response);
        }
        else {
            //重定向到login_1.jsp
            response.sendRedirect("login_1.jsp");
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, java.io.IOException {
        doPost(request, response);
    }
}
