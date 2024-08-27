package com.pangtaek.practice01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginQueryString")
public class LoginGetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();

        resp.setContentType("text/html; charset=utf-8");

        String userName = req.getParameter("userName");
        String userPassword = req.getParameter("userPassword");

        System.out.println("================= Login(GET) =================");
        System.out.println("userName: " + userName);
        System.out.println("userPassword: " + userPassword);
        System.out.println("==============================================");

        StringBuilder sb = new StringBuilder();
        sb.append("<html>")
                .append("<head>")
                .append("<title>Login(GET)</title>")
                .append("</head>")
                .append("<body>")
                .append("<h1>Login Successful</h1>")
                .append("<h2>")
                .append("userName: " + userName)
                .append("</h2>")
                .append("<h2>")
                .append("userPassword: " + userPassword)
                .append("</h2>")
                .append("</body>")
                .append("</html>");

            out.println(sb);
            out.flush();
            out.close();

    }
}
