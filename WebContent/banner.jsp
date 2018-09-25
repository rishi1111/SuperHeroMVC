<%@page import="lti.quiz.bean.RegisterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="jquery-3.3.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<script type="text/javascript" src="bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<%
	RegisterBean user = (RegisterBean) session.getAttribute("USER");

%>
<body>
	
	
	<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="index.jsp">SuperHero Quiz</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="dashboard.jsp">Home</a></li>
      <li><a href="forgotpass.jsp">Forgot Password</a></li>
      <li><a href="#"></a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
</body>
<hr>
</html>