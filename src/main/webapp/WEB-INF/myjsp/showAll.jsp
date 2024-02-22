<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<h1> All records</h1>

<div class="container">
<h1> congratulation</h1>
  <h2>Employee Record Table</h2>
            
  <table class="table">
    <thead>
      <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>EMAIL</th>
        <th>PASSWORD</th>
        <th>SALAY</th>
        <th>ROLE</th>
         <th>ACTION</th>
        
      </tr>
    </thead>
    <tbody>
     <c:forEach items="${lisOfEmployees}" var="employee">
    
      <tr>
        <td>${employee.empid}</td>
        <td>${employee.empname }</td>
        <td>${employee.emailid }</td>
        <td>${employee.password }</td>
        <td>${employee.salary }</td>
        <td>${employee.role }</td>
        <td><a href="deleteEmployee?employeeId=${employee.empid}"> <button type="button" class="btn btn-danger">D</button></a></td>
         <td><a href="displayEditForm?employeeId=${employee.empid}"> <button type="button" class="btn btn-danger">E</button></a></td>
        
        
      </tr>
      </c:forEach>
      
    </tbody>
  </table>
</div>


</body>
</html>