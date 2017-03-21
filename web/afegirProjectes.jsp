<%--
  Created by IntelliJ IDEA.
  User: pedro
  Date: 19/03/2017
  Time: 19:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage ="ErrorPage.jsp"%>

<html>
<head>
  <title>$Title$</title>
</head>
<body>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<div class="container-fluid">
  <!-- Second navbar for profile settings -->
  <nav class="navbar navbar-inverse">
    <div class="container">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
        <a class="navbar-brand" href="/index.jsp">Pratica Servlets</a>
      </div>

      <!-- Collect the nav links, forms, and other content for toggling -->
      <div class="collapse navbar-collapse" id="navbar-collapse-4">
        <ul class="nav navbar-nav navbar-right">
          <li><a href="/afegirProjectes.jsp"> Afegir Projectes </a></li>
        </ul>

      </div><!-- /.navbar-collapse -->
    </div><!-- /.container -->
  </nav><!-- /.navbar -->
</div><!-- /.container-fluid -->


<form action="/guardarxml">
  Nom del Projecte <input type="text" name="nom"><br/>
  Data Inici <input type="date" name="dataInici"><br/>
  Data final <input type="date" name="dataFinal"><br/>
  Tasca inical <input type="text" name="tascaInicial"><br/>

  <br/>

  <input type="submit" name="afegirPr" value="Afegir Projecte" >

</form>


</body>
</html>
