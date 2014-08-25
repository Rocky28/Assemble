<%-- 
    Document   : signup
    Created on : Feb 22, 2014, 1:00:43 AM
    Author     : rOcK
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <div class="container">
    <section class="register">
      <h1>Register on Assemble.com</h1>
      <form method="post" action="index.html">
      <div class="reg_section personal_info">
      <h3>Your Personal Information</h3>
      <input type="text" name="username" value="" placeholder="Your Desired Username">
      <input type="text" name="email" value="" placeholder="Your E-mail Address">
      <input type="text" name="dob" value="" placeholder="DOB">
      <input type="text" name="sex" value="" placeholder="Sex">
    
      </div>
      <div class="reg_section password">
      <h3>Your Password</h3>
      <input type="password" name="password" value="" placeholder="Your Password">
      <input type="password" name="confirm" value="" placeholder="Confirm Password">
      </div>
      <div class="reg_section password">
      <h3>Your Address</h3>
      <select>
        <option value="">Egypt</option>
        <option value="">Palastine</option>
        <option value="">Syria</option>
        <option value="">Italy</option>
      </select>
      
      </div>
      <p class="terms">
        <label>
          <input type="checkbox" name="remember_me" id="remember_me">
           I accept  <a href="http://www.imomen.com/">Assemble</a> Terms & Condition
        </label>
      </p>
      <p class="submit"><input type="submit" name="commit" value="Sign Up"></p>
      </form>
    </section>
  </div>

  
    </body>
</html>
