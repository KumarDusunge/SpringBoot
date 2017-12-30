var app = angular.module('myApp', []);
app.controller('myController', function($scope) {
	$scope.value = "";
	$scope.submitMyForm = function() {
		return $scope.value = $scope.field;
	};
});