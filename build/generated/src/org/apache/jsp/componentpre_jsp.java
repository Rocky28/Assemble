package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class componentpre_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Assemble.net(use)</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html;charset=iso-8859-1\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"component.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"container\">\n");
      out.write("  <!-- Start of Page Header -->\n");
      out.write("  <div id=\"page_header\">\n");
      out.write("    <div id=\"page_heading\">\n");
      out.write("      <h1><span>ASSEMBLE.NET</span></h1>\n");
      out.write("      <h2><span>COME AND ASSEMBLE YOUR PC IN MINUTES</span></h2>");
 HttpSession s=request.getSession(true); 
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div id=\"page_headerlinks\">\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Account Wish</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">List Order</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Status</a></li>\n");
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
      out.write("      <li><a href=\"http://all-free-download.com/free-website-templates/\">Home</a></li>\n");
      out.write("      <li><a href=\"http://all-free-download.com/free-website-templates/\">Our Store</a></li>\n");
      out.write("      <li><a href=\"http://all-free-download.com/free-website-templates/\">Products</a></li>\n");
      out.write("     \n");
      out.write("      <li><a href=\"http://all-free-download.com/free-website-templates/\">Promotion</a></li>\n");
      out.write("      <li class=\"last\"><a href=\"http://all-free-download.com/free-website-templates/\">Contact</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("  <!-- End of Page Menu -->\n");
      out.write("  <!-- Start of Left Sidebar -->\n");
      out.write("  <div id=\"left_sidebar\">\n");
      out.write("    <!-- Start of Newsletter Signup Form -->\n");
      out.write("    <div id=\"newsletter\">\n");
      out.write("      <h2>Newsletter Signup!</h2>\n");
      out.write("      <form action=\"http://all-free-download.com/free-website-templates/\">\n");
      out.write("        <div>\n");
      out.write("          <input type=\"text\" placeholder=\"Username\"/>\n");
      out.write("          <input type=\"text\" placeholder=\"Password\"/>\n");
      out.write("          <input type=\"image\" src=\"button_ok.gif\" class=\"button\" />\n");
      out.write("          <div class=\"clearthis\">&nbsp;</div>\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("      <div id=\"link_cancel\"> <a href=\"http://all-free-download.com/free-website-templates/\">Cancel Subscription</a> </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End of Newsletter Signup Form -->\n");
      out.write("    <!-- Start of Categories Box -->\n");
      out.write("    <div id=\"categories\">\n");
      out.write("      <div id=\"categories_header\">\n");
      out.write("        <h2>Categories</h2>\n");
      out.write("      </div>\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Cables</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Cameras</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Input Devices</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Memory</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Printers</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Scanners</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Server Accessories</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Speakers &amp; Audio</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Speakers &amp; Audio</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Speakers &amp; Audio</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Speakers &amp; Audio</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Speakers &amp; Audio</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Speakers &amp; Audio</a></li>\n");
      out.write("        <li><a href=\"http://all-free-download.com/free-website-templates/\">Speakers &amp; Audio</a></li>\n");
      out.write("        <li class=\"last\"><a href=\"http://all-free-download.com/free-website-templates/\">Wireless</a></li>\n");
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
      out.write("  <!-- Start of component part -->\n");
      out.write("        <div id=\"compo\">\n");
      out.write("            <form name=\"compn\" action=\"getcompo\" method=\"post\">\n");
      out.write("                <table>\n");
      out.write("                    <tr><td width=\"40%\"><select name=\"cmp\">\n");
      out.write("                                <option name=\"hjfj\">Select your component</option>\n");
      out.write("                                <option name=\"hjfj\">Cabinets</option>\n");
      out.write("                                <option name=\"hjfj\">Motherboards</option>\n");
      out.write("                                <option name=\"hjfj\">Processors</option>\n");
      out.write("                                <option name=\"hjfj\">Ram's</option>\n");
      out.write("                                <option name=\"hjfj\">Internal Hdd's</option>\n");
      out.write("                                <option name=\"hjfj\">External Hdd's</option>\n");
      out.write("                                <option name=\"hjfj\">Ssd's</option>\n");
      out.write("                                <option name=\"hjfj\">Internal Writer</option>\n");
      out.write("                                <option name=\"hjfj\">External Writer</option>\n");
      out.write("                                <option name=\"hjfj\">Monitor</option>\n");
      out.write("                                <option name=\"hjfj\">Graphics Card</option>\n");
      out.write("                                <option name=\"hjfj\">Keyboard</option>\n");
      out.write("                                <option name=\"hjfj\">Mouse</option>\n");
      out.write("                                <option name=\"hjfj\">Psu's</option>\n");
      out.write("                                <option name=\"hjfj\">Sound Card</option>\n");
      out.write("                                <option name=\"hjfj\">Speaker</option>\n");
      out.write("                                <option name=\"hjfj\">Webcam</option>\n");
      out.write("                                <option name=\"hjfj\">Ups</option>\n");
      out.write("                                <option name=\"hjfj\">Tv Tuner Card</option>\n");
      out.write("                            </select></td><td width=\"40%\"><select name=\"ven\">\n");
      out.write("                                    <option name=\"hdjas\">Select your price range</option>\n");
      out.write("                                    <option name=\"hdjas\">Less than Rs.1000</option>\n");
      out.write("                                    <option name=\"hdjas\">1000-3000</option>\n");
      out.write("                                    <option name=\"hdjas\">3000-7000</option>\n");
      out.write("                                    <option name=\"hdjas\">7000-12000</option>\n");
      out.write("                                    <option name=\"hdjas\">12000-20000</option>\n");
      out.write("                                </select></td></tr>\n");
      out.write("                    <tr><td><input type=\"image\" src=\"next.jpg\"></td></tr>\n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <div id=\"preview\">\n");
      out.write("      <h1>Preview</h1>\n");
      out.write("      ");
 int count=Integer.parseInt((String)s.getAttribute("count")); for(int i=0;i<count;i++) { 
      out.write("\n");
      out.write("          <img src=\"images/cooler-master-gx-550w-100x100-imad67hgdtmdnzgz.jpeg\">\n");
      out.write("          <h2>SEAGATE BARRACUDA 1TB DESKTOP INTERNAL HDD</h2>\n");
      out.write("          <h2 class=\"money\">Rs. 5000</h2>\n");
      out.write("          <a href=\"");

      out.write("\">Click to view full description in flipkart.com</a>");
 } 
      out.write("\n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write("  <!-- End of component part -->\n");
      out.write("   <!-- Start of Page Footer -->\n");
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
      out.write("</html>");
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