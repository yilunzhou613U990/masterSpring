<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/7/26
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:directive.page import="org.springframework.web.context.support.ServletContextResource"/>
<jsp:directive.page import="org.springframework.core.io.Resource"/>
<jsp:directive.page import="org.springframework.web.util.WebUtils"/>
<%
//     Resource res3 = new ServletContextResource(application, "/WEB-INF/conf/file1.txt");
//    out.print(res3.getFilename() + "<br/>");
//    out.print(WebUtils.getTempDir(application).getAbsolutePath());
    out.print("Hello world");
%>