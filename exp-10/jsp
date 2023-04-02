<%@page import="Exp10.student"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ExpNo10</title>
        
    </head>
    <body>
        <%
            student st=new student("kingsly","xyz@gmail.com",1234567890,"abc street");
            student st1=new student("ajay","abc@gmail.com",1231231232,"south street");
            student st2=new student("sachin","aaa@gmail.com",1092238630,"anna nagar");
            ArrayList<student> obj=new ArrayList<student>();
            obj.add(st);
            obj.add(st1);
            obj.add(st2);
//            for(student a:obj){
//                out.println(a.phonenum);
//            }
String s="name-class-mail";
pageContext.setAttribute("s", s);
pageContext.setAttribute("obj", obj);
        %>
        <table border="2px">
  <thead>
    <tr>
      <th>Name</th>
      <th>Email</th>
      <th>Phone Number</th>
      <th>Address</th>
    </tr>
  </thead>
    <tbody>
    <c:forEach items="${pageScope.obj}" var="i">
            <tr>
                <td><c:out value="${i.getName()}"></c:out></td>
                <td><c:out value="${i.getMail()}"></c:out></td>
                <td><c:out value="${i.getphonenum()}"></c:out></td>
                <td><c:out value="${i.getAddress()}"></c:out></td>
            </tr>
        </c:forEach>  
  </tbody>
</table>
          

    </body> 
</html>

