<%--
  Created by IntelliJ IDEA.
  User: Dmall-CD-Tech01
  Date: 2020/7/24
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    int fontsize;
%>
<html>
<head>
    <title>jsp循环</title>
</head>
<body>
    <%
        for(fontsize = 10; fontsize < 15; fontsize ++){ %>
            <span style="font-size: <%=fontsize%>">Hello world</span>
            <br>
        <%}%>
</body>
</html>
