<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
#medicines {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	border-spacing: 0;
	width: 100%;
	border: 1px solid #ddd;
}

#medicines td, #medicines th {
	border: 1px solid #ddd;
	padding: 8px;
}

#medicines tr:nth-child(even) {
	background-color: #f2f2f2;
}

#medicines tr:hover {
	background-color: #ddd;
}

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

<a href="http://212.22.169.19:8080/web/ipmis/home">Back to search</a>

<h2>Uganda</h2>
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
			<th>Registered Country</th>
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
				<td>${medicines.countryRegistered}</td>
			</tr>
		</c:forEach>
		
		
			<c:if test="${empty actionSearchMethodList}">
			<tr><td colspan="11" align="center">
   						 No Search Results Found for Uganda. <a href="http://212.22.169.19:8080/web/ipmis/home">Back to search</a>
   			</td></tr>
 				</c:if>
 				
 				
 				
 				
		
	</table>
	
	<h2>Kenya</h2>
	
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
			<th>Registered Country</th>
		</tr>
		<c:forEach items="${actionSearchMethodListKe}" var="medicinesKe">
			<tr>				
				<td>${medicinesKe.productTradeName}</td>
				<td>${medicinesKe.genericName}</td>
				<td>${medicinesKe.manufacturer}</td>
				<td>${medicinesKe.countryOfOrigin}</td>
				<td>${medicinesKe.strength}</td>
				<td>${medicinesKe.intendedUse}</td>
				<td>${medicinesKe.atcCodeLevelFour}</td>
				<td>${medicinesKe.atcCodeLevelFourDescription}</td>
				<td>${medicinesKe.nfcCodeThree}</td>
				<td>${medicinesKe.nfcCodeThreeDescription}</td>
				<td>${medicinesKe.countryRegistered}</td>
			</tr>
		</c:forEach>
		
		
			<c:if test="${empty actionSearchMethodListKe}">
			<tr><td colspan="11" align="center">
   						 No Search Results Found for Kenya. <a href="http://212.22.169.19:8080/web/ipmis/home">Back to search</a>
   			</td></tr>
 				</c:if>				
		
	</table>
<h3>Tanzania</h3>
	
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
			<th>Registered Country</th>
		</tr>
		<c:forEach items="${actionSearchMethodListTz}" var="medicinesTz">
			<tr>				
				<td>${medicinesTz.productTradeName}</td>
				<td>${medicinesTz.genericName}</td>
				<td>${medicinesTz.manufacturer}</td>
				<td>${medicinesTz.countryOfOrigin}</td>
				<td>${medicinesTz.strength}</td>
				<td>${medicinesTz.intendedUse}</td>
				<td>${medicinesTz.atcCodeLevelFour}</td>
				<td>${medicinesTz.atcCodeLevelFourDescription}</td>
				<td>${medicinesTz.nfcCodeThree}</td>
				<td>${medicinesTz.nfcCodeThreeDescription}</td>
				<td>${medicinesTz.countryRegistered}</td>
			</tr>
		</c:forEach>
		
		
			<c:if test="${empty actionSearchMethodListTz}">
			<tr><td colspan="11" align="center">
   						 No Search Results Found for Tanzania. <a href="http://212.22.169.19:8080/web/ipmis/home">Back to search</a>
   			</td></tr>
 				</c:if>
 				
 				
 				
 				
		
	</table>
	
	
	
</body>
</html>
