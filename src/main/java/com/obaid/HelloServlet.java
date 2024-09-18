package com.obaid;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse rep) throws IOException {
        rep.setContentType("text/html");
        System.out.println("in service...");
        PrintWriter out=rep.getWriter();
        out.println("<h1><b><u>Hello, World</u></b></h1>");

    }
}
