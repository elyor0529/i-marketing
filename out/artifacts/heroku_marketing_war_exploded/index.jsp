<%--
  Created by IntelliJ IDEA.
  User: elyor
  Date: 8/26/2015
  Time: 12:42 PM
  To change this template use File | helpers.FactoryHelper | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="/partials/header.jsp"/>
    <title>Marketing | Home </title>
</head>

<body>

<div class="container">

    <!-- The justified navigation menu is meant for single line per list item.
         Multiple lines will require custom code not provided by Bootstrap. -->
    <jsp:include page="/partials/menu.jsp"/>


    <div class="page-header">
        <h1>Home page</h1>
    </div>

    <p class="lead">Put content here...</p>

</div>

<jsp:include page="/partials/footer.jsp"/>

</body>
</html>
