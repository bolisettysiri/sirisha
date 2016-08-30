<!DOCTYPE html>
<html lang="en">
<head>
  <title>welcome to houses</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Interior houses</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="home">home</a></li>
      <li><a href="retrive">ManageProduct</a></li>
      <li><a href="displaycategory">ManageCategory</a></li>
       <li><a href="displaysupplier">ManageSupplier</a></li>
        <li><a href="retriveuser">ManageUser</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
     
       <li><a href="${pageContext.request.contextPath}/Logout"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    </ul>
  </div>
</nav>
  
<div class="container">
  <h3>Right Aligned Navbar</h3>
  <p>The .navbar-right class is used to right-align navigation bar buttons.</p>
</div>
<%@ include file="/WEB-INF/views/footer.jsp" %>

</body>
</html>