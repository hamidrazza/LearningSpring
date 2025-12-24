package com.hamid;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    // 'service' -> instead we can use 'doGet'
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("In Service");
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");
        out.println("<h2><i>Hello World !!</i></h2>");
    }
}
