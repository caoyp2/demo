<%@ page import="servlet.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Dmall-CD-Tech01
  Date: 2020/7/24
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL获取对象值</title>
</head>
<body>
    <%
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123456");
        session.setAttribute("u",user);
        List  list = new ArrayList();
        list.add(user);
        session.setAttribute("list",list);
        Map map = new HashMap();
        map.put("user",user);
        session.setAttribute("map",map);
    %>
    ${sessionScope.u.username}
    ${list[0].password}
    ${map.user.username}
    ${map.user["username"]}
</body>
</html>
