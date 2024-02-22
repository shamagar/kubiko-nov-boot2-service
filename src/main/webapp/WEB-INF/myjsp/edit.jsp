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

<div class="container">

  <h2>Updation form</h2>
  <form action="updateEmployee" method="post">
  
  <div class="form-group">
      <label for="name">EmployeeId:</label>
      <input type="text" class="form-control"  name="empid" value="${employeeEntity.empid}" readonly>
    </div>
  
   <div class="form-group">
      <label for="name">Name:</label>
      <input type="text" class="form-control"  name="empname"  value="${employeeEntity.empname}">
    </div>
  
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control"  name="emailid"  value="${employeeEntity.emailid}">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control"  name="password"  value="${employeeEntity.password}">
    </div>
    
     <div class="form-group">
      <label for="salary">Salary:</label>
      <input type="text" class="form-control"   name="salary"  value="${employeeEntity.salary}">
    </div>
    
    <div class="form-group">
      <label for="role">Role:</label>
      <input type="text" class="form-control"  name="role"  value="${employeeEntity.role}">
    </div>
    
    
    
    <button type="submit" class="btn btn-primary">UPDATE</button>
  </form><br>
  <a href="loginn"> <Button>Login Page</Button></a>
</div>

</body>
</html>
