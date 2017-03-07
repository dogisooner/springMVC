<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>demo</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <form:form modelAttribute="user" cssClass="form-horizontal" action="${pageContext.request.contextPath}/user/register" method="post">
 
 <div class="control-group">
 <form:label for="userName" path="userName" cssClass="control-label">用户名：</form:label>
 <div class="controls">
 <form:input path="userName" /><form:errors path="userName" cssClass="help-inline"/>
 </div>
 </div>
 
 <div class="control-group">
 <form:label for="password" path="password" cssClass="control-label" >登录密码：</form:label>
 <div class="controls">
 <form:password path="password" /><form:errors path="password" cssClass="help-inline" />
 </div>
 </div>
<div class="control-group">
 <form:label for="age" path="age" cssClass="control-label">年龄：</form:label>
 <div class="controls">
 <form:input path="age" /><form:errors path="age" cssClass="help-inline" />
 </div>
 </div>
<div class="control-group">
 <form:label for="sex" path="sex" cssClass="control-label" cssErrorClass="error">性别：</form:label>
 <div class="controls">
 <form:radiobutton path="sex" value="1" />男
 <form:radiobutton path="sex" value="0" />女
 </div>
 </div>
 
 <div class="form-actions">
 <input type="submit" value="申请注册" class="btn btn-primary" />
 <input type="reset" value="重置" class="btn" />
 </div>
 </form:form>
  </body>
</html>
