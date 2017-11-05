<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<%@ page import="org.tmea.unido.ipmis.ws.Medicine" %>
<% List actionSearchMethodList = (List)session.getAttribute("actionSearchMethodList");
   request.setAttribute("actionSearchMethodList", actionSearchMethodList);
%>
<!DOCTYPE html>
<html>
<head>
<style>
#medicines {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

#medicines td, #medicines th {
    border: 1px solid #ddd;
    padding: 8px;
}

#medicines tr:nth-child(even){background-color: #f2f2f2;}

#medicines tr:hover {background-color: #ddd;}

#medicines th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #4CAF50;
    color: white;
}
</style>
</head>
<body>
<h2>Search Results: ${actionSearchMethodList.productTradeName}</h2>
<table id="medicines">
  <tr>
    <th>Product Trade Name</th>
    <th>Generic Name</th>
    <th>Intended Use</th>
    <th>Local Agent</th>
    <th>Manufacturer</th>
  </tr>
  <tr>
  <td>test</td>
<c:forEach var="actionSearchMethodList" items="${actionSearchMethodList}">
	<td>test data</td>
   <td>${actionSearchMethodList.productTradeName}></td>
   <td>${actionSearchMethodList.genericName}></td>
   <td>${actionSearchMethodList.intendedUse}></td>
   <td>${actionSearchMethodList.localAgent}></td>
   <td>${actionSearchMethodList.manufacturer}></td>
</c:forEach>
  </tr>
</table>
</body>
</html>