<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<table id="medicines">
<tr>
    <th>Product Trade Name</th>
    <th>Generic Name</th>
    <th>Manufacturer</th>
    <th>Country of Origin</th>
    <th>Strength</th>
    <th>Intended Use</th>
    <th>ATC Code Level 4</th>
    <th>ATC Code Level 4 Description</th>
    <th>NFC Code</th>
    <th>NFC Code Description</th>
  </tr>
    
    <c:forEach items="${actionSearchMethodList}" var="medicines">
        <tr>
            <td>${medicines.productTradeName}</td>
            <td>${medicines.genericName}</td>
            <td>${medicines.manufacturer}</td>
            <td>${medicines.countryOfOrigin}</td>
            <td>${medicines.strength}</td>
            <td>${medicines.intendedUse}</td>            
            <td>${medicines.atcCodeLevelFour}</td>
            <td>${medicines.atcCodeLevelFourDescription}</td>
            <td>${medicines.nfcCodeThree}</td>
            <td>${medicines.nfcCodeThreeDescription}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
