package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class assemble4_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("      <p class=\"p1\">Choose your Monitor : </p>\n");
      out.write("      <form>\n");
      out.write("          <table>\n");
      out.write("             <tr><td><select name=\"\">\n");
      out.write("                        <option name=\"default\">Choose Your Item</option>\n");
      out.write("                        <option name=\"DELL S2240L 21.5 INCH LED BACKLIT LCD MONITOR(BLACK)\">DELL S2240L 21.5 INCH LED BACKLIT LCD MONITOR(BLACK)</option>\n");
      out.write("                        <option name=\"DELL INI1930 18.5 INCH LED BACKLIT LCD MONITOR\">DELL INI1930 18.5 INCH LED BACKLIT LCD MONITOR</option>\n");
      out.write("                        <option name=\"DELL E19113S 19 INCH LED BACKLIT LCD MONITOR(BLACK)\">DELL E19113S 19 INCH LED BACKLIT LCD MONITOR(BLACK)</option>\n");
      out.write("                        <option name=\"DELL E1713S 17INCH LED BACKLIT LCD MONITOR(BLACK)\">DELL E1713S 17INCH LED BACKLIT LCD MONITOR(BLACK)</option>\n");
      out.write("                        <option name=\"DELL IN2030M 20 INCH LED BACKLIT LCD MONITOR\">DELL IN2030M 20 INCH LED BACKLIT LCD MONITOR</option>\n");
      out.write("                        <option name=\"DELL S2440L 24 INCH LED BACKLIT LCD MONITOR(BLACK)\">DELL S2440L 24 INCH LED BACKLIT LCD MONITOR(BLACK)</option>\n");
      out.write("                        <option name=\"DELL 1914H 18.5 INCH LED BACKLIT LCD MONITOR\">DELL 1914H 18.5 INCH LED BACKLIT LCD MONITOR</option>\n");
      out.write("                        <option name=\"DELL E2014H 19.45 INCH LED BACKLIT LCD MONITOR\">DELL E2014H 19.45 INCH LED BACKLIT LCD MONITOR</option>\n");
      out.write("                        <option name=\"DELL 23 INCH LED BACKLIT LCD - S2340 MONITOR\">DELL 23 INCH LED BACKLIT LCD - S2340 MONITOR</option>\n");
      out.write("                        <option name=\"HP W2371D 23 INCH DIAGONAL IPS LED BACKLIT MONITOR(BLACK)\">HP W2371D 23 INCH DIAGONAL IPS LED BACKLIT MONITOR(BLACK)</option>\n");
      out.write("                        <option name=\"AOC E1670SWU 15.6 WIDE LED MONITOR(BLACK)\">AOC E1670SWU 15.6 WIDE LED MONITOR(BLACK)</option>\n");
      out.write("                        <option name=\"AOC E2060SN 20 INCH LED MONITOR(BLACK)\">AOC E2060SN 20 INCH LED MONITOR(BLACK)</option>\n");
      out.write("                        <option name=\"LG 22MN33 23.6 INCH 2-IN-1 MONITOR CUM IPS PERSONAL TV(BLACK)\">LG 22MN33 23.6 INCH 2-IN-1 MONITOR CUM IPS PERSONAL TV(BLACK)</option>\n");
      out.write("                        <option name=\"LG 19EN33S 18.5 INCH LED MONITOR(BLACK)\">LG 19EN33S 18.5 INCH LED MONITOR(BLACK)</option>\n");
      out.write("                        <option name=\"LG 20EN33TS 19.5 INCH LED MONITOR(BLACK)\">LG 20EN33TS 19.5 INCH LED MONITOR(BLACK)</option>\n");
      out.write("                        <option name=\"LG 22EA53V 22 INCH IPS LED MONITOR(BLACK)\">LG 22EA53V 22 INCH IPS LED MONITOR(BLACK)</option>\n");
      out.write("                        <option name=\"LG 23EA53V 23 INCH IPS LED MONITOR(BLACK)\">LG 23EA53V 23 INCH IPS LED MONITOR(BLACK)</option>\n");
      out.write("                        <option name=\"LG 22MA33 21.6 INCH 2-IN-1 MONITOR CUM PERSONAL TV(BLACK)\">LG 22MA33 21.6 INCH 2-IN-1 MONITOR CUM PERSONAL TV(BLACK)</option>\n");
      out.write("                        <option name=\"LG 22EN33T 21.5 INCH LED MONITOR(BALCK)\">LG 22EN33T 21.5 INCH LED MONITOR(BALCK)</option>\n");
      out.write("                        <option name=\"LG 24EA53VQ 24 INCH IPS LED MONITOR(BALCK)\">LG 24EA53VQ 24 INCH IPS LED MONITOR(BALCK)</option>\n");
      out.write("                        <option name=\"LG 29EA93 29 INCH IPS LED ULTRA WIDE MONITOR(BLACK & WHITE)\">LG 29EA93 29 INCH IPS LED ULTRA WIDE MONITOR(BLACK & WHITE)</option>\n");
      out.write("                        <option name=\"LG 27EA53V 27 INCH IPS LED MONITOR(BLACK)\">LG 27EA53V 27 INCH IPS LED MONITOR(BLACK)</option>\n");
      out.write("                        <option name=\"AOC E970SWNL 18.5 INCH LED MONITOR(BLACK)\">AOC E970SWNL 18.5 INCH LED MONITOR(BLACK)</option>\n");
      out.write("                        <option name=\"AOC E2262VWH 21.5 INCH LED MONITOR(BLACK)\">AOC E2262VWH 21.5 INCH LED MONITOR(BLACK)</option>\n");
      out.write("                        <option name=\"AOC E2260WN 21.5 INCH LED MONITOR(BLACK)\">AOC E2260WN 21.5 INCH LED MONITOR(BLACK)</option>\n");
      out.write("                        <option name=\"AOC E246VWH 23.6 INCH LED MONITOR(BLACK)\">AOC E246VWH 23.6 INCH LED MONITOR(BLACK)</option>\n");
      out.write("                        <option name=\"HP PAVILION 20F1 20 INCH DIAGONAL IPS LED BACKLIT MONITOR\">HP PAVILION 20F1 20 INCH DIAGONAL IPS LED BACKLIT MONITOR</option>\n");
      out.write("                        <option name=\"AOC E2352PHZ 3D LED MONITOR\">AOC E2352PHZ 3D LED MONITOR</option>\n");
      out.write("                        <option name=\"SAMSUNG S20B300B 20 INCH LED MONITOR\">SAMSUNG S20B300B 20 INCH LED MONITOR</option>\n");
      out.write("                        <option name=\"HP PAVALLIO 25X125 INCH DIAGONAL IPS LED BACKLIT MONITOR\">HP PAVALLIO 25X125 INCH DIAGONAL IPS LED BACKLIT MONITOR</option>\n");
      out.write("                        <option name=\"LG MONITOR 16INCH LED(E1641) MONITOR\">LG MONITOR 16INCH LED(E1641) MONITOR</option>\n");
      out.write("                        <option name=\"SAMSUNG SA100 15.6 INCHES LED MONITOR\">SAMSUNG SA100 15.6 INCHES LED MONITOR</option>\n");
      out.write("                        <option name=\"SAMSUNG S22B370H 21.5 INCH LED MONITOR\">SAMSUNG S22B370H 21.5 INCH LED MONITOR</option>\n");
      out.write("                        <option name=\"AOC I2267FWH 22INCH WIDE IPS MONITOR(BLACK)\">AOC I2267FWH 22INCH WIDE IPS MONITOR(BLACK)</option>\n");
      out.write("                        <option name=\"LG 2041T 20 INCH LED MONITOR\">LG 2041T 20 INCH LED MONITOR</option>\n");
      out.write("                        <option name=\"SAMSUNG S20A300 20 INCH LED MONITOR\">SAMSUNG S20A300 20 INCH LED MONITOR</option>\n");
      out.write("                        <option name=\"SAMSUNG S16A100N 15.3 INCH LED MONITOR\">SAMSUNG S16A100N 15.3 INCH LED MONITOR</option>\n");
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
