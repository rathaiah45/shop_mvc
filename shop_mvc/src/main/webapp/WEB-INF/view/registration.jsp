<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> --%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> --%>

<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>Create an account</title>

<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/common.css"
	rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<div class="container">

		<form method="POST" modelAttribute="userForm" class="form-signin">
			<h2 class="form-signin-heading">Create your account</h2>

			<div class="form-group">
				<input type="text" path="username" class="form-control"
					placeholder="Username" autofocus="true"></input>
			</div>



			<div class="form-group">
				<input type="password" path="password" class="form-control"
					placeholder="Password"></input>
			</div>



			<div class="form-group">
				<input type="password" path="passwordConfirm" class="form-control"
					placeholder="Confirm your password" onchange="myfunction()"></input>
			</div>


			<button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
		</form>

	</div>
	<!-- /container -->
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery-1.8.3.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		function myfunction() {
			alert("Hai............")
		}
	</script>
</body>
</html>
