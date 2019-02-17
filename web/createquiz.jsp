<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>

<% try {
String subject= request.getParameter("subject");

    Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sys");
PreparedStatement ps=con.prepareStatement("insert into quizinfo(subject) values('"+subject+"') " );
int s= ps.executeUpdate();
System.out.print(s);
 }
catch(Exception e){e.printStackTrace();}
%>

<jsp:forward page="createquiz1.jsp"></jsp:forward>
