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
            String p1="";
            for(int i=0;i<pr.length();i++)
            {
                char ch=pr.charAt(i);
                if(ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9')
                {
                    p1=p1+ch;
                }
            }
            ResultSet rs=ob.srchCompo(component, p1);
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
