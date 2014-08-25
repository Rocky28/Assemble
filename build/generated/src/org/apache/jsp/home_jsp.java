package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Assemble.net</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html;charset=iso-8859-1\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"home.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"container\">\n");
      out.write("  <!-- Start of Page Header -->\n");
      out.write("  <div id=\"page_header\">\n");
      out.write("    <div id=\"page_heading\">\n");
      out.write("      <h1>ASSEMBLE.NET</h1>\n");
      out.write("      <h2>COME AND ASSEMBLE YOUR PC IN MINUTES</h2>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"page_headerlinks\">\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Account Settings</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Your Assembly</a></li>\n");
      out.write("        <li class=\"last\"><a href=\"http://all-free-download.com/free-website-templates/\">Shopping Cart</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"page_headersearch\">\n");
      out.write("      <h3>Search:</h3>\n");
      out.write("      <form action=\"http://all-free-download.com/free-website-templates/\">\n");
      out.write("        <div>\n");
      out.write("          <input type=\"text\" />\n");
      out.write("          <input type=\"image\" src=\"button_go.gif\" class=\"button\" />\n");
      out.write("          <div class=\"clearthis\">&nbsp;</div>\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"clearthis\">&nbsp;</div>\n");
      out.write("  </div>\n");
      out.write("  <!-- End of Page Header -->\n");
      out.write("  <!-- Start of Page Menu -->\n");
      out.write("  <div id=\"page_menu\">\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("      <li><a href=\"component.jsp\">Components</a></li>\n");
      out.write("      <li><a href=\"assemble.jsp\">Assemble</a></li>\n");
      out.write("      \n");
      out.write("      <li><a href=\"#\">About Us</a></li>\n");
      out.write("      <li class=\"last\"><a href=\"#\">Feedback</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("  <!-- End of Page Menu -->\n");
      out.write("  <!-- Start of Left Sidebar -->\n");
      out.write("  <div id=\"left_sidebar\">\n");
      out.write("    <!-- Start of Newsletter Signup Form -->\n");
      out.write("    <div id=\"newsletter\">\n");
      out.write("      <h2><img src=\"login_button_01.jpg\" width=\"90%\"></h2>\n");
      out.write("      <form action=\"http://all-free-download.com/free-website-templates/\">\n");
      out.write("        <div>\n");
      out.write("          <input type=\"text\" placeholder=\"Username\"/>\n");
      out.write("          <input type=\"text\" placeholder=\"Password\"/>\n");
      out.write("          \n");
      out.write("          <input type=\"image\" src=\"button_ok.gif\" class=\"button\" />\n");
      out.write("          <div class=\"clearthis\">&nbsp;</div>\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("   \n");
      out.write("    </div>\n");
      out.write("    <!-- End of Newsletter Signup Form -->\n");
      out.write("    <!-- Start of Categories Box -->\n");
      out.write("    <div id=\"categories\">\n");
      out.write("      <div id=\"categories_header\">\n");
      out.write("        <h2>Categories</h2>\n");
      out.write("      </div>\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"cabinets.jsp\">Cabinets</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Motherboards</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Processors</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Ram's</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Internal Hard Disks</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">External Hard Disks</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Solid State Disks</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Internal Writers</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">External Writers</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Monitors</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Graphics Card</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Keyboard</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Mouse</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Power Supply Units</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Soundcard</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Speakers</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Webcams</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Ups</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Tv Tuner Cards</a></li>\n");
      out.write("        <li class=\"last\"><a href=\"http://all-free-download.com/free-website-templates/\">Others</a></li>\n");
      out.write("      </ul>\n");
      out.write("      <div class=\"clearthis\">&nbsp;</div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End of Categories Box -->\n");
      out.write("    <!-- Start of Special Offer Box -->\n");
      out.write("    <div id=\"specialoffer\">\n");
      out.write("      <div id=\"specialoffer_text\">\n");
      out.write("        <h2><span>Get Special Offer <strong>Up to 25% off</strong></span></h2>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"specialoffer_link\"> <a href=\"http://all-free-download.com/free-website-templates/\">...Go</a> </div>\n");
      out.write("      <div class=\"clearthis\">&nbsp;</div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End of Special Offer Box -->\n");
      out.write("  </div>\n");
      out.write("  <!-- End of Left Sidebar -->\n");
      out.write("  <!-- Start of Main Content Area -->\n");
      out.write("  <div id=\"main_content\">\n");
      out.write("            <div id=\"cs\">\n");
      out.write("                <h2>Latest Product</h2>\n");
      out.write("                  <iframe src=\"demo2.html\" style=\"width:500px;height:450px;border:0px ;\" scrolling=\"no\"></iframe><br>\n");
      out.write("            \n");
      out.write("                  <h2>New Updates</h2>\n");
      out.write("                  <iframe src=\"demo1.html\" style=\"width:450px;height:100px;border:0px;\" scrolling=\"no\"></iframe>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"cs1\">\n");
      out.write("          <p class=\"phead\">Assemble.net</p><br>\n");
      out.write("          <p>Experience the fastest way of assembling your Desktop</p>\n");
      out.write("          <a href=\"signup.jsp\"><img src=\"sign_up_now_button_-_red.png.jpg\" width=\"70%\"></a> \n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("     \n");
      out.write("      \n");
      out.write("  </div>\n");
      out.write("  <!-- End of Main Content Area -->\n");
      out.write("  <div class=\"clearthis\">&nbsp;</div>\n");
      out.write("  <!-- Start of Page Footer -->\n");
      out.write("  <div id=\"page_footer\">\n");
      out.write("    <div id=\"product_brands\">\n");
      out.write("      <ul>\n");
      out.write("        <li class=\"zalcom\"><span>Zalcom</span></li>\n");
      out.write("        <li class=\"digital\"><span>Digital</span></li>\n");
      out.write("        <li class=\"adept\"><span>Adept</span></li>\n");
      out.write("        <li class=\"simtel\"><span>Simtel</span></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"powered_by\"> Powered by <a href=\"http://www.freewebsitetemplates.com\">Rocky Sinha</a> </div>\n");
      out.write("    <div class=\"clearthis\">&nbsp;</div>\n");
      out.write("  </div>\n");
      out.write("  <!-- End of Page Footer -->\n");
      out.write("</div>\n");
      out.write("<div align=center><a href='http://all-free-download.com/free-website-templates/'></a></div>\n");
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