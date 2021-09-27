<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Home</title>
</head>
<body>
	<div class="container mt-5">
		<div class="card">
			<div class="card-body">
				<h1>Products</h1>

				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Product Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>

					<tbody>
						<c:forEach items="${products }" var="p">
							<tr>
								<td>${p.id}</td>
								<td>${p.name}</td>
								<td>${p.description}</td>
								<td>${p.price}</td>
								<td><a href="${pageContext.request.contextPath}/delete/${p.id}"> <i
										class="fas fa-trash text-danger"></i>
								</a> <a href="${pageContext.request.contextPath}/updateProduct/${p.id}"> <i
										class="fas fa-pen-nib primary"></i>
								</a></td>
							</tr>
						</c:forEach>
					</tbody>

				</table>

				<div class="btn-group">
					<a href="addProduct" class="btn btn-success" type="button"> Add
						Product </a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>