<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.carloanmanagementsystem.model.Car"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="com.amazonaws.util.json.*"%>
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
	<div class="container" ng-app="app">
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
	<div class="row text-center">
		<strong> Manager Details</strong>
	</div>
	<div class="row" style="border: 1px solid green; padding: 10px">
		<div class="col-md-3 text-center">
			<strong>Name</strong>
		</div>

		<div class="col-md-3 text-center">
			<strong>${user.username}</strong>
		</div>
		<div class="col-md-3 text-center">
			<strong>Email</strong>
		</div>
		<div class="col-md-3 text-center">
			<strong>${user.email}</strong>
		</div>
	</div>
	</br>
	<div class="row" style="border: 1px solid green; padding: 10px">
		<div class="col-md-3 text-center">
			<strong>Branch</strong>
		</div>

		<div class="col-md-3 text-center">
			<strong>${user.location}</strong>
		</div>
	</div>
	<div>

	<c:forEach var="entry" items="${cars}">
			Name:  ${entry.carId} <br />
			Value: ${entry.estimatedTax} <br />
	</c:forEach>
	</div>
	<div class="row" style="border: 1px solid green; padding: 10px">
		<c:forEach var="c" items="${cars}">
			<div class="row" style="border: 1px solid green; padding: 10px">
				<div class="col-md-3 text-center">
					<strong>Documentation Charges</strong>
				</div>
				<div class="col-md-4 text-center">
					<strong> ${c.carId}</strong>
				</div>
			</div>
		</c:forEach>
	</div>
	<div class="col-md-4 text-center">
					<strong> cars = ${cars}${0}</strong>
		</div>
	<%
			//System.out.println( "hello");
			System.out.println(pageContext.findAttribute("cars"));
			Object o1 = pageContext.findAttribute("cars");
			
			//Iterable<com.carloanmanagementsystem.model.Car> c =(com.carloanmanagementsystem.model.Car)pageContext.findAttribute("cars");
			//ArrayList l = new ArrayList();
			// ArrayList<com.carloanmanagementsystem.model.Car> list = (com.carloanmanagementsystem.model.Car) pageContext.findAttribute("cars");//Creating arraylist.

			Object o2 = pageContext.findAttribute("size");
			String s = pageContext.findAttribute("cars").toString();
			int sz = s.length();
			Object o3 = pageContext.findAttribute("user");
			 //=request.getAttribute("cars");
			
			//JSONObject array = (JSONObject) request.getAttribute("cars");
			
			//JSONArray aa = (JSONArray) pageContext.findAttribute("cars");
			//int ss= m.size();
			//m.get(0);
			//System.out.println(m.get(0));
			String username = (String) request.getAttribute("cars");




			// for(int i=0; i < pageContext.findAttribute("size").);)
			//System.out.println("counter = " + pageContext.findAttribute("user"));
			//Object o0 = pageContext.findAttribute("user");
			// List<UserDetatils> u = (List<com.javasampleapproach.angularjpamysql.model.UserDetatils>) request.getAttribute("users");

			//List<String> labelList = (List<String>) request
			//       .getAttribute("labelList");
			//for( Object u : o )
			//{       			
			//}       		
			//Iterator<Object> o = list.o();
			//while (o.hasNext()) {    
			//out.println(<o.next());
			//}
			//System.out.println(users);
		%>
	</br>


	<footer class="py-5 bg-dark">
	<div class="container">
		<p class="m-0 text-center text-white">Copyright &copy; Your
			Website 2019</p>
	</div>
	</footer>
	<!-- /.container -->
	<!-- Bootstrap core JavaScript -->
	<script src="/jquery.min.js"></script>
	<script src="/bootstrap.bundle.min.js"></script>
</body>
</html>