<!-- Include Core Tags -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body bgcolor="#002B32">

    <!-- Header -->
    <font size="8" color="#FFFFFF">${user}'s Notes</font>

    <!-- New Note Form -->
    <form action="<c:url value='/${user}'/>" method="post">
       <input type="text" name="content" size="40" required="true" value="New Note..." onclick="javascript: this.value=''"/>
       <input type="hidden" name="_method" value="PUT"/>
       <input type="submit" value="Add"/>
    </form>
    
	<!-- Current Notes Table -->
	<table bgcolor="#166D81", rules="rows" cellspacing="4" cellpadding="4">
	  <c:forEach items="${notes}" var="note" >
	       <tr>
	           <td valign="middle">
	               <font size="4" color="#FFFFFF"><c:out value="${note.content}"/></font>
	               <br>
	               <font size="1" color="B5CA01"><c:out value="${note.editDate}"/></font>
	           </td>
	           <td valign="middle">
	               <form action="<c:url value='/${user}/${note.id}'/>" method="post">
	                   <input type="hidden" name="_method" value="DELETE"/>
	                   <input type="submit" value="Delete"/>
	               </form>
	           </td>
	       </tr>
	   </c:forEach>
	</table>

</body>
</html>