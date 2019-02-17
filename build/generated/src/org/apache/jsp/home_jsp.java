package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"left_content\">\r\n");
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
      out.write("\t\t\t\t\t");

					if(request.getAttribute("finished")!=null){
					   out.print("<font size='2' color='navy'>");
                   out.print("<B>");
					out.print(request.getAttribute("finished"));
					  out.print("<B>");
   						out.print("</font>");
					}
				if(request.getAttribute("category")!=null){
					out.print("<font size='2' color='red' m>");
					out.print(request.getAttribute("category"));
					out.print("</font>");
					}
				
					
      out.write("\r\n");
      out.write("            \t<div class=\"calendar_box\">\r\n");
      out.write("            \t\r\n");
      out.write("                \t<div class=\"calendar_box_content\">\r\n");
      out.write("               \r\n");
      out.write("                \t\t<h1>Welcome to my Site</h1>\r\n");
      out.write("                \t\t              \t\t<marquee direction=\"left\" style=\"color: navy;\" onmouseover=\"stop()\" onmouseout=\"start()\"><B>Assess Yourself by taking quizs on various subjects</B></marquee>\r\n");
      out.write("                \t<p>\r\n");
      out.write("                \t<font style=\"color: navy;\">Now Teacher and Student can work together<br> \r\n");
      out.write("                \t\t\t\t\t\t\tonline.Tutors are most welcomed to my site <br>\r\n");
      out.write("                \t\t\t\t\t\t\t   they can create Quiz simply by clicking Make<br>  \r\n");
      out.write("                \t\t\t\t\t\t\t    Quiz link.And Students can appear in quiz based on various\r\n");
      out.write("                \t\t\t\t\t\t\t   subject. </font>\r\n");
      out.write("                \t</p>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                     \r\n");
      out.write("                \t</div>\r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            </div>\r\n");
      out.write("            <!--end of left content-->\r\n");
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
