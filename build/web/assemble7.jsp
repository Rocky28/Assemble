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
      <p class="p1">Choose your External Hard Disk : </p>
      <form method="post" action="selexternalhdd">
          <table>
             <tr><td><select name="chooseexternalhdd">
                        <option value="default">Choose Your Item</option>
                        <option value="HITACHI TOURO MOBILE 2.5 INCH 1 TB EXTERNAL HDD">HITACHI TOURO MOBILE 2.5 INCH 1 TB EXTERNAL HDD</option>
                        <option value="HITACHI TOURO 2.5 INCH 1 TB EXTERNAL HDD">HITACHI TOURO 2.5 INCH 1 TB EXTERNAL HDD</option>
                        <option value="HITACHI TOURO PRO 500GB EXTERNAL HDD">HITACHI TOURO PRO 500GB EXTERNAL HDD</option>
                        <option value="HITACHI TOURO MOBILE 2.5 INCH 500GB EXTERNAL HDD">HITACHI TOURO MOBILE 2.5 INCH 500GB EXTERNAL HDD</option>
                        <option value="HITACHI TOURO 2.5 INCH 500GB EXTERNAL HDD">HITACHI TOURO 2.5 INCH 500GB EXTERNAL HDD</option>
                        <option value="HITACHI TOURO MOBILE 2.5 INCH 500GB EXTERNAL HDD">HITACHI TOURO MOBILE 2.5 INCH 500GB EXTERNAL HDD</option>
                        <option value="HITACHI TOURO PRO 1TB EXTERNAL HDD">HITACHI TOURO PRO 1TB EXTERNAL HDD</option>
                        <option value="SEAGATE BACKUP PLUS 1TB EXTERNAL HDD(BLACK)">SEAGATE BACKUP PLUS 1TB EXTERNAL HDD(BLACK)</option>
                        <option value="SEAGATE EXPANSION 1TB EXTERNAL HDD">SEAGATE EXPANSION 1TB EXTERNAL HDD</option>
                        <option value="SEAGATE EXPANSION 2TB EXTERNAL HDD">SEAGATE EXPANSION 2TB EXTERNAL HDD</option>
                        <option value="SEAGATE ACKUP PLUS 1TB EXTERNAL HDD(BLUE)">SEAGATE ACKUP PLUS 1TB EXTERNAL HDD(BLUE)</option>
                        <option value="SEAGATE BACKUP PLUS 4TB EXTERNAL HDD">SEAGATE BACKUP PLUS 4TB EXTERNAL HDD</option>
                        <option value="SEAGATE SLIM 500GB EXTERNAL HDD">SEAGATE SLIM 500GB EXTERNAL HDD</option>
                        <option value="SEAGATE BACKUP PLUS 2TB EXTERNAL HDD">SEAGATE BACKUP PLUS 2TB EXTERNAL HDD</option>
                        <option value="SEAGATE BACKUP PLUS 1TB EXTERNAL HDD(RED)">SEAGATE BACKUP PLUS 1TB EXTERNAL HDD(RED)</option>
                        <option value="SEAGATE BACKUP PLUS 1TB EXTERNAL HDD(SILVER)">SEAGATE BACKUP PLUS 1TB EXTERNAL HDD(SILVER)</option>
                        <option value="SEAGATE EXPANSION FALCUN 500GB EXTERNAL HDD">SEAGATE EXPANSION FALCUN 500GB EXTERNAL HDD</option>
                        <option value="SEAGATE BACKUP PLUS PORTABLE 2.5 INCH 1TB EXTERNAL HDD">SEAGATE BACKUP PLUS PORTABLE 2.5 INCH 1TB EXTERNAL HDD</option>
                        <option value="SEAGATE BACKUP PLUS 500GB EXTERNAL HDD">SEAGATE BACKUP PLUS 500GB EXTERNAL HDD</option>
                        <option value="SEAGATE EXPANSION 3TB EXTERNAL HDD">SEAGATE EXPANSION 3TB EXTERNAL HDD</option>
                        <option value="SEAGATE WIRELESS PLUS 1TB EXTERNAL HDD">SEAGATE WIRELESS PLUS 1TB EXTERNAL HDD</option>
                        <option value="SEAGATE WIRELESS PLUS 1TB EXTERNAL HDD">SEAGATE WIRELESS PLUS 1TB EXTERNAL HDD</option>
                        <option value="SEAGATE GOFLEX SATELLITE MOBILE 2.5 INCH 500GB WIRELESS EXTERNAL HDD">SEAGATE GOFLEX SATELLITE MOBILE 2.5 INCH 500GB WIRELESS EXTERNAL HDD</option>
                        <option value="SEAGATE CENTRAL SHARED STORAGE 2TB WIRELESS NETWORK HDD">SEAGATE CENTRAL SHARED STORAGE 2TB WIRELESS NETWORK HDD</option>
                        <option value="SEAGATE STAU12000300 12TB EXTERNAL HDD(BLACK)">SEAGATE STAU12000300 12TB EXTERNAL HDD(BLACK)</option>
                        <option value="SEAGATE STBP12000300 12TB EXTERNAL HDD(BLACK)">SEAGATE STBP12000300 12TB EXTERNAL HDD(BLACK)</option>
                        <option value="SEAGATE STAU8000300 8TB EXTERNAL HDD(BLACK)">SEAGATE STAU8000300 8TB EXTERNAL HDD(BLACK)</option>
                        <option value="SEAGATE STBN8000300 8 TB EXTERNAL HDD(BLACK)">SEAGATE STBN8000300 8 TB EXTERNAL HDD(BLACK)</option>
                        <option value="SEAGATE STCA3000300 3TB EXTERNAL HDD(BLACK)">SEAGATE STCA3000300 3TB EXTERNAL HDD(BLACK)</option>
                        <option value="SEAGATE STCG3000300 3TB EXTERNAL HDD(BLACK)">SEAGATE STCG3000300 3TB EXTERNAL HDD(BLACK)</option>
                        <option value="SEAGATE STCG4000300 4TB EXTERNAL HDD(BLACK)">SEAGATE STCG4000300 4TB EXTERNAL HDD(BLACK)</option>
                        <option value="SEAGATE STBM4000300 4TB EXTERNAL HDD(BLACK)">SEAGATE STBM4000300 4TB EXTERNAL HDD(BLACK)</option>
                        <option value="SEAGATE FREEAGENT GOFLEX DESK 3.5 INCH 1 TB EXTERNAL HDD">SEAGATE FREEAGENT GOFLEX DESK 3.5 INCH 1 TB EXTERNAL HDD</option>
                        <option value="SEAGATE BACKUP PLUS 500GB USB 3.0 PORTABLE DRIVE(SILVER)">SEAGATE BACKUP PLUS 500GB USB 3.0 PORTABLE DRIVE(SILVER)</option>
                        <option value="SEAGATE EXPANSION 3.5 INCH 3TB EXTERNAL HDD">SEAGATE EXPANSION 3.5 INCH 3TB EXTERNAL HDD</option>
                        <option value="SEAGATE GOFLEX HOME 1TB WIRELESS EXTERNAL HDD">SEAGATE GOFLEX HOME 1TB WIRELESS EXTERNAL HDD</option>
                        <option value="SEAGATE GOFLEX HOME 2 TB WIRELESS EXTERNAL HDD">SEAGATE GOFLEX HOME 2 TB WIRELESS EXTERNAL HDD</option>
                        <option value="SEAGATE STBP4000300 4TB EXTERNAL HDD(BLACK)">SEAGATE STBP4000300 4TB EXTERNAL HDD(BLACK)</option>
                        <option value="SEAGATE FREEAGENT GOFLEX 2.5 INCH 1 TB EXTERNAL HDD">SEAGATE FREEAGENT GOFLEX 2.5 INCH 1 TB EXTERNAL HDD</option>
                        <option value="SEAGATE BLACKARMOR NAS 400 4TB NETWORK HDD">SEAGATE BLACKARMOR NAS 400 4TB NETWORK HDD</option>
                        <option value="SEAGATE BLACKARMOR NAS 220(2BAY) 4TB NETWORK HARD DISK">SEAGATE BLACKARMOR NAS 220(2BAY) 4TB NETWORK HARD DISK</option>
                        <option value="SEAGATE BLACKARMOR NAS 220(2BAY) 2TB NETWORK HDD">SEAGATE BLACKARMOR NAS 220(2BAY) 2TB NETWORK HDD</option>
                     </select>
            </td></tr> 
             <tr><td><input name="s1" type="submit" value="Preview"></td><td><a href="assemble8.jsp">Skip this one</a></td><td><input type="image" src="success.png" name="s2" value="success"></td></tr>
              
          </table>
      </form>
      
  </div>
  <div id="preview"><% HttpSession s=request.getSession(true);String type=(String)s.getAttribute("type"); AssembleBean ob=new AssembleBean();ResultSet rs=ob.getTypeResults(type,"Externalhdd"); while(rs.next()){%>
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