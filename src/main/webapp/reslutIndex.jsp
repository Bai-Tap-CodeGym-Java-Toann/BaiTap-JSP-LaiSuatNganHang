<%--
  Created by IntelliJ IDEA.
  User: Surface Pro 4
  Date: 2018/10/19
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Reslut</title>
</head>
<body>
<%
    double rate = Double.parseDouble(request.getParameter("rate")) / 100;
    int time = Integer.parseInt(request.getParameter("time"));
    double money = Double.parseDouble(request.getParameter("money"));
    double extra = (double) request.getAttribute("extra");
%>
<h2>Money: <%=money%></h2>
<h2>Time: <%=time%></h2>
<br>
<h2>Extra Money: <%=extra%></h2>
<h2>Total: <%=extra+money%></h2>
</body>
</html>
