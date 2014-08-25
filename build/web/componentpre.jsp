<%@page contentType="text/html" pageEncoding="UTF-8" session="true" import="java.sql.*;" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Assemble.net(use)</title>
        <meta http-equiv="Content-Type" content="text/html;charset=iso-8859-1" />
<link rel="stylesheet" href="component.css" type="text/css" media="screen" />
    </head>
    <body>
        <div id="container">
  <!-- Start of Page Header -->
  <div id="page_header">
    <div id="page_heading">
      <h1><span>ASSEMBLE.NET</span></h1>
      <h2><span>COME AND ASSEMBLE YOUR PC IN MINUTES</span></h2><% HttpSession s=request.getSession(true); %>
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
  <!-- Start of component part -->
        <div id="compo">
            <form name="compn" action="getcompo" method="post">
                <table>
                    <tr><td width="40%"><select name="cmp">
                                <option name="hjfj">Select your component</option>
                                <option name="hjfj">Cabinets</option>
                                <option name="hjfj">Motherboards</option>
                                <option name="hjfj">Processors</option>
                                <option name="hjfj">Ram's</option>
                                <option name="hjfj">Internal Hdd's</option>
                                <option name="hjfj">External Hdd's</option>
                                <option name="hjfj">Ssd's</option>
                                <option name="hjfj">Internal Writer</option>
                                <option name="hjfj">External Writer</option>
                                <option name="hjfj">Monitor</option>
                                <option name="hjfj">Graphics Card</option>
                                <option name="hjfj">Keyboard</option>
                                <option name="hjfj">Mouse</option>
                                <option name="hjfj">Psu's</option>
                                <option name="hjfj">Sound Card</option>
                                <option name="hjfj">Speaker</option>
                                <option name="hjfj">Webcam</option>
                                <option name="hjfj">Ups</option>
                                <option name="hjfj">Tv Tuner Card</option>
                            </select></td><td width="40%"><select name="ven">
                                    <option name="hdjas">Select your price range</option>
                                    <option name="hdjas">Less than Rs.1000</option>
                                    <option name="hdjas">1000-3000</option>
                                    <option name="hdjas">3000-7000</option>
                                    <option name="hdjas">7000-12000</option>
                                    <option name="hdjas">12000-20000</option>
                                </select></td></tr>
                    <tr><td><input type="image" src="next.jpg"></td></tr>
                </table>
                
            </form>
        </div>
  
  <%      ResultSet rs=(ResultSet)s.getAttribute("result");  while(rs.next()){ %>
  <div id="preview">
      <h1>Preview</h1>
      
      <img src="<% out.println(rs.getString(5));%>">
          <h2><% out.println(rs.getString(2));%></h2>
          <h2 class="money"><% out.println(rs.getString(3));%></h2>
          <a href="<% out.println(rs.getString(6));%>">Click to view full description of the product</a>
      </div><% } %>
  
  <!-- End of component part -->
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
</div>
<div align=center><a href='http://all-free-download.com/free-website-templates/'></a></div>
    </body>
</html>