package com.example.md4_ss2_bt1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/home")
public class HelloServlet extends HttpServlet {
    List<Customer> customers = new ArrayList<>();

    public void init() {
        customers.add(new Customer(1, "Nguyễn Văn A", "01/02/1990", "Hà Nội", "url1"));
        customers.add(new Customer(2, "Trần Thị B", "03/04/1985", "Hồ Chí Minh", "url2"));
        customers.add(new Customer(3, "Lê Văn C", "05/06/1988", "Đà Nẵng", "url3"));
        customers.add(new Customer(4, "Phạm Thị D", "07/08/1995", "Huế", "url4"));
        customers.add(new Customer(5, "Vũ Văn E", "09/10/1980", "Hải Phòng", "url5"));
    }

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setCharacterEncoding("UTF-8");
        req.setAttribute("customers", customers);
        req.getRequestDispatcher("./view/home.jsp").forward(req, resp);
    }


    public void destroy() {
    }
}