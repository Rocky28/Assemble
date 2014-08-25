<%@page import="Assemble.AssembleBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*;"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Assemble.net(use)</title>
        <meta http-equiv="Content-Type" content="text/html;charset=iso-8859-1" />
<link rel="stylesheet" href="sidebarcomponents.css" type="text/css" media="screen" />
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
        <li><a href="http://all-free-download.com/free-website-templates/">Account Settings</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Your Assembly</a></li>
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
      <li><a href="http://all-free-download.com/free-website-templates/">Components</a></li>
      <li><a href="http://all-free-download.com/free-website-templates/">Assemble</a></li>
      
      <li><a href="http://all-free-download.com/free-website-templates/">About Us</a></li>
      <li class="last"><a href="http://all-free-download.com/free-website-templates/">Feedback</a></li>
    </ul>
  </div>
       
  <!-- End of Page Menu -->
  <!-- Start of Left Sidebar -->
  <div id="left_sidebar">
    <!-- Start of Newsletter Signup Form -->
    <div id="newsletter">
      <h2><img src="login_button_01.jpg" width="90%"></h2>
      <form action="http://all-free-download.com/free-website-templates/">
        <div>
          <input type="text" placeholder="Username"/>
          <input type="text" placeholder="Password"/>
          <input type="image" src="button_ok.gif" class="button" />
          <div class="clearthis">&nbsp;</div>
        </div>
      </form>
      
    </div>
    <!-- End of Newsletter Signup Form -->
    <!-- Start of Categories Box -->
    <div id="categories">
      <div id="categories_header">
        <h2>Categories</h2>
      </div>
      <ul>
        <li><a href="http://all-free-download.com/free-website-templates/">Cabinets</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Motherboards</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Processors</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Ram's</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Hard Disks</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Writers</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Monitors</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Graphics Card</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Keyboard &amp; Mouse</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Power Supply Units</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Soundcard &amp; Speakers</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Webcams</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Ups</a></li>
        <li><a href="http://all-free-download.com/free-website-templates/">Tv Tuner Cards</a></li>
        <li class="last"><a href="http://all-free-download.com/free-website-templates/">Others</a></li>
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
  <!-- End of Left Sidebar --></div>
  <div id="compohead">
      <p class="headcompo">Cabinets</p>
      <form name="frm" method="post" action="composearch">
          <input type="text" name="t1" placeholder="Search your Component........."><br>
          <input type="image" src="preview.gif" alt="preview">
      </form>
  </div>
        
        
      <div id="preview">
      <h1>Preview</h1>  
        <%  AssembleBean ob=new AssembleBean(); ResultSet rs=ob.getMk();   while(rs.next()){ %>
  
      
      <img src="<% out.println(rs.getString(5));%>">
          <h2><% out.println(rs.getString(2));%></h2>
          <h2 class="money"><% out.println(rs.getString(3));%></h2>
          <a href="<% out.println(rs.getString(6));%>">Click to view full description of the product</a><% } %>
      </div>
   <!-- Start of Page Footer -->
 
        </body>
</html>