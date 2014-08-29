<%@page import="java.sql.ResultSet"%>
<%@page import="Assemble.AssembleBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Assemble.net(use)</title>
        <meta http-equiv="Content-Type" content="text/html;charset=iso-8859-1" />
<link rel="stylesheet" href="assemble1.css" type="text/css" media="screen" />
    </head>
    <body>
        <div id="container">
  <!-- Start of Page Header -->
  <div id="page_header">
    <div id="page_heading">
      <h1><span>ASSEMBLE.NET</span></h1>
      <h2><span>COME AND ASSEMBLE YOUR PC IN MINUTES</span></h2>
    </div>
    <div id="page_headerlinks">
      <ul>
        <li><a href="http://all-free-download.com/free-website-templates/">Account Wish</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">List Order</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Status</a></li>
        <li class="last"><a href="http://all-free-download.com/free-website-templates/">Shopping Cart</a></li>
      </ul>
    </div>
    <div id="page_headersearch">
      <h3>Search:</h3>
      <form action="http://all-free-download.com/free-website-templates/">
        <div>
          <input type="text" />
          <input type="image" src="button_go.gif" class="button" />
          <div class="clearthis">&nbsp;</div>
        </div>
      </form>
    </div>
    <div class="clearthis">&nbsp;</div>
  </div>
  <!-- End of Page Header -->
  <!-- Start of Page Menu -->
  <div id="page_menu">
    <ul>
      <li><a href="http://all-free-download.com/free-website-templates/">Home</a></li>
      <li><a href="http://all-free-download.com/free-website-templates/">Our Store</a></li>
      <li><a href="http://all-free-download.com/free-website-templates/">Products</a></li>
      <li><a href="http://all-free-download.com/free-website-templates/">Services</a></li>
      <li><a href="http://all-free-download.com/free-website-templates/">Promotion</a></li>
      <li class="last"><a href="http://all-free-download.com/free-website-templates/">Contact</a></li>
    </ul>
  </div>
       
  <!-- End of Page Menu -->
  <!-- Start of Left Sidebar -->
  <div id="left_sidebar">
    <!-- Start of Newsletter Signup Form -->
    <div id="newsletter">
      <h2>Newsletter Signup!</h2>
      <form action="http://all-free-download.com/free-website-templates/">
        <div>
          <input type="text" placeholder="Username"/>
          <input type="text" placeholder="Password"/>
          <input type="image" src="button_ok.gif" class="button" />
          <div class="clearthis">&nbsp;</div>
        </div>
      </form>
      <div id="link_cancel"> <a href="http://all-free-download.com/free-website-templates/">Cancel Subscription</a> </div>
    </div>
    <!-- End of Newsletter Signup Form -->
    <!-- Start of Categories Box -->
    <div id="categories">
      <div id="categories_header">
        <h2>Categories</h2>
      </div>
      <ul>
        <li><a href="http://all-free-download.com/free-website-templates/">Cables</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Cameras</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Input Devices</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Memory</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Printers</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Scanners</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Server Accessories</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Speakers &amp; Audio</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Speakers &amp; Audio</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Speakers &amp; Audio</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Speakers &amp; Audio</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Speakers &amp; Audio</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Speakers &amp; Audio</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Speakers &amp; Audio</a></li>
        <li class="last"><a href="http://all-free-download.com/free-website-templates/">Wireless</a></li>
      </ul>
      <div class="clearthis">&nbsp;</div>
    </div>
    <!-- End of Categories Box -->
    <!-- Start of Special Offer Box -->
    <div id="specialoffer">
      <div id="specialoffer_text">
        <h2><span>Get Special Offer <strong>Up to 25% off</strong></span></h2>
      </div>
      <div id="specialoffer_link"> <a href="http://all-free-download.com/free-website-templates/">...Go</a> </div>
      <div class="clearthis">&nbsp;</div>
    </div>
    <!-- End of Special Offer Box -->
  </div>
  <!-- End of Left Sidebar -->
  <div id="assemble1">
      <p class="p1">Choose your Webcam : </p>
      <form action="selwebcam" method="post">
          <table>
             <tr><td><select name="choosewebcam">
                        <option value="default">Choose Your Item</option>
                        <option value="HP HD-3100 WEBCAM">HP HD-3100 WEBCAM</option>
                        <option value="HP WEBCAM 1300">HP WEBCAM 1300</option>
                        <option value="HP QP896AA WEBCAM(BLACK)">HP QP896AA WEBCAM(BLACK)</option>
                        <option value="HP DELUX WEBCAM">HP DELUX WEBCAM</option>
                        <option value="HP DELUX WEBCAM">HP DELUX WEBCAM</option>
                        <option value="HP WEBCAM HD 2300">HP WEBCAM HD 2300</option>
                        <option value="LOGITECH HD WEBCAM C270">LOGITECH HD WEBCAM C270</option>
                        <option value="LOGITECH C170 WEBCAM(BLACK)">LOGITECH C170 WEBCAM(BLACK)</option>
                        <option value="LOGITECH C310 HD WEBCAM(BLACK)">LOGITECH C310 HD WEBCAM(BLACK)</option>
                        <option value="LOGITECH C270H HD WEBCAM(WITH HEADPHONE)">LOGITECH C270H HD WEBCAM(WITH HEADPHONE)</option>
                        <option value="LOGITECH HD PRO C920 WEBCAM">LOGITECH HD PRO C920 WEBCAM</option>
                        <option value="LOGITECH HD WEBCAM C525">LOGITECH HD WEBCAM C525</option>
                        <option value="LOGITECH SPHERE AFWEBCAM(BLACK)">LOGITECH SPHERE AFWEBCAM(BLACK)</option>
                        <option value="LOGITECH BCC950 WEBCAM(BLACK)">LOGITECH BCC950 WEBCAM(BLACK)</option>
                        <option value="LOGITECH C120 WEBCAM(DARK GREY)">LOGITECH C120 WEBCAM(DARK GREY)</option>
                        <option value="LOGITECH HD WEBCAM C615">LOGITECH HD WEBCAM C615</option>
                        <option value="LOGITECH PRO 9000 WEBCAM(BLACK)">LOGITECH PRO 9000 WEBCAM(BLACK)</option>
                        <option value="LOGITECH C110 WEBCAM(GREY)">LOGITECH C110 WEBCAM(GREY)</option>
                        <option value="LOGITECH C110 WEBCAM(WHITE)">LOGITECH C110 WEBCAM(WHITE)</option>
                     </select>
            </td></tr> 
             <tr><td><input name="s1" type="submit" value="Preview"></td><td><a href="assemble18.jsp">Skip this one</a></td><td><input type="image" src="success.png" name="s2" value="success"></td></tr>
              
          </table>
      </form>
      
  </div>
  <div id="preview"><% HttpSession s=request.getSession(true);String type=(String)s.getAttribute("type"); AssembleBean ob=new AssembleBean();ResultSet rs=ob.getTypeResults(type,"Webcam"); while(rs.next()){%>
      <img src="<% out.println(rs.getString(5));%>">
          <h2><% out.println(rs.getString(2));%></h2>
          <h2 class="money"><% out.println(rs.getInt(3));%></h2>
          <a href="<% out.println(rs.getString(6));%>">Click to view full description of the product</a>
      <% } %></div>
   <!-- Start of Page Footer -->
  <div id="page_footer">
    <div id="product_brands">
      <ul>
        <li class="zalcom"><span>Zalcom</span></li>
        <li class="digital"><span>Digital</span></li>
        <li class="adept"><span>Adept</span></li>
        <li class="simtel"><span>Simtel</span></li>
      </ul>
    </div>
    <div id="powered_by"> Powered by <a href="http://www.freewebsitetemplates.com">Rocky Sinha</a> </div>
    <div class="clearthis">&nbsp;</div>
  </div>
  <!-- End of Page Footer -->

<div align=center><a href='http://all-free-download.com/free-website-templates/'></a></div>
        </div></body>
</html>