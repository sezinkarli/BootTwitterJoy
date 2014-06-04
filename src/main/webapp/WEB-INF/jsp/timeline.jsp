
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Time Line for <c:out value="${twitterUser}" /></title>
</head>
<body>
<ul>
    <c:forEach items="${tweets}" var="tweet">
        <li>${tweet.text} <br/>
            at <c:out value="${tweet.createdAt}"/></li>

    </c:forEach>
</ul>
</body>
</html>
