package Assemble;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(name = "selgraphicscard", urlPatterns = {"/selgraphicscard"})
public class selgraphicscard extends HttpServlet {
/*    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
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
    //    processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String processor=request.getParameter("choosegraphicscard");
        HttpSession s=request.getSession(true);
        AssembleBean ob=new AssembleBean();
        String req1=request.getParameter("s1");
        String req2=request.getParameter("s2");
        if(req1!=null)
        {
            try{
                ResultSet rs=ob.getUserGraphicscardChoice(processor);
                rs.next();
                String imgurl=rs.getString(5);
                String cmpname=rs.getString(2);
                int price=rs.getInt(3);
                String link=rs.getString(6);
                s.setAttribute("price", price);
                s.setAttribute("imgurl", imgurl);
                s.setAttribute("link", link);
                s.setAttribute("cmpname", cmpname);
                response.sendRedirect("assemble11pre.jsp");
            }
            catch(Exception ex){
                
            }
        }
        else
        {
            String from=(String)s.getAttribute("from");
            if(from==null)
            {
            if(processor==null)
            {
                String cmp=(String)s.getAttribute("cmpname");            
                int price=(Integer)(s.getAttribute("price"));
                
                if(cmp==null)
                {
                    s.setAttribute("mistake", "yes");
                    response.sendRedirect("assemble11.jsp");
                }
                ob.insertUpdateGraphicscard(cmp, price, "sinha.aot@gmail.com");
            }
            else
            {
                int price=ob.getGraphicscardPrice(processor);
                ob.insertUpdateGraphicscard(processor, price, "sinha.aot@gmail.com");
            }
            response.sendRedirect("assemble12.jsp");
            }
            else
            {
                if(processor==null)
            {
                String cmp=(String)s.getAttribute("cmpname");            
                int price=(Integer)(s.getAttribute("price"));
                
                if(cmp==null)
                {
                    s.setAttribute("mistake", "yes");
                    response.sendRedirect("assemble11.jsp");
                }
                ob.insertUpdateReviewGraphicscard(cmp, price, "sinha.aot@gmail.com");
            }
            else
            {
                int price=ob.getGraphicscardPrice(processor);
                ob.insertUpdateReviewGraphicscard(processor, price, "sinha.aot@gmail.com");
            }
            response.sendRedirect("your_order.jsp");
            }
        }
    //    processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
