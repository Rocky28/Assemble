package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class assemble1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"assemble1.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"container\">\n");
      out.write("  <!-- Start of Page Header -->\n");
      out.write("  <div id=\"page_header\">\n");
      out.write("    <div id=\"page_heading\">\n");
      out.write("      <h1><span>ASSEMBLE.NET</span></h1>\n");
      out.write("      <h2><span>COME AND ASSEMBLE YOUR PC IN MINUTES</span></h2>\n");
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
      out.write("      <li><a href=\"http://all-free-download.com/free-website-templates/\">Services</a></li>\n");
      out.write("      <li><a href=\"http://all-free-download.com/free-website-templates/\">Promotion</a></li>\n");
      out.write("      <li class=\"last\"><a href=\"http://all-free-download.com/free-website-templates/\">Contact</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("       \n");
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
      out.write("  <div id=\"assemble1\">\n");
      out.write("      <p class=\"p1\">Choose your Cabinet : </p>\n");
      out.write("      <form>\n");
      out.write("          <table>\n");
      out.write("             <tr><td><select name=\"\">\n");
      out.write("                        <option value=\"default\">Choose Your Item</option>\n");
      out.write("                        <option value=\"COOLER MASTER HAF 912 COMBAT MID TOWER CABINET\">COOLER MASTER HAF 912 COMBAT MID TOWER CABINET</option>\n");
      out.write("                        <option value=\"COOLER MASTER N300 NSE-300-KKN1 MID TOWER CABINET\">COOLER MASTER N300 NSE-300-KKN1 MID TOWER CABINET</option>\n");
      out.write("                        <option value=\"COOLER MASTER HAFXM MID TOWER CABINET\">COOLER MASTER HAF 912 COMBAT TRANSPERENT SIDE PANEL MTC</option>\n");
      out.write("                        <option value=\"COOLER MASTER HAFXM MID TOWER CABINET\">COOLER MASTER HAFXM MID TOWER CABINET</option>\n");
      out.write("                        <option value=\"COOLER MASTER STRYKER FULL TOWER CABINET\">COOLER MASTER STRYKER FULL TOWER CABINET</option>\n");
      out.write("                        <option value=\"COOLER MASTER ELITE 431 PLUS MID TOWER CABINET\">COOLER MASTER ELITE 431 PLUS MID TOWER CABINET</option>\n");
      out.write("                        <option value=\"COOLER MASTER ENFORCER MID TOWER CABINET\">COOLER MASTER ENFORCER MID TOWER CABINET</option>\n");
      out.write("                        <option value=\"COOLER MASTER K281 MID TOWER CABINET\">COOLER MASTER K281 MID TOWER CABINET</option>\n");
      out.write("                        <option value=\"COOLER MASTER CM STORM SCOUT 2 N2(GUNMETAL GREY) SGC-2100-GWN2 CABINET\">COOLER MASTER CM STORM SCOUT 2 N2(GUNMETAL GREY) SGC-2100-GWN2 CABINET</option>\n");
      out.write("                        <option value=\"COOLER MASTER STORM SCOUT 2 MID TOWER CABINET\">COOLER MASTER STORM SCOUT 2 MID TOWER CABINET</option>\n");
      out.write("                        <option value=\"COOLER MASTER HAF XB FULL TOWER CABINET\">COOLER MASTER HAF XB FULL TOWER CABINET</option>\n");
      out.write("                        <option value=\"COOLER MASTER TROOPER\">COOLER MASTER TROOPER</option>\n");
      out.write("                        <option value=\"COOLER MASTER HAF XB RC-902XB-KWNI CABINET\">COOLER MASTER HAF XB RC-902XB-KWNI CABINET</option>\n");
      out.write("                        <option value=\"COOLER MASTER ELITE 372 USB 3.0 VERSION WITH 400W PSU RC-372-KKR400-U3 CABINET\">COOLER MASTER ELITE 372 USB 3.0 VERSION WITH 400W PSU RC-372-KKR400-U3 CABINET</option>\n");
      out.write("                        <option value=\"COOLER MASTER CM STORM SCOUT 2 ADVANCED SGC-210-WW1-(GHOST WHITE) CABINET\">COOLER MASTER CM STORM SCOUT 2 ADVANCED SGC-210-WW1-(GHOST WHITE) CABINET</option>\n");
      out.write("                        <option value=\"COOLER MASTER CM STORM SCOUT 2 N2 (BLACK)SGC-2100-KWN2 CABINET\">COOLER MASTER CM STORM SCOUT 2 N2 (BLACK)SGC-2100-KWN2 CABINET</option>\n");
      out.write("                        <option value=\"ANTEC X1 GAMING CASE(BLACK)\">ANTEC X1 GAMING CASE(BLACK)</option>\n");
      out.write("                        <option value=\"ANTEC CSK3000 NEW SOLUTION SERIES CABINET(BLACK)\">ANTEC CSK3000 NEW SOLUTION SERIES CABINET(BLACK)</option>\n");
      out.write("                        <option value=\"ANTEC ISK 310-150 BLACK MINI-ITX DESKTOP COMPUTER CASE(SILVER&BLACK)\">ANTEC ISK 310-150 BLACK MINI-ITX DESKTOP COMPUTER CASE(SILVER&BLACK)</option>\n");
      out.write("                        <option value=\"ANTEC ISK110 VESA MINI-ITX CASE(BLACK)\">ANTEC ISK110 VESA MINI-ITX CASE(BLACK)</option>\n");
      out.write("                        <option value=\"ANTEC ISK300-150 CABINET(BLACK)\">ANTEC ISK300-150 CABINET(BLACK)</option>\n");
      out.write("                        <option value=\"ANTEC GX700 GAMING CASE(BLACK)\">ANTEC GX700 GAMING CASE(BLACK)</option>\n");
      out.write("                        <option value=\"ANTEC 900 2 V3 MID TOWER GAMING CASE(BLACK)\">ANTEC 900 2 V3 MID TOWER GAMING CASE(BLACK)</option>\n");
      out.write("                        <option value=\"ANTEC ONE S3 MID TOWER GAMING CASE(BLACK)\">ANTEC ONE S3 MID TOWER GAMING CASE(BLACK)</option>\n");
      out.write("                        <option value=\"ANTEC SKELETON OPEN AIR CASE(BLACK)\">ANTEC SKELETON OPEN AIR CASE(BLACK)</option>\n");
      out.write("                        <option value=\"ANTEC 1100 GAMING CASE(BLACK)\">ANTEC 1100 GAMING CASE(BLACK)</option>\n");
      out.write("                        <option value=\"ANTEC P280 PERFORMANCE ONE SEIRIES CABINET(BLACK)\">ANTEC P280 PERFORMANCE ONE SEIRIES CABINET(BLACK)</option>\n");
      out.write("                        <option value=\"ANTEC 1200 GAMING CASE(BLACK)\">ANTEC 1200 GAMING CASE(BLACK)</option>\n");
      out.write("                        <option value=\"ANTEC 302 MID TOWER GAKMING CASE(BLACK)\">ANTEC 302 MID TOWER GAKMING CASE(BLACK)</option>\n");
      out.write("                        <option value=\"ANTEC DF-85-AP FULL TOWER CASE(BLACK)\">ANTEC DF-85-AP FULL TOWER CASE(BLACK)</option>\n");
      out.write("                        <option value=\"ANTEC TITAN 650 SERVER CASE(BLACK)\">ANTEC TITAN 650 SERVER CASE(BLACK)</option>\n");
      out.write("                        <option value=\"LIVE TECH CABINET MUMBAI WITH SMPS\">LIVE TECH CABINET MUMBAI WITH SMPS</option>\n");
      out.write("                        <option value=\"LIVE TECH CABINET NEW DELHI WITH SMPS\">LIVE TECH CABINET NEW DELHI WITH SMPS</option>\n");
      out.write("                     </select>\n");
      out.write("            </td></tr> \n");
      out.write("             <tr><td><input type=\"submit\" value=\"Preview\"></td><td><input type=\"image\" src=\"success.png\"></td></tr>\n");
      out.write("              \n");
      out.write("          </table>\n");
      out.write("      </form>\n");
      out.write("      \n");
      out.write("  </div>\n");
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
      out.write("\n");
      out.write("<div align=center><a href='http://all-free-download.com/free-website-templates/'></a></div>\n");
      out.write("        </div></body>\n");
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
