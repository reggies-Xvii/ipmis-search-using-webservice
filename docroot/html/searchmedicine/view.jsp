<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects />

This is the <b>Search Medicine</b> portlet in View mode.
<portlet:actionURL name="actionSearchMethod" var="actionURLVar"></portlet:actionURL>
<aui:form method="POST" action="<%=actionURLVar%>">
<aui:input name="medicine_search_string" title="Search String" type="text"></aui:input>
<aui:button name="submit" type="submit" value="submit"></aui:button>
</aui:form>