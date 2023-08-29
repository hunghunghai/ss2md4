package com.example.md4_ss2_bt2;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     req.setCharacterEncoding("UTF-8");
      double first = Double.parseDouble(req.getParameter("first")) ;
      double second = Double.parseDouble(req.getParameter("second")) ;
      String value = req.getParameter("value");
      PrintWriter writer = resp.getWriter();
      writer.println("<html>");
      writer.println("<h1>Result</h1>");
      try {
          writer.println(Calculator.calculator( first, second, value));
      }catch (Exception e) {
          writer.println(e.getMessage());
      }
      writer.println("</html>");
    }
}