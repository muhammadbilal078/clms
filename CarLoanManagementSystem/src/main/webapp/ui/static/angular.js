var app = angular.module('app', []);

app.controller('homeController', function($scope, $http, $location,$rootScope) {

	//console.log($location.absUrl());
	// Simple GET request example:
	$scope.installments = [1,2,3,4,5];
	$scope.advanceDeposits = [300000,400000,500000,700000,1000000];
	$scope.carDelivery = [1,2,3,4,5];
	$scope.selectedInstallment = $scope.installments[0];
	$scope.selectedAdvanceDeposit = $scope.advanceDeposits[0];
	$scope.selectedCarDelivery = $scope.carDelivery[0];

	$scope.productName = "";

	$http({
		method: 'GET',
		url: $location.absUrl() + 'getcars'
	}).then(function successCallback(response) {
		// this callback will be called asynchronously
		console.log("success");
		//console.log(response);

		$scope.carCompanies = response.data;
		console.log($scope.carCompanies);

		$scope.selectedCompany=$scope.carCompanies[0];
		console.log($scope.selectedCompany);

		$scope.cars = $scope.carCompanies[0].car;
		console.log($scope.cars);

		//$scope.carss = $scope.cars;
		//console.log($scope.cars);

		$scope.selectedCar = $scope.cars[0];
		$scope.totalAmount= $scope.selectedCar.documentationCharges + $scope.selectedCar.proessingCharges +$scope.selectedCar.price +$scope.selectedCar.incomeEstimationCharges +$scope.selectedCar.estimatedTax;

		console.log($scope.selectedCar);

		// when the response is available
	}, function errorCallback(response) {
		// called asynchronously if an error occurs
		// or server returns response with an error status.
		console.log("error");
	});
	$scope.updateCarCompany = function(carCompany) {

		$scope.selectedCompany = carCompany;
		console.log($scope.selectedCompany);
		$scope.cars = $scope.selectedCompany.car;
		console.log($scope.cars);
		$scope.selectedCar = $scope.cars[0];

		$scope.totalAmount= $scope.selectedCar.documentationCharges + $scope.selectedCar.proessingCharges +$scope.selectedCar.price +$scope.selectedCar.incomeEstimationCharges +$scope.selectedCar.estimatedTax;

	}
});	

