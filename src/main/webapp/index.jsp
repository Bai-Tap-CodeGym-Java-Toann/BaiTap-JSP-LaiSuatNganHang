<%--
  Created by IntelliJ IDEA.
  User: Surface Pro 4
  Date: 2018/10/19
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <style>
        input[type=text] {
            width: 300px;
            font-size: 16px;
            border: 2px solid #ccc;
            border-radius: 4px;
            padding: 12px 10px 12px 10px;
        }

        #submit {
            border-radius: 2px;
            padding: 10px 32px;
            font-size: 16px;
        }
    </style>
</head>
<body>
<h2>Currency Converter</h2>
<form method="get" action="/reslut">
    <label>Rate: </label><br/>
    <input type="text" name="rate" placeholder="%"/><br/>
    <label>Amount: </label><br/>
    <input type="text" name="money" placeholder="$"/><br/>
    <label>Time: </label><br/>
    <input type="text" name="time" placeholder="MONTH"/><br/>
    <input type="submit" id="submit" value="Converter"/>
</form>
</body>
</html>
