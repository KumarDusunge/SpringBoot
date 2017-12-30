var app = angular.module('myApp', []);
		app.controller('myController', function($scope) {
			$scope.value = "John";
			$scope.submitMyForm = function(){
				return $scope.value = $scope.field;
				};
		});