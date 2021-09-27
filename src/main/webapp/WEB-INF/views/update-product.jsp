<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="./base.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product</title>
</head>
<body>
	<div class="container m-5">
		<div class="card">
			<div class="card-body">
				<h1>${title}</h1>

				<form action="${pageContext.request.contextPath}/handleUpdate" method="post">
					<input type="hidden" name="id" value="${product.id }">
					<div class="form-group">
						<label>Product Name</label> 
						<input type="text" name="name" class="form-control"
						value="${product.name }">
					</div>
					<div class="form-group">
						<label>Product Description</label> 
						<input type="text" name="description" class="form-control"
						value="${product.description }">
					</div>
					<div class="form-group">
						<label>Product Price</label> 
						<input type="number" name="price" class="form-control"
						value="${product.price }">
					</div>
					
					<div class="btn-group">
						<button class="btn btn-success" type="submit">
							Update Product
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