<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List of Users</title>

    <!-- reference to style sheets -->
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css"
    />
</head>
<body>
    <div id = "wrapper">
        <div id = "header">
            <h2>Задание 1.  CRUD (create, read, update, delete)</h2>
        </div>
    </div>

    <div id = "container">
        <div id = "content">

            <!-- add the table -->
            <table>
                <tr>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Is administrator</th>
                    <th>Created</th>
                </tr>

                <c:forEach var="tempUser" items="${users}">
                    <tr>
                        <td>${tempUser.name}</td>
                        <td>${tempUser.age}</td>
                        <td>${tempUser.isAdmin}</td>
                        <td>${tempUser.createdDate}</td>
                    </tr>
                </c:forEach>
            </table>

        </div>
    </div>
</body>
</html>
