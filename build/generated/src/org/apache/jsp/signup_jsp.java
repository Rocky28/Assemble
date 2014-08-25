package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("    <section class=\"register\">\n");
      out.write("      <h1>Register on Assemble.com</h1>\n");
      out.write("      <form method=\"post\" action=\"index.html\">\n");
      out.write("      <div class=\"reg_section personal_info\">\n");
      out.write("      <h3>Your Personal Information</h3>\n");
      out.write("      <input type=\"text\" name=\"username\" value=\"\" placeholder=\"Your Desired Username\">\n");
      out.write("      <input type=\"text\" name=\"email\" value=\"\" placeholder=\"Your E-mail Address\">\n");
      out.write("      <input type=\"text\" name=\"email\" value=\"\" placeholder=\"Your E-mail Address\">\n");
      out.write("      <input type=\"text\" name=\"email\" value=\"\" placeholder=\"Your E-mail Address\">\n");
      out.write("      <input type=\"text\" name=\"email\" value=\"\" placeholder=\"Your E-mail Address\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"reg_section password\">\n");
      out.write("      <h3>Your Password</h3>\n");
      out.write("      <input type=\"password\" name=\"password\" value=\"\" placeholder=\"Your Password\">\n");
      out.write("      <input type=\"password\" name=\"confirm\" value=\"\" placeholder=\"Confirm Password\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"reg_section password\">\n");
      out.write("      <h3>Your Address</h3>\n");
      out.write("      <select>\n");
      out.write("        <option value=\"\">Egypt</option>\n");
      out.write("        <option value=\"\">Palastine</option>\n");
      out.write("        <option value=\"\">Syria</option>\n");
      out.write("        <option value=\"\">Italy</option>\n");
      out.write("      </select>\n");
      out.write("      \n");
      out.write("      </div>\n");
      out.write("      <p class=\"terms\">\n");
      out.write("        <label>\n");
      out.write("          <input type=\"checkbox\" name=\"remember_me\" id=\"remember_me\">\n");
      out.write("           I accept  <a href=\"http://www.imomen.com/\">Assemble</a> Terms & Condition\n");
      out.write("        </label>\n");
      out.write("      </p>\n");
      out.write("      <p class=\"submit\"><input type=\"submit\" name=\"commit\" value=\"Sign Up\"></p>\n");
      out.write("      </form>\n");
      out.write("    </section>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
