<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="./base.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>


<title>Add Product</title>
</head>
<body>
	<div class="container m-5">
		<div class="card">
			<div class="card-body">
				<h1>${title}</h1>

				<form action="${pageContext.request.contextPath}/handleCreate" method="post">
					<div class="form-group">
						<label>Product Name</label> 
						<input type="text" name="name" class="form-control">
					</div>
					<div class="form-group">
						<label>Product Description</label> 
						<input type="text" name="description" class="form-control">
					</div>
					<div class="form-group">
						<label>Product Price</label> 
						<input type="number" name="price" class="form-control">
					</div>
					
					<div class="btn-group">
						<button class="btn btn-success" type="submit">
							Add Product
						</button>
						<a href="${ pageContext.request.contextPath }/" class="btn btn-danger" type="button">
							Back
						</a>
					</div>
				</form>

			</div>

		</div>

	</div>

	
</body>
</html>