<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="angular.min.js"></script>

<body ng-app="myApp" ng-controller="myController">
	<form class="form-horizontal" name="myForm" ng-submit="submitMyForm()" action="save">
		<fieldset>

			<!-- Form Name -->
			<legend>Form Name</legend>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="username">Enter
					Username</label>
				<div class="col-md-4">
					<input id="username" name="username" type="text"
						ng-model="field.username" placeholder="Enter Username"
						class="form-control input-md">

				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="firstName">Enter
					First Name</label>
				<div class="col-md-4">
					<input id="firstName" name="firstName" type="text"
						ng-model="field.name.firstname" placeholder="Enter First Name"
						class="form-control input-md">

				</div>
			</div>

			<!-- Text input-->
			<div class="form-group">
				<label class="col-md-4 control-label" for="lastName">Enter
					Last Name</label>
				<div class="col-md-4">
					<input id="lastName" name="lastName" type="text"
						ng-model="field.name.lastname" placeholder="Enter Last Name"
						class="form-control input-md">

					<input id="value" name="value" type="hidden"
						value="{{value}}"
						class="form-control input-md">

				</div>
			</div>

			<!-- Button -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="regiester"></label>
				<div class="col-md-4">
					<button id="regiester" name="regiester" class="btn btn-success">Save</button>
				</div>
			</div>

		{{value}}
		
		</fieldset>
	</form>
	
<script>
		var app = angular.module('myApp', []);
		app.controller('myController', function($scope) {
			$scope.value = "John";
			$scope.submitMyForm = function(){
				return $scope.value = $scope.field;
				};
		});
	</script>

</body>
</html>