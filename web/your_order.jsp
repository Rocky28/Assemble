<%@page import="java.sql.ResultSet"%>
<%@page import="Assemble.AssembleBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Assemble.net(use)</title>
        <meta http-equiv="Content-Type" content="text/html;charset=iso-8859-1" />
<link rel="stylesheet" href="assemble.css" type="text/css" media="screen" />
    </head>
    <body>
        <div id="container">
  <!-- Start of Page Header -->
  <div id="page_header">
    <div id="page_heading">
      <h1>ASSEMBLE.NET</h1>
      <h2>COME AND ASSEMBLE YOUR PC IN MINUTES</h2>
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
      <li><a href="home.jsp">Home</a></li>
      <li><a href="component.jsp">Components</a></li>
      <li><a href="assemble.jsp">Assemble</a></li>
      
      <li><a href="#">About Us</a></li>
      <li class="last"><a href="#">Feedback</a></li>
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
  <div id="listing">
      <form method="post" action="changeandsubmit">
      <p>YOUR ORDER</p><% AssembleBean ob=new AssembleBean(); ResultSet rs=ob.getMyOrder("sinha.aot@gmail.com"); if(rs.next()){%>
      <table>
          <% String cmp1=rs.getString(4);if(cmp1.equals("NULL")){}else{ %><tr><th>Cabinet</th><td>&nbsp;</td><td><% out.println(cmp1); %></td><td><input type="submit" value="Change_1" name="pro1"></td></tr><% } %>
          <% String cmp2=rs.getString(5);if(cmp2.equals("NULL")){}else{ %><tr><th>MotherBoard</th><td>&nbsp;</td><td><% out.println(cmp2); %></td><td><input type="submit" value="Change_2" name="pro2"></td></tr><% } %>
          <% String cmp3=rs.getString(6);if(cmp3.equals("NULL")){}else{ %><tr><th>Processor</th><td>&nbsp;</td><td><% out.println(cmp3); %></td><td><input type="submit" value="Change_3" name="pro3"></td></tr><% } %>
          <% String cmp4=rs.getString(7);if(cmp4.equals("NULL")){}else{ %><tr><th>Internal Hdd</th><td>&nbsp;</td><td><% out.println(cmp4); %></td><td><input type="submit" value="Change_4" name="pro4"></td></tr><% } %>
          <% String cmp5=rs.getString(8);if(cmp5.equals("NULL")){}else{ %><tr><th>External Hdd</th><td>&nbsp;</td><td><% out.println(cmp5); %></td><td><input type="submit" value="Change_5" name="pro5"></td></tr><% } %>
          <% String cmp6=rs.getString(9);if(cmp6.equals("NULL")){}else{ %><tr><th>Ssd</th><td>&nbsp;</td><td><% out.println(cmp6); %></td><td><input type="submit" value="Change_6" name="pro6"></td></tr><% } %>
          <% String cmp7=rs.getString(10);if(cmp7.equals("NULL")){}else{ %><tr><th>Ram</th><td>&nbsp;</td><td><% out.println(cmp7); %></td><td><input type="submit" value="Change_7" name="pro7"></td></tr><% } %>
          <% String cmp8=rs.getString(11);if(cmp8.equals("NULL")){}else{ %><tr><th>Internal Writer</th><td>&nbsp;</td><td><% out.println(cmp8); %></td><td><input type="submit" value="Change_8" name="pro8"></td></tr><% } %>
          <% String cmp9=rs.getString(12);if(cmp9.equals("NULL")){}else{ %><tr><th>External Writer</th><td>&nbsp;</td><td><% out.println(cmp9); %></td><td><input type="submit" value="Change_9" name="pro9"></td></tr><% } %>
          <% String cmp10=rs.getString(13);if(cmp10.equals("NULL")){}else{ %><tr><th>Monitor</th><td>&nbsp;</td><td><% out.println(cmp10); %></td><td><input type="submit" value="Change_10" name="pro10"></td></tr><% } %>
          <% String cmp11=rs.getString(14);if(cmp11.equals("NULL")){}else{ %><tr><th>Graphics Card</th><td>&nbsp;</td><td><% out.println(cmp11); %></td><td><input type="submit" value="Change_11" name="pro11"></td></tr><% } %>
          <% String cmp12=rs.getString(15);if(cmp12.equals("NULL")){}else{ %><tr><th>Keyboard</th><td>&nbsp;</td><td><% out.println(cmp12); %></td><td><input type="submit" value="Change_12" name="pro12"></td></tr><% } %>
          <% String cmp13=rs.getString(16);if(cmp13.equals("NULL")){}else{ %><tr><th>Mouse</th><td>&nbsp;</td><td><% out.println(cmp13); %></td><td><input type="submit" value="Change_13" name="pro13"></td></tr><% } %>
          <% String cmp14=rs.getString(17);if(cmp14.equals("NULL")){}else{ %><tr><th>Psu</th><td>&nbsp;</td><td><% out.println(cmp14); %></td><td><input type="submit" value="Change_14" name="pro14"></td></tr><% } %>
          <% String cmp15=rs.getString(18);if(cmp15.equals("NULL")){}else{ %><tr><th>Sound Card</th><td>&nbsp;</td><td><% out.println(cmp15); %></td><td><input type="submit" value="Change_15" name="pro15"></td></tr><% } %>
          <% String cmp16=rs.getString(19);if(cmp16.equals("NULL")){}else{ %><tr><th>Speaker</th><td>&nbsp;</td><td><% out.println(cmp16); %></td><td><input type="submit" value="Change_16" name="pro16"></td></tr><% } %>
          <% String cmp17=rs.getString(20);if(cmp17.equals("NULL")){}else{ %><tr><th>Web Cam</th><td>&nbsp;</td><td><% out.println(cmp17); %></td><td><input type="submit" value="Change_17" name="pro17"></td></tr><% } %>
          <% String cmp18=rs.getString(21);if(cmp18.equals("NULL")){}else{ %><tr><th>Ups</th><td>&nbsp;</td><td><% out.println(cmp18); %></td><td><input type="submit" value="Change_18" name="pro18"></td></tr><% } %>
          <% String cmp19=rs.getString(22);if(cmp19.equals("NULL")){}else{ %><tr><th>Tv Tuner Card</th><td>&nbsp;</td><td><% out.println(cmp19); %></td><td><input type="submit" value="Change_19" name="pro19"></td></tr><% } %>
          <tr><th>&nbsp;</th><td>&nbsp;</td></tr>
          <tr><th>Total Cost</th><td><% out.println(rs.getInt(23)); %></td><td><input type="submit" value="Submit" name="s1"></td></tr><% } %>
          
      </table>
      </form>
  </div>
   <!-- Start of Page Footer -->
  <div id="page_footer">
    
  </div>
  <!-- End of Page Footer -->

<div align=center><a href='http://all-free-download.com/free-website-templates/'></a></div>
        </div></body>
</html>