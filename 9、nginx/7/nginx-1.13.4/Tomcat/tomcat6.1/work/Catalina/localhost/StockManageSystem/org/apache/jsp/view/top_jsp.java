package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\">\r\n");
      out.write("  <title>页眉</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <center>\r\n");
      out.write("       <table border=\"0\" width=\"100%\" height=\"160\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <!-- 顶部菜单 -->\r\n");
      out.write("            <tr height=\"20\">\r\n");
      out.write("                <td height=\"25\" valign=\"bottom\" style=\"text-indent:10\">\r\n");
      out.write("                    \r\n");
      out.write("                    <a href=\"stockManageSystem/login!isLogin\" style=\"color:gray\">[进入后台]</a>\r\n");
      out.write("                </td>\r\n");
      out.write("                <td align=\"right\" valign=\"bottom\">\r\n");
      out.write("                    <a href=\"#\" style=\"color:gray\" onclick=\"this.style.behavior='url(#default#homepage)';this.setHomePage('http://localhost:8080/StockManageSystem');\">设为主页 -</a>\r\n");
      out.write("                    <a href=\"javascript:window.external.AddFavorite('http://localhost:8080/StockManageSystem','存储系统')\" style=\"color:gray\">收藏本页 -</a>\r\n");
      out.write("                    <a href=\"mailto:123@***.com.cn\" style=\"color:gray\">联系我们</a>\r\n");
      out.write("                    &nbsp;\r\n");
      out.write("                </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("\t            <!-- 导航菜单 -->\r\n");
      out.write("            <tr height=\"56\">\r\n");
      out.write("                <td width=\"220\" height=\"150\" colspan=\"2\" background=\"images/back.png\" heigth=\"200\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
