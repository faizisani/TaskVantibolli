<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GET All Employee</title>
</head>
<body>

<br/>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <div class="container">
      <a href="selectAllEmp" class="btn btn-success">selectAllEmp</a><br />
      <br />
      <table class="table table-bordered">
            <thead>
               <tr>
                  <th>Id</th>
                  <th>Name</th>
                  <th>Designation</th>
                  <th>Dept</th>
               </tr>
            </thead>
    <%--   <c:forEach items="${empBean}" var="i">
         
            <tr>
               <td><c:out value="${i.emp_id}" /></td>
               <td><c:out value="${i.emp_name}" /></td>
               <td><c:out value="${i.emp_designation}" /></td>
               <td><c:out value="${i.emp_dept}" /></td>
            </tr>
      
      </c:forEach> --%>
         </table>
      
   </div>

</body>
</html>