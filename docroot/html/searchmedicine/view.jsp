<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<style type="text/css">
    form{
        padding-right: 5px;
    padding-left: 10px;
    }
</style>
<portlet:defineObjects />
<div id="form">
<portlet:actionURL name="actionSearchMethod" var="actionURLVar"></portlet:actionURL>
<aui:form method="POST" action="<%=actionURLVar%>">
<aui:input name="medicine_search_string" type="text" label="Search Product ATC: (Search by Product Name or Generic Name)"></aui:input>
<aui:button name="submit" type="submit" value="submit"></aui:button>
</aui:form>
</div>