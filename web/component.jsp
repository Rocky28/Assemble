<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
  <!-- Start of component part -->
        <div id="compo">
            <form name="compn" action="getcompo" method="post">
                <table>
                    <tr><td width="40%"><select name="cmp">
                                <option value="">Select your component</option>
                                <option value="Cabinets">Cabinets</option>
                                <option value="Motherboards">Motherboards</option>
                                <option value="Processors">Processors</option>
                                <option value="Ram">Ram's</option>
                                <option value="Internalhdd">Internal Hdd's</option>
                                <option value="Externalhdd">External Hdd's</option>
                                <option value="Ssd">Ssd's</option>
                                <option value="Internalwriter">Internal Writer</option>
                                <option value="Externalwriter">External Writer</option>
                                <option value="Monitor">Monitor</option>
                                <option value="Graphicscard">Graphics Card</option>
                                <option value="Keyboard">Keyboard</option>
                                <option value="Mouse">Mouse</option>
                                <option value="Psu">Psu's</option>
                                <option value="Soundcard">Sound Card</option>
                                <option value="Speaker">Speaker</option>
                                <option value="Webcam">Webcam</option>
                                <option value="Ups">Ups</option>
                                <option value="Tvtuner">Tv Tuner Card</option>
                            </select></td><td width="40%"><select name="pr">
                                    <option value="">Select your price range</option>
                                    <option value="1000">Less than 1000</option>
                                    <option value="3000">Less than 3000</option>
                                    <option value="7000">Less than 7000</option>
                                    <option value="12000">Less than 12000</option>
                                    <option value="20000">Greater than 20000</option>
                                </select></td></tr>
                    <tr><td><input type="image" src="next.jpg"></td></tr>
                </table>
                
            </form>
        </div>
  
  
  
  
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