package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title> Quiz System</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("</head><body>\r\n");
      out.write("  \r\n");
      out.write("<div id=\"main_container\">\r\n");
      out.write("\t<div class=\"main_content\">\r\n");
      out.write("    \t<div id=\"header\">\r\n");
      out.write("      \r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"top_center_box\"></div>\r\n");
      out.write("       \r\n");
      out.write("        <div class=\"center_box\">\r\n");
      out.write("\r\n");
      out.write("            <div id=\"menu_tab\">                 \r\n");
      out.write("                              \r\n");
      out.write("                    <ul class=\"menu\">                                                                         \r\n");
      out.write("                         <li><a href=\"home.jsp\" class=\"nav\">Home</a></li>\r\n");
      out.write("                         <li class=\"divider\"></li>\r\n");
      out.write("                         <li><a href=\"takequiz.jsp\" class=\"nav\">Take Quiz</a></li>\r\n");
      out.write("                         <li class=\"divider\"></li>\r\n");
      out.write("                         \r\n");
      out.write("                         <li><a href=\"ask.jsp\" class=\"nav\">Ask Ques.</a></li>\r\n");
      out.write("                         <li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t <li><a href=\"makequiz.jsp\" class=\"nav\">Make quiz</a></li>\r\n");
      out.write("\t\t\t\t\t\t <li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t <li><a href=\"contact.html\" class=\"nav\">Contact</a></li>\r\n");
      out.write("                         \t   <li class=\"divider\"></li> \r\n");
      out.write("                         <li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t <li><a href=\"logout.jsp\" class=\"nav\">logout</a></li> \t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    \t\r\n");
      out.write("            </div>  \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"middle_box\">\r\n");
      out.write("         \r\n");
      out.write("            \t<div class=\"middle_box_text_content\">\r\n");
      out.write("                \t<div class=\"middle_box_title\"></div>\r\n");
      out.write("                    <p class=\"middle_text\">\r\n");
      out.write("</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            </div>");
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
