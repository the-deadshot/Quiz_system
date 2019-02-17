package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\"><head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n");
      out.write("<title>Login Form</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("</head><body>\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("<div id=\"main_container\">\r\n");
      out.write("\t<div class=\"main_content\">\r\n");
      out.write("    \t<div id=\"header\">\r\n");
      out.write("      \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"top_center_box\"></div>\r\n");
      out.write("        <div class=\"center_box\">\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("            <div id=\"menu_tab\">                                     \r\n");
      out.write("                    <ul class=\"menu\">                                                                               \r\n");
      out.write("                         <li><a href=\"home.jsp\" class=\"nav\">Home</a></li>\r\n");
      out.write("                         <li class=\"divider\"></li>\r\n");
      out.write("                         <li><a href=\"takequiz.jsp\" class=\"nav\">Take Quiz</a></li>\r\n");
      out.write("                         <li class=\"divider\"></li>\r\n");
      out.write("                         <li><a href=\"ask.jsp\" class=\"nav\">Ask Ques.</a></li>\r\n");
      out.write("                         <li class=\"divider\"></li>\r\n");
      out.write("                         <li><a href=\"contact.html\" class=\"nav\">Contact</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t <li><a href=\"makequiz.jsp\" class=\"nav\">Make quiz</a></li>\r\n");
      out.write("\t\t\t\t\t\t \t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t <li><a href=\"register.jsp\" class=\"nav\">Register</a></li> \t\r\n");
      out.write("                    </ul>\r\n");
      out.write("            </div> \r\n");
      out.write("          \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"middle_box\">\r\n");
      out.write("            \r\n");
      out.write("            \t<div class=\"middle_box_text_content\">\r\n");
      out.write("                \t<div class=\"middle_box_title\"></div>\r\n");
      out.write("                    <p class=\"middle_text\">\r\n");
      out.write(" \r\n");
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("           \r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("           \r\n");
      out.write("            \r\n");
      out.write("            <div class=\"left_content\">\r\n");
      out.write("             ");
 
					if(request.getAttribute("notlogin_msg")!=null){
					out.print("<font size='2' color='red' m>");
					out.print(request.getAttribute("notlogin_msg"));
					out.print("</font>");
					}
					
      out.write("\r\n");
      out.write("\t\t\t\t");
 
					if(request.getAttribute("Error")!=null){
					out.print("<font size='2' color='red' m>");
					out.print(request.getAttribute("Error"));
					out.print("</font>");
					}
					
					
					
      out.write("\r\n");
      out.write("            \t<div class=\"calendar_box\">\r\n");
      out.write("            \t\r\n");
      out.write("                \t<div class=\"calendar_box_content\">\r\n");
      out.write("               \r\n");
      out.write("                \t\t<h1>Welcome to my Site</h1>\r\n");
      out.write("                \t\t \r\n");
      out.write("                \t\t<form method=\"post\" action=\"loginprocess.jsp\" >\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr><td style=\"color:navy;\"><B> Login Form</B></td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>Category:</td><td><select name=\"category\">\r\n");
      out.write("\t\t\t\t\t<option>Select a Category</option>\r\n");
      out.write("\t\t\t\t\t<option>Teacher</option>\r\n");
      out.write("\t\t\t\t\t<option>Student</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</td></tr>\r\n");
      out.write("\t\t\t\t\t<tr><td>User Name:</td><td><input type=\"text\" name=\"username\" /></td></tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr><td>Password:</td><td><input type=\"password\" name=\"userpass\"/></td></tr>\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr><td></td><td><input type=\"submit\" value=\"Sign in\"/> <a href=\"register.jsp\">Register</a></td></tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("                     </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                \t</div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"news_left\">\r\n");
      out.write("                <h1>Latest News</h1>\r\n");
      out.write("                \t<div class=\"news_box\">\r\n");
      out.write("                    \t<div class=\"calendar\">23</div>\r\n");
      out.write("                        <div class=\"news_content\">\r\n");
      out.write("\t\t\t\t\t\t<p><span></span>\r\n");
      out.write("\t\t\t\t\t\tnow learn  how to develop android application free of cost</p><br>\r\n");
      out.write("                        <a href=\"www.javatpoint.com\" class=\"read_more\">read more</a>                        \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                \t<div class=\"news_box\">\r\n");
      out.write("                    \t<div class=\"calendar\">23</div>\r\n");
      out.write("                        <div class=\"news_content\">\r\n");
      out.write("\t\t\t\t\t\t<p><span></span>\r\n");
      out.write("\t\t\t\t\t\twe have latest projects uploaded on my site</p>\r\n");
      out.write("                        <a href=\"www.cstpoint.com\" class=\"read_more\">read more</a>                        \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                \r\n");
      out.write("                </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("            <!--end of left content-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"right_content\">\r\n");
      out.write("            \r\n");
      out.write("         \r\n");
      out.write("                <h1>Latest Projects</h1>\r\n");
      out.write("                \r\n");
      out.write("                <div class=\"project_box\">\r\n");
      out.write("                    <a href=\"#\"><img src=\"images/p1.gif\" alt=\"\" title=\"\" class=\"left_img\" border=\"0\"></a>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    <span> Description:</span><br>\r\n");
      out.write("                    Payment billing System\r\n");
      out.write("                    Online Quiz<br>\r\n");
      out.write("                    Matrimonial\r\n");
      out.write("                    \r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"project_box\">\r\n");
      out.write("                    <a href=\"#\"><img src=\"images/p2.gif\" alt=\"\" title=\"\" class=\"left_img\" border=\"0\"></a>\r\n");
      out.write("                    <p>\r\n");
      out.write("                    <span> Description:</span><br>\r\n");
      out.write("                    \r\n");
      out.write("                  \t\tGmail Account<br>\r\n");
      out.write("                  \t\tLatest Quiz\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <br>\r\n");
      out.write("                <div>\r\n");
      out.write("                \r\n");
      out.write("              <h1 ><br>Our main Services</h1>          \r\n");
      out.write(" </div>                   \r\n");
      out.write("                  <div class=\"services\">\r\n");
      out.write("                    <ul>                                        \r\n");
      out.write("                       <li><a href=\"www.javatpoint.com\">Java tutorial</a></li>\r\n");
      out.write("                       <li><a href=\"www.cstpoint.com\">CSE tutorial</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                 <div class=\"services\">\r\n");
      out.write("                    <ul>                                        \r\n");
      out.write("                       <li><a href=\"www.javatpoint.com\">Java tutorial</a></li>\r\n");
      out.write("                       <li><a href=\"www.cstpoint.com\">CSE tutorial</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>  \r\n");
      out.write("                   \r\n");
      out.write("            \r\n");
      out.write("            </div><!--end of right content-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div> <!--end of center box-->\r\n");
      out.write("\t</div> <!--end of main content-->\r\n");
      out.write("</div> <!--end of main container-->\r\n");
      out.write("</body></html>");
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
