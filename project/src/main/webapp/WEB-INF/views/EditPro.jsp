<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
  <link rel="stylesheet" href='<c:url value="/resources/css/bootstrap.min.css"></c:url>' />
  <script src='<c:url value="/resources/js/jquery.min.js"></c:url>'></script>
  <script src='<c:url value="/resources/js/bootstrap.min.js"></c:url>'></script>
  <script src='<c:url value="/resources/js/angular.min.js"></c:url>'></script>
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
<!--<c:url var="storehouse" value="savehouse"/>-->
  <form:form id="st1" modelAttribute="Product" method="post" action="storehouse" enctype="multipart/form-data">
    <form:hidden style="visibility:hidden" path="id" value="${product.id}" />
      <tr><td><form:label path="name">product Name :</form:label></td>
               <td><form:input path="name" value="${product.Name}"/></td>
           </tr>
               <tr><td><form:label path="price">product Price :</form:label></td>
               <td><form:input path="price" value="${product.Price}"/></td>
           </tr>
           <tr><td><form:label path="description">Discription :</form:label></td>
               <td><form:input path="description" value="${product.Description}"/></td>
           </tr>
           
           <tr><td><form:label path="style">Style :</form:label></td>
               <td><form:input path="style" value="${product.Style}"/></td>
           </tr>
               <tr><td><form:label path="warranty">Warranty :</form:label></td>
               <td><form:input path="warranty" value="${product.warranty}"/></td>
           </tr>
           <tr><td><form:label path="primaryMeterial">Primary Meterial :</form:label></td>
               <td><form:input path="primaryMeterial" value="${product.primaryMeterial}"/></td>
           </tr>
           </tr>
               <tr><td><form:label path="capacity">Capacity :</form:label></td>
               <td><form:input path="capacity" value="${product.capacity}"/></td>
           </tr>           
           <tr><td><form:label path="img">product Image :</form:label></td>
               <td><form:input path="img" type="file" />
               <font color="red"><form:errors path="img"></form:errors></font></td><tr>
           <tr><td><form:label path="supid">supid :</form:label></td>
               <td><form:input path="supid" value="${product.supid}"/></td>
           </tr> 
            <tr><td><form:label path="supname">supname :</form:label></td>
               <td><form:input path="supname" value="${product.supname}"/></td>
           </tr> 
           <tr><td><form:label path="quantity">quantity :</form:label></td>
               <td><form:input path="quantity" value="${product.quantity}"/></td>
           </tr> 
           
               <tr><td></td>
               <td><input type="submit" value="submit"/></td>
           </tr>
           
                      
  </form:form>   
   	<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>
