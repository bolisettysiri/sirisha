<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<html>
<head>
     <link rel="stylesheet" href='<x:url value="/resources/css/bootstrap.min.css"></x:url>' />
  <script src='<x:url value="/resources/js/jquery.min.js"></x:url>'></script>
  <script src='<x:url value="/resources/js/bootstrap.min.js"></x:url>'></script>
  <script src='<x:url value="/resources/js/angular.min.js"></x:url>'></script>
   
</head>
   <body>
   <nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
    </div>
    <ul class="nav navbar-nav">
          
            <li class="active"><a href="home">Home</a></li>
      <li><a href="logout">Logout</a></li>
          </ul>
  </div>
</nav>
<h1>Hello... <%=session.getAttribute("loggedInUser")%></h1>
      <div class="container">
            <table class="table table-hover table-bordered">
            <tr><td rowspan="5">
            <img src='<x:url value="/resources/images/${Product.image}"/>'/></td></tr>
            <tr><td>${Product.id}</td></tr>
            <tr><td>${Product.name}</td></tr>
            <tr><td>${Product.price}</td></tr>
            <tr><td>${Product.description}</td></tr>
            <tr><td>${Product.style}</td></tr>
            <tr><td>${Product.warranty}</td></tr>
            <tr><td>${Product.primaryMeterial}</td></tr>
            <tr><td>${Product.capacity}</td></tr>
            <tr><td>${Product.supid}</td></tr>
            <tr><td>${Product.supname}</td></tr>
            <tr><td>${Product.quantity}</td></tr>
            
            <sec:authorize access="hasRole('ROLE_USER')">
            <tr><td></td><td><a href="viewcart?id=${Product.id}" class="btn btn-primary">Add Cart</a>
              </td></tr></sec:authorize>               
            </table>
      </div>
      <%@ include file="/WEB-INF/views/footer.jsp" %>
   </body>
</html>