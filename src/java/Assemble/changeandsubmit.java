package Assemble;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import net.sf.jasperreports.engine.*;
import java.sql.*;
import java.util.HashMap;
import javax.servlet.ServletOutputStream;
@WebServlet(name = "changeandsubmit", urlPatterns = {"/changeandsubmit"})
public class changeandsubmit extends HttpServlet {
  /*  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
        } finally {            
            out.close();
        }
    }*/
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String s1=request.getParameter("s1");
        AssembleBean ob=new AssembleBean();
        HttpSession s=request.getSession(true);
        int i=0;
        if(s1!=null)
        {
            int price=ob.updateStatusToDone("sinha.aot@gmail.com");
            Connection connection=null;
            ServletOutputStream servletOutputStream = response.getOutputStream();
            String reportStream =getServletContext().getRealPath("") + File.separator+"/reports/report1.jrxml";
            String reportStream1 =getServletContext().getRealPath("") + File.separator+"/reports/report1.jasper";
            HashMap parameterMap = new HashMap();
            parameterMap.put("tid", new Integer(price));
            try{
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                connection = DriverManager.getConnection ("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=G:/My projects/Assemble.net/Assemble.accdb");
                System.setProperty("jasper.reports.compile.class.path", getServletContext().getRealPath("") + File.separator+"/WEB-INF/lib/jasperreports-5.5.1.jar");
                JasperReport jr=JasperCompileManager.compileReport(reportStream);
                JasperPrint jp=JasperFillManager.fillReport(reportStream1, parameterMap, connection); 
                JasperExportManager.exportReportToPdfStream(jp, servletOutputStream);
                connection.close();
                response.setContentType("application/pdf");
                servletOutputStream.flush();
                servletOutputStream.close();
                response.sendRedirect("Assemble.jsp");
           }catch (Exception e){
               System.out.println(e);
           }
        }
        else
        {
            for(i=1;i<=19;i++)
            {
                String pro=request.getParameter("Change_"+i);
                if(pro!=null)
                {
                    break;
                }
            }
            s.setAttribute("price", null);
            s.setAttribute("imgurl", null);
            s.setAttribute("link", null);
            s.setAttribute("cmpname", null);
            s.setAttribute("from", "your_order");
            response.sendRedirect("assemble"+i+".jsp");
        }
      //  processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
