<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>An Online Car Loan Management System</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.6.0/angular.min.js"></script>
<script src="/angular.js"></script>

<!-- Bootstrap core CSS -->
<link href="/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/shop-item.css" rel="stylesheet">
</head>
<body>
	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
	<div class="container">
		<a class="navbar-brand" href="#">Car Loan Management System</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarResponsive" aria-controls="navbarResponsive"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				
			</ul>
		</div>
	</div>
	</nav>
	<div class="container" style="border: 1px solid green;">
		>
		<%--<c:if test="${param.error ne null}">
			<div style="color: red">Invalid credentials.</div>
		</c:if>--%>
		<form action="/login" method="post">
		<h3>User Login</h3>
			<div class="form-group">
				<label for="username">UserName:</label> <input type="text"
					class="form-control" id="username" name="username">
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> <input type="password"
					class="form-control" id="pwd" name="password">
			</div>
			<div class="form-group">

				<input type="radio" class="form-control" name="gender" value="Manager" checked> Manager
				<input type="radio" class="form-control" name="gender" value="CarDealer"> Car Dealer
				<input type="radio" class="form-control" name="gender" value="Admin"> Admin
			</div>

			<button type="submit" class="btn btn-success">Login</button>

			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
	</div>
	<footer class="py-5 bg-dark">
	<div class="container">
		<p class="m-0 text-center text-white">Copyright &copy; Your
			Website 2019</p>
	</div>
	<!-- /.container --> </footer>
	<!-- Bootstrap core JavaScript -->
	<script src="/jquery.min.js"></script>
	<script src="/bootstrap.bundle.min.js"></script>
</body>
</html>