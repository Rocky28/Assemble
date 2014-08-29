package Assemble;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class getcompo extends HttpServlet {
   /* protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           
        } finally {            
            out.close();
        }
    } */

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    //    processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        try {
            AssembleBean ob=new AssembleBean();
            HttpSession s=request.getSession(true);
            String component=request.getParameter("cmp");
            String pr=request.getParameter("pr");
            System.out.println(component+pr);
            ResultSet rs=ob.srchCompo(component, pr);
            s.setAttribute("result", rs);
            response.sendRedirect("componentpre.jsp");
            
        //    processRequest(request, response);
        } catch (Exception ex) {
            
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
