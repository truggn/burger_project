<%@ page 
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<base href="${pageContext.servletContext.contextPath}/">
<title>Insert title here</title>
</head>
<body>
	<%
		String view = request.getParameter("view");
		if (view.startsWith("admin/")) {
			pageContext.forward("admin-layout.jsp");
		} else if (view.startsWith("user/")) {
			pageContext.forward("user-layout.jsp");
		}
	%>
</body>
</html>