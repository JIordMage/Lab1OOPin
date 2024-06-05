package com.example.lab1oopin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;

@WebServlet(name = "TrigonometryServlet", value = "/trigonometry-servlet")
public class TrigonometryServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String function = request.getParameter("function");
        double angle;
        try {
            angle = Double.parseDouble(request.getParameter("angle"));
        } catch (NumberFormatException e) {
            out.println("<p>Invalid input for angle.</p>");
            return;
        }

        String precisionString = request.getParameter("precision");
        int precision = Integer.parseInt(precisionString);

        double result = 0;
        if (function.equals("sin")) {
            result = Math.sin(Math.toRadians(angle));
        } else if (function.equals("cos")) {
            result = Math.cos(Math.toRadians(angle));
        } else if (function.equals("tan")) {
            result = Math.tan(Math.toRadians(angle));
        }

        out.println("<p>Результат: " + round(result, precision) + "</p>");
    }

    private double round(double value, int precision) {
        double scale = Math.pow(10, precision);
        return Math.round(value * scale) / scale;
    }
}
