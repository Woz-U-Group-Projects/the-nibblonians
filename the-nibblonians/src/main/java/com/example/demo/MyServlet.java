package com.example.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {

private static final long serialVersionUID = 6632886175268784375L;

// resource management
    // throws ServletException
    public void init() throws ServletException {
        super.init();
    }

// resource management
    public void destroy() {
        super.destroy();
    }

// Create
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPost was called.");
    }

// Read
  //...

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    // Retrieve the "Test-Header" value from the HTTP request header
    String testHeaderID = request.getHeader("Test-Header");
    String testHeaderResponse;

    // If the response is not null, and has a value, replace with said value.
    if(testHeaderID != null && !testHeaderID.isEmpty()) {
        testHeaderResponse = testHeaderID;
    }else {
        testHeaderResponse = "nothing";
        // Changes the response status to 400 Bad Request.
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
    }

    // Store the 'responseText' string in the response object (to be sent to the client)
    String responseText = "You sent " + testHeaderResponse + " to the server. ";

    // writes the text to the response.
    response.getWriter().append(responseText);

    System.out.println("doGet was called.");
    }


// Update
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doPut was called.");
    }

// Delete
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("doDelete was called.");
    }
    
}






