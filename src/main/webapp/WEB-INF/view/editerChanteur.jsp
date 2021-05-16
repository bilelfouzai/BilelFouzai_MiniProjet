<%@ page language="java" contentType="text/html; charset=windows-1256"
 pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css"
href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript"
src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Modifier un chanteur</title>
</head>
<body>
<div class="container mt-5">
<div class="card-body">
<form action="updateChanteur" method="post">
 <div class="form-group">
 <label class="control-label">ID Chanteur :</label>
 <input type="text" name="id" value="${chanteur.id}"
readonly class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Nom chanteur :</label>
 <input type="text" name="nom" value="${chanteur.nom}"
class="form-control"/>
 </div>
 <div class="form-group">
 <label class="control-label">Prenom chanteur :</label>
 <input type="text" name="prenom" value="${chanteur.prenom}"
class="form-control"/>

 </div>
 <div class="form-group">
 <label class="control-label"> Date Naiss :</label>
 <fmt:formatDate pattern="yyyy-MM-dd" value="${chanteur.datenaiss}"
var="formatDate" />

 <input type="date" name="date" value="${formatDate}" class="formcontrol"/>
 </div>
 
 
<div class="form-group">
 <label class="control-label">Ville :</label>
 <input type="text" name="ville" value="${chanteur.ville}"
class="form-control"/>
 
 <div>
 <button type="submit" class="btn btn-primary">Modifier</button>
</div>
</form>
</div>
<br/>
<br/>
<a href="Listechanteurs">Liste chanteurs</a>
</div>
</body>
</html>
