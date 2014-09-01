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
      <p class="p1">Choose your Ram : </p>
      <form action="selram" method="post">
          <table>
             <tr><td><select name="chooseram">
                        <option value="default">Choose Your Item</option>
                        <option value="KINGSTON HYPERX DDR3 8GB(1x8)GB PC RAM">KINGSTON HYPERX DDR3 8GB(1x8)GB PC RAM</option>
                        <option value="KINGSTON VALUE RAM DDR3 4GB PC RAM">KINGSTON VALUE RAM DDR3 4GB PC RAM</option>
                        <option value="KINGSTON HYPERX BLU DDR3 4GB PC RAM">KINGSTON HYPERX BLU DDR3 4GB PC RAM</option>
                        <option value="KINGSTON DDR2 2GB PC RAM">KINGSTON DDR2 2GB PC RAM</option>
                        <option value="KINGSTON VALUE RAM DDR3 2GB PC RAM">KINGSTON VALUE RAM DDR3 2GB PC RAM</option>
                        <option value="KINGSTON DDR2 1GB PC RAM">KINGSTON DDR2 1GB PC RAM</option>
                        <option value="KINGSTON VALUE RAM DDR2 1GB PC RAM">KINGSTON VALUE RAM DDR2 1GB PC RAM</option>
                        <option value="KINGSTON DDR2 1GB PC RAM">KINGSTON DDR2 1GB PC RAM</option>
                        <option value="KINGSTON HYPERX DDR3 8GB(2x4)GB PC RAM">KINGSTON HYPERX DDR3 8GB(2x4)GB PC RAM</option>
                        <option value="KINGSTON HYPERX BLU DDR3 2GB PC RAM">KINGSTON HYPERX BLU DDR3 2GB PC RAM</option>
                        <option value="KINGSTON HYPERX DDR3 4GB(1x4)GB PC RAM">KINGSTON HYPERX DDR3 4GB(1x4)GB PC RAM</option>
                        <option value="KINGSTON DDR3 4GB SERVER RAM">KINGSTON DDR3 4GB SERVER RAM</option>
                        <option value="KINGSTON DDR3 4GB SERVER RAM">KINGSTON DDR3 4GB SERVER RAM</option>
                        <option value="KINGSTON HYPERX BLU DDR3 4GB PC RAM">KINGSTON HYPERX BLU DDR3 4GB PC RAM</option>
                        <option value="KINGSTON HYPERX BEAST DDR3 16GB PC RAM">KINGSTON HYPERX BEAST DDR3 16GB PC RAM</option>
                        <option value="KINGSTON XMP PREDATOR DDR3 8GB PC RAM">KINGSTON XMP PREDATOR DDR3 8GB PC RAM</option>
                        <option value="KINGSTON DDR3 8GB PC RAM">KINGSTON DDR3 8GB PC RAM</option>
                        <option value="KINGSTON HYPERX BEAST DDR3 16GB PC RAM">KINGSTON HYPERX BEAST DDR3 16GB PC RAM</option>
                        <option value="KINGSTON DDR2 1GB SERVER RAM">KINGSTON DDR2 1GB SERVER RAM</option>
                        <option value="KINGSTON HYPERX DDR3 6GB(2x3)GB PC RAM">KINGSTON HYPERX DDR3 6GB(2x3)GB PC RAM</option>
                        <option value="KINGSTON XMP HYPERX RED DDR3 8GB PC RAM">KINGSTON XMP HYPERX RED DDR3 8GB PC RAM</option>
                        <option value="KINGSTON HYPERX BLU DDR3 4GB PC RAM">KINGSTON HYPERX BLU DDR3 4GB PC RAM</option>
                        <option value="KINGSTON XMP BEAST DDR3 8GB PC RAM">KINGSTON XMP BEAST DDR3 8GB PC RAM</option>
                        <option value="KINGSTON HYPERX BLU DDR3 16GB PC RAM">KINGSTON HYPERX BLU DDR3 16GB PC RAM</option>
                        <option value="CORSAIR VENGANCE DDR3 4GB(1x4)GB PC RAM">CORSAIR VENGANCE DDR3 4GB(1x4)GB PC RAM</option>
                        <option value="CORSAIR VENGANCE DDR3 8GB(1x8)GB PC RAM">CORSAIR VENGANCE DDR3 8GB(1x8)GB PC RAM</option>
                        <option value="CORSAIR DDR3 4GB(1x4)GB PC RAM">CORSAIR DDR3 4GB(1x4)GB PC RAM</option>
                        <option value="CORSAIR VENGENCE DDR3 8GB(2x4)GB PC RAM(RED)">CORSAIR VENGENCE DDR3 8GB(2x4)GB PC RAM(RED)</option>
                        <option value="CORSAIR DDR3 2GB(1x2)GB PC RAM">CORSAIR DDR3 2GB(1x2)GB PC RAM</option>
                        <option value="CORSAIR DDR3 4GB(1x4)GB PC RAM">CORSAIR DDR3 4GB(1x4)GB PC RAM</option>
                        <option value="CORSAIR DDR3 4GB(1x4)GB PC RAM">CORSAIR DDR3 4GB(1x4)GB PC RAM</option>
                        <option value="CORSAIR XMS3 DDR3 8GB(1x8)GB RAM">CORSAIR XMS3 DDR3 8GB(1x8)GB RAM</option>
                        <option value="CORSAIR VENGENCE DDR3 8GB(2x4)GB PC RAM(RED)">CORSAIR VENGENCE DDR3 8GB(2x4)GB PC RAM(RED)</option>
                        <option value="CORSAIR VENGENCE DDR3 16GB(2x8)GB PC RAM(RED)">CORSAIR VENGENCE DDR3 16GB(2x8)GB PC RAM(RED)</option>
                        <option value="CORSAIR VENGENCE DDR3 8GB(2x4)GB PC RAM(BLUE)">CORSAIR VENGENCE DDR3 8GB(2x4)GB PC RAM(BLUE)</option>
                        <option value="CORSAIR VENGENCE DDR3 16GB(2x8)GB PC RAM(RED)">CORSAIR VENGENCE DDR3 16GB(2x8)GB PC RAM(RED)</option>
                        <option value="CORSAIR XMS3 DDR3 4GB(1X4)GB PC RAM">CORSAIR XMS3 DDR3 4GB(1X4)GB PC RAM</option>                       
                     </select>
            </td></tr> 
             <tr><td><input type="submit" value="Preview" name="s1"></td><% HttpSession s=request.getSession(true); String from=(String)s.getAttribute("from"); if(from==null){%><td><a href="assemble6.jsp">Skip This One</a></td><% } %><td><input type="image" src="success.png" value="success" name="s2"></td></tr>
              
          </table>
      </form>
      
  </div>
  <div id="preview"><% String type=(String)s.getAttribute("type"); AssembleBean ob=new AssembleBean();ResultSet rs=ob.getTypeResults(type,"Ram"); while(rs.next()){%>
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