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
	<div class="container" ng-controller="homeController">
		<a class="navbar-brand" href="#">Car Loan Management System</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarResponsive" aria-controls="navbarResponsive"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarResponsive">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item"><a class="nav-link" href="/login">Login</a>
				</li>
			</ul>
		</div>
	</div>
	</nav>
	<!-- Page Content -->
	<div class="container" ng-app="app">
	<div class="container" ng-controller="homeController">
		<div class="row">
			<div class="col-lg-4">
				<p>Select a car Company:</p>
				<select ng-model="selectedCompany"
					ng-options="car as car.companyName for car in carCompanies"
					ng-change="updateCarCompany(selectedCompany)">
				</select>
			</div>
			<div class="col-lg-4">
				<p>Select a car:</p>
				<select ng-model="selectedCar"
					ng-options="c as c.carName for c in cars"
					ng-change="updateCar(selectedCar)">
				</select>
			</div>
			<div class="col-lg-4">
				<p>Select Installment Years:</p>
				<select ng-model="selectedInstallment"
					ng-options="installment for installment in installments"
					ng-change="updateInstallments(selectedInstallment)">
				</select>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-4">
				<p>Select Advance Deposit:</p>
				<select ng-model="selectedAdvanceDeposit"
					ng-options="advanceDeposit for advanceDeposit in advanceDeposits"
					ng-change="updateAdvanceDeposit(selectedAdvanceDeposit)">
				</select>
			</div>
			<div class="col-lg-4">
				<p>Select Car Delivery Period in Months:</p>
				<select ng-model="selectedCarDelivery"
					ng-options="cd for cd in carDelivery"
					ng-change="updateCarDelivery(selectedCarDelivery)">
				</select>
			</div>
		</div>
		<!-- /.col-lg-3 -->
		<div class="row">

			<div class="col-lg-6">

				<div class="card mt-4">
					<div class="card-body">
						<h3 class="card-title">Product Name:
							{{selectedCompany.companyName}} {{selectedCar.carName}}</h3>
						<h4>Price: {{selectedCar.price}}</h4>
						<h4>estimatedTax: {{selectedCar.estimatedTax}}</h4>
						<h4>incomeEstimationCharges:
							{{selectedCar.incomeEstimationCharges}}</h4>
						<h4>proessingCharges: {{selectedCar.proessingCharges}}</h4>
						<h4>documentationCharges:
							{{selectedCar.documentationCharges}}</h4>
						<h4>
							Total amount: {{totalAmount}}
						</h4>

							<%-- <a href="#" class="btn btn-success">Apply For Loan</a> --%>
					</div>
				</div>
				<!-- /.card -->
			</div>
			<div class="col-lg-6">

				<div class="card mt-4">
					<div class="card-body">
						<img src="https://place-hold.it/485x300.jpg" class="img-responsive" alt="img">
					</div>
				</div>
				<!-- /.card -->
			</div>
		</div>
	</div>
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
