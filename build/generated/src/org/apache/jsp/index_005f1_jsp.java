package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.GioHangDAO;
import model.SanPham;
import java.util.ArrayList;
import model.KhachHang;

public final class index_005f1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <title>Demo đăng nhập</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <style type=\"text/css\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t.khungsanpham{\r\n");
      out.write("\t\tpadding-top: 20px;\r\n");
      out.write("\t\tpadding-left: 30px;\r\n");
      out.write("\t\tfloat: left;\r\n");
      out.write("\t}\r\n");
      out.write("\t.boder{\r\n");
      out.write("\t\tborder: solid;\r\n");
      out.write("\t\twidth: 200px;\r\n");
      out.write("\t\theight: 270px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.img{\r\n");
      out.write("\t\tmargin-left: 3px;\r\n");
      out.write("\t\tmargin-top: 3px;\r\n");
      out.write("\t\twidth: 192px;\r\n");
      out.write("\t\theight: 180px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.gia{\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\tcolor: red;\r\n");
      out.write("\t\tmargin-top: 10px;\r\n");
      out.write("\t\tmargin-bottom: 10px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.mua{\r\n");
      out.write("\t\tcolor: red;\r\n");
      out.write("\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">Xin chào, ");

    	KhachHang kh =(KhachHang) session.getAttribute("user");
   		   if(kh!=null){
    		out.print(kh.getName());
    	  }
      
      out.write("</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <ul class=\"nav navbar-nav\">\r\n");
      out.write("      <li class=\"active\"><a href=\"#\">Trang chủ</a></li>\r\n");
      out.write("      <li class=\"dropdown\"><a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Page 1 <span class=\"caret\"></span></a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("          <li><a href=\"#\">Page 1-1</a></li>\r\n");
      out.write("          <li><a href=\"#\">Page 1-2</a></li>\r\n");
      out.write("          <li><a href=\"#\">Page 1-3</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li><a href=\"#\">Page 2</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("      <li><a href=\"DangKy.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Đăng kí</a></li>\r\n");
      out.write("      <li><a href=\"DangNhap.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Đăng nhập</a></li>\r\n");
      out.write("      <li><a href=\"DangXuat\"><span class=\"glyphicon glyphicon-user\"></span> Đăng xuất</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("  \r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t<a href=\"GioHang.jsp\"><button type=\"button\" class=\"btn btn-danger\" aria-label=\"Right Align\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-cart\" aria-hidden=\"true\"></span>Xem giỏ hàng\r\n");
      out.write("\t\t\t\t\t\t\t</button></a>\r\n");
      out.write("  <h3>Các sản phẩm hiện có</h3>\r\n");
      out.write("  ");
ArrayList<SanPham> dsSanPham = new GioHangDAO().getDsSanPham();
      out.write("\r\n");
      out.write("  \t");
	for(int i =0;i<dsSanPham.size();i++){
      out.write("\r\n");
      out.write("  \t<div class=\"khungsanpham\">\r\n");
      out.write("\t\t<div class=\"boder\">\r\n");
      out.write("\t\t\t\t<div class=\"img\">\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.print(dsSanPham.get(i).getHinhAnh());
      out.write("\" width=\"192px\" height=\"180px\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"gia\">\r\n");
      out.write("\t\t\t\t\t");
      out.print(dsSanPham.get(i).getGiaSanPham() );
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"mua\">\r\n");
      out.write("\t\t\t\t<center><a href=\"XuLyMuaSanPham?maSanPham=");
      out.print(dsSanPham.get(i).getMaSanPham());
      out.write("\"><button class=\"btn btn-success\">Mua ngay</button></a></center>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
} 
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"padding-left:100px;padding-top:15px;\">\r\n");
      out.write("\t\t<a href=\"DangXuat\"><button type=\"button\" class=\"btn btn-danger\" aria-label=\"Right Align\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-user\" aria-hidden=\"true\"></span>Đăng xuất\r\n");
      out.write("\t\t\t\t\t\t\t</button></a>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
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
