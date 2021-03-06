<%@ page import="org.apache.commons.beanutils.converters.IntegerConverter" %>
<%--
  Created by IntelliJ IDEA.
  User: elyor
  Date: 9/13/2015
  Time: 4:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    final int id = (Integer) new IntegerConverter(0).convert(String.class, request.getParameter("id"));
%>

<div class="row">
    <p>
        <a class="btn btn-success" href="edit.jsp?id=<%=id%>"><i
                class="glyphicon glyphicon-pencil"></i> Edit</a>
        <a class="btn btn-danger" href="delete.jsp?id=<%=id%>"
           onclick="return confirm('Are you sure you want to delete this item?');"><i
                class="glyphicon glyphicon-remove"></i> Delete</a>
    </p>

    <br/>
    <br/>

    <p>
        <a class="btn btn-default" href="index.jsp"><i
                class="glyphicon glyphicon-list"></i>List</a>
    </p>
</div>