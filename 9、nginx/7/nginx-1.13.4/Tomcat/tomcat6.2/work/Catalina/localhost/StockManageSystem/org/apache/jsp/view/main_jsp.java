package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/view/end.jsp");
  }

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

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	System.out.println(basePath);

	String mainPage=(String)request.getAttribute("mainPage");
	if(mainPage==null || mainPage.equals("")){
		mainPage="default.jsp";
	}

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<center>\r\n");
      out.write("        <table border=\"1\" width=\"920\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"white\">\r\n");
      out.write("            <tr><td colspan=\"2\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "top.jsp", out, false);
      out.write("</td></tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td width=\"230\" valign=\"top\" align=\"center\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "left.jsp", out, false);
      out.write("</td>\r\n");
      out.write("               <td width=\"690\" height=\"400\" align=\"center\" valign=\"top\" bgcolor=\"#FFFFFF\">");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${mainPage }", java.lang.String.class, (PageContext)_jspx_page_context, null, false), out, false);
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr><td colspan=\"2\">");
      out.write("\r\n");
      out.write("<html>\n");
      out.write("<head>\r\n");
      out.write("  <title>页尾</title>\r\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <center>\r\n");
      out.write("        <table border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <tr height=\"100\"><hr /></tr>\r\n");
      out.write("        </table>        \r\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("</td></tr>\r\n");
      out.write("        </table>        \r\n");
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
