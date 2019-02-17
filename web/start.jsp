<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<html>
<head>
<script>
var request;
function get1(){
window.location='get1.jsp';
}
function get(){
var v=document.getElementsByName('radio').value;
window.location="get.jsp?ans="+v;
}
function sendInfo()
{
var v=document.myform.subject.value;
var url="findname2.jsp?val="+v;
if(window.XMLHttpRequest){
request=new XMLHttpRequest();
}
else if(window.ActiveXObject){
request=new ActiveXObject("Microsoft.XMLHTTP");
}
try
{
request.onreadystatechange=getInfo;
request.open("GET",url,true);
request.send();
}
catch(e){alert("Unable to connect to server");}
}

function getInfo(){
if(request.readyState==4){
var val=request.responseText;
document.getElementById('location').innerHTML=val;
}
}
function viewAll(name)
{
var v=name;
var url="findname3.jsp?val="+v;
if(window.XMLHttpRequest){
request=new XMLHttpRequest();
}
else if(window.ActiveXObject){
request=new ActiveXObject("Microsoft.XMLHTTP");
}
try
{
request.onreadystatechange=viewInfo;
request.open("GET",url,true);
request.send();
}
catch(e){alert("Unable to connect to server");}
}

function viewInfo(){
if(request.readyState==4){
var val=request.responseText;
document.getElementById('location').innerHTML=val;
}
}


</script>
</head>

<jsp:include page="header.jsp"></jsp:include>

<%
String islogin=(String)session.getAttribute("islogin");
if(islogin==null){
request.setAttribute("notlogin_msg","Sorry,Please do Login first");

%>
<jsp:forward page="index.jsp"></jsp:forward>
<%
}
%>



<div class="left_content">
             <% 
					if(request.getAttribute("notlogin_msg")!=null){
					out.print("<font size='2' color='red' m>");
					out.print(request.getAttribute("notlogin_msg"));
					out.print("</font>");
					}
					%>
				<% 
					if(request.getAttribute("Error")!=null){
					out.print("<font size='2' color='red' >");
					out.print(request.getAttribute("Error"));
					out.print("</font>");
					}
					%>
					<%
					if(request.getAttribute("finished")!=null){
					   out.print("<font size='2' color='navy'>");
                   out.print("<B>");
					out.print(request.getAttribute("finished"));
					  out.print("<B>");
   						out.print("</font>");
					}
					%>
				
            	<div class="calendar_box2">
            	
                	<div class="calendar_box_content">
               
                		<h1>Welcome to my Site</h1>
                		              		<marquee direction="left" style="color: navy;" onmouseover="stop()" onmouseout="start()"><B>Assess Yourself by taking quizs on various sunject</B></marquee>
                		   
                		<form method="post" action="get1.jsp">
					<table><tr><td>
					<% 
					String question=(String)session.getAttribute("question");
					String option1= (String)session.getAttribute("option1");
					String option2= (String)session.getAttribute("option2");
					String option3= (String)session.getAttribute("option3");
					String option4= (String)session.getAttribute("option4");
					out.print(question);
					%>
					<%
                    if((String)request.getParameter("radio")!=null){
               			  String ans=(String)request.getParameter("radio");
  							System.out.println("ans on set"+ans);
               			  session.setAttribute("ans",ans);
                    	
                    } %>
					</td></tr>
					<tr><td><input type="radio" name="radio" value="<%=option1%>" /><%=option1%></td></tr>	
					<tr><td><input type="radio" name="radio" value="<%=option2%>"/><%=option2 %></td></tr>	
					<tr><td><input type="radio" name="radio" value="<%=option3%>"/><%=option3 %></td></tr>	
					<tr><td><input type="radio" name="radio" value="<%=option4%>"/><%=option4 %></td></tr>			
                    
                    <tr><td></td><td><input type="submit" value="Next"/></td></tr>
                    </table>
                     </form>
                     

                     
                	</div>
                </div>
                
             
            
            
            </div>
            <!--end of left content-->


        


	<div id="footer">
    
    </div>


		</div> <!--end of center box-->
	</div> <!--end of main content-->
</div> <!--end of main container-->
</body></html>

