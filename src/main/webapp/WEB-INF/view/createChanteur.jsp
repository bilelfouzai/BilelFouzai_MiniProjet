<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript"
src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Ajouter Chanteur</title>
</head>
<body>
<div class="container mt-5" >
<div class="card-body">
<form action="saveChanteur" method="post">
 <div class="form-group">
 <label class="control-label">Nom Chanteur :</label>
 <input type="text" name="nom" class="form-control"/>
 <span th:errors= ${chanteur.nom} class="text-danger"> </span>
 </div>
 <div class="form-group">
 <label class="control-label">Prenom Chanteur :</label>
 <input type="text" name="prenom" class="form-control"/>
 
 
 <span th:errors= ${chanteur.prenom} class="text-danger"> </span>
 </div>
 <div class="form-group">
 <label class="control-label">date Naiss :</label>
 <input type="date" name="date" class="form-control"/>
 
 <span th:errors= ${chanteur.datenaiss} class="text-danger"> </span>
 </div>
 
  <div class="form-group">
 <label class="control-label">Ville :</label>
 <input type="text" name="ville" class="form-control"/>
 
 <span th:errors= ${chanteur.ville} class="text-danger"> </span>
 </div>
 

 <div>
 <button type="submit" class="btn btn-primary">Ajouter</button>
</div>
</form>
</div>
<br/>
<br/>
<a href="ListeChanteurs">Liste Chanteurs</a>
</div>
</body>
</html>