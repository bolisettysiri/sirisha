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
<!--<c:url var="storesupplier" value="savesupplier"/>-->
  <form:form id="st1" modelAttribute="Supplier" method="post" action="storesupplier">
    <form:hidden style="visibility:hidden" path="id" value="${supplier.id}" />
      <tr><td><form:label path="supid">supid:</form:label></td>
               <td><form:input path="supid" value="${supplier.supid}"/></td>
           </tr>
               <tr><td><form:label path="supname">supname :</form:label></td>
               <td><form:input path="supname" value="${supplier.supname}"/></td>
           </tr>
           <tr><td><form:label path="suplocation">suplocation :</form:label></td>
               <td><form:input path="suplocation" value="${supplier.suplocation}"/></td>
           </tr>
           <tr><td><form:label path="categoryid">categoryid :</form:label></td>
               <td><form:input path="categoryid" value="${supplier.categoryid}"/></td>
           </tr>
           <tr><td><form:label path="categoryname">categoryname :</form:label></td>
               <td><form:input path="categoryname" value="${supplier.categoryname}"/></td>
           </tr>
            <tr><td><form:label path="productid">productid :</form:label></td>
               <td><form:input path="productid" value="${supplier.productid}"/></td>
           </tr>
            <tr><td><form:label path="productname">productname :</form:label></td>
               <td><form:input path="productname" value="${supplier.productname}"/></td>
           </tr>
                      
           
               <tr><td></td>
               <td><input type="submit" value="submit"/></td>
           </tr>
           
    
  </form:form>   
  	<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>
