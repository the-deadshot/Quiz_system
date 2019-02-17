package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.awt.Dialog;

public final class createquiz1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");

String islogin=(String)session.getAttribute("islogin");
if(islogin==null){
request.setAttribute("notlogin_msg","Sorry,Please do Login first");


      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("index.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("             ");
 
					if(request.getAttribute("notlogin_msg")!=null){
					out.print("<font size='2' color='red' m>");
					out.print(request.getAttribute("notlogin_msg"));
					out.print("</font>");
					}
					
      out.write("\r\n");
      out.write("\t\t\t\t");
 
					if(request.getAttribute("Error")!=null){
					out.print("<font size='2' color='red' >");
					out.print(request.getAttribute("Error"));
					out.print("</font>");
					}
					
      out.write("\r\n");
      out.write("\t\t\t\t\t ");
 
					 	if(request.getAttribute("counter")!=null){
                   Integer i=(Integer)request.getAttribute("counter");
                  		 if(i==10){
   								request.setAttribute("finished","quiz successfully submitted");
   			
   					
      out.write("\r\n");
      out.write("   \t\t\t\t          ");
      if (true) {
        _jspx_page_context.forward("home.jsp");
        return;
      }
      out.write("\r\n");
      out.write("   \t\t\t\t\t\t\t          ");
 
   							             
                   }}
                  
      out.write("\r\n");
      out.write("                  <div class=\"left_content\">\r\n");
      out.write("                  \r\n");
      out.write("            \t<div class=\"calendar_box2\">\r\n");
      out.write("            \t\r\n");
      out.write("                \t<div class=\"calendar_box_content\">\r\n");
      out.write("               \r\n");
      out.write("                \t\t<h1>Welcome to my Site</h1>\r\n");
      out.write("                \t\t                   \t\t<marquee direction=\"left\" style=\"color: navy;\" onmouseover=\"stop()\" onmouseout=\"start()\"><B>Access Yourself by taking quizs on various sunject</B></marquee>\r\n");
      out.write("                \t\t   \r\n");
      out.write("                \t\t<form method=\"post\" action=\"saveques.jsp\" >\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr><td>Question:</td><td><textarea rows=\"3\" cols=\"\" name=\"question\" ></textarea></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>Option1:</td><td><input type=\"text\" name=\"option1\" /></td></tr>\t\r\n");
      out.write("\t\t\t\t\t<tr><td>Option2:</td><td><input type=\"text\" name=\"option2\" /></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>Option3:</td><td><input type=\"text\" name=\"option3\" /></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>Option4:</td><td><input type=\"text\" name=\"option4\" /></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>Answer:</td><td><input type=\"text\" name=\"answer\" /></td></tr>\t\r\n");
      out.write("\t\t\t\t\t<tr><td>Description:</td><td><input type=\"text\" name=\"description\" /></td></tr>\t\t\t\r\n");
      out.write("                    <tr><td></td><td><input type=\"submit\" value=\"Next\"></td></tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                     </form>\r\n");
      out.write("                    \t\t\t\r\n");
      out.write("                         </div>\r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("            <!--end of left content-->\r\n");
      out.write("        \r\n");
      out.write("<div id=\"footer\">\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div> <!--end of center box-->\r\n");
      out.write("\t</div> <!--end of main content-->\r\n");
      out.write("</div> <!--end of main container-->\r\n");
      out.write("</body></html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
