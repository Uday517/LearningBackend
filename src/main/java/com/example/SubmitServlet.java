package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SubmitServlet")
public class SubmitServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set the response content type
        response.setContentType("text/html");

        // Get the form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        // Prepare the response
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Form Submission Details</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("</body></html>");
    }
}
