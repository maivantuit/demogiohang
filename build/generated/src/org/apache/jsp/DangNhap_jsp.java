package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class DangNhap_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <title>Đăng nhập</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <h2>Nhập thông tin đăng nhập</h2>\r\n");
      out.write("  <form class=\"form-horizontal\" action=\"DangNhap\" method=\"post\">\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label class=\"control-label col-sm-2\" for=\"email\">Tài khoản:</label>\r\n");
      out.write("      <div class=\"col-sm-10\">\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"email\" name=\"username\" placeholder=\"ví dụ: admin\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label class=\"control-label col-sm-2\" for=\"pwd\">Mật khẩu:</label>\r\n");
      out.write("      <div class=\"col-sm-10\">          \r\n");
      out.write("        <input type=\"password\" class=\"form-control\" id=\"pwd\" name=\"pass\" placeholder=\"Nhập mật khẩu : abcd\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <label class=\"control-label col-sm-2\" for=\"pwd\">Tên</label>\r\n");
      out.write("      <div class=\"col-sm-10\">          \r\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"pwd\" name=\"name\" placeholder=\"Nhập tên của bạn...\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <p>");

    	ServletContext context = getServletContext();
    		  String er =(String) context.getAttribute("error");
    		  if(er !=null){
    			  out.print(er);
    		  }
    
      out.write("</p>\r\n");
      out.write("    <div class=\"form-group\">        \r\n");
      out.write("      <div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-default\">Đăng nhập</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </form>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
