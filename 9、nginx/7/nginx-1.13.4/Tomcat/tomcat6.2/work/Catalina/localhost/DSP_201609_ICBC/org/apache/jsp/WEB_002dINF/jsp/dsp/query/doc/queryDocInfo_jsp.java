package org.apache.jsp.WEB_002dINF.jsp.dsp.query.doc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class queryDocInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<base href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.scheme}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(':');
      out.write('/');
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.serverName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(':');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.serverPort}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form id=\"pagerForm\" method=\"post\" action=\"payDocInfoAction!queryDocInfo.do\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"pageNum\" value=\"1\" />\r\n");
      out.write("\t<input type=\"hidden\" name=\"numPerPage\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${numPerPage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<div class=\"pageHeader\">\r\n");
      out.write("\t<form onsubmit=\"return navTabSearch(this)\" action=\"payDocInfoAction!queryDocInfo.do\" method=\"post\">\r\n");
      out.write("\t<div class=\"searchBar\">\r\n");
      out.write("\t\t<table class=\"searchContent\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t    <label>管理人名称：</label>\r\n");
      out.write("\t\t\t\t\t<select name=\"docInfoVo.docInfoEO.provider\" >\r\n");
      out.write("                        <option value=\"\">全部</option>\r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </select>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<div class=\"subBar\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><div class=\"buttonActive\"><div class=\"buttonContent\"><button type=\"submit\">检索</button></div></div></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"pageContent\">\r\n");
      out.write("\t<table class=\"table\" width=\"100%\" layoutH=\"114\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr target=\"sid_user\" rel=\"1\">\r\n");
      out.write("\t\t\t\t<th width=\"25%\">单证名称</th>\r\n");
      out.write("\t\t\t\t<th width=\"10%\">所属业务类型</th>\r\n");
      out.write("\t\t\t\t<th width=\"20%\">管理人名称</th>\r\n");
      out.write("\t\t\t\t<th width=\"10%\">单证扫描最大行</th>\r\n");
      out.write("\t\t\t\t<th width=\"10%\">单证下载</th>\r\n");
      out.write("\t\t\t\t<th width=\"15%\">查看单证识别信息</th>\r\n");
      out.write("\t\t\t\t<th width=\"10%\">点击上传新单证</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<div class=\"panelBar\">\r\n");
      out.write("\t\t<div class=\"pages\">\r\n");
      out.write("<!-- \t\t\t<span>显示</span> -->\r\n");
      out.write("<!-- \t\t\t<select class=\"combox\" name=\"numPerPage\" onchange=\"navTabPageBreak({numPerPage:this.value})\"> -->\r\n");
      out.write("<!-- \t\t\t\t<option value=\"10\">10</option> -->\r\n");
      out.write("<!-- \t\t\t\t<option value=\"20\">20</option> -->\r\n");
      out.write("<!-- \t\t\t\t<option value=\"50\">50</option> -->\r\n");
      out.write("<!-- \t\t\t\t<option value=\"100\">100</option> -->\r\n");
      out.write("<!-- \t\t\t</select> -->\r\n");
      out.write("\t\t\t<span>共");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pagerecord.totalCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("条</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"pagination\" targetType=\"navTab\" totalCount=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pagerecord.totalCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" numPerPage=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pagerecord.numPerPage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" pageNumShown=\"10\" currentPage=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pagerecord.pageNum}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/dsp/query/doc/queryDocInfo.jsp(26,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("item");
    // /WEB-INF/jsp/dsp/query/doc/queryDocInfo.jsp(26,24) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/dsp/query/doc/queryDocInfo.jsp(26,24) '${managerNames}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${managerNames}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        \t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.MANAGERCODE}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${provider eq item.MANAGERCODE?\"selected\":\"\" }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.MANAGERNAME}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/jsp/dsp/query/doc/queryDocInfo.jsp(55,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/dsp/query/doc/queryDocInfo.jsp(55,3) '${pagerecord.resultLists}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pagerecord.resultLists}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/dsp/query/doc/queryDocInfo.jsp(55,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("item");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<tr target=\"sid_user\" rel=\"1\" >\r\n");
          out.write("\t\t\t\t\t<td width=\"25%\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.docInfoEO.docName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td width=\"10%\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.businessName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td width=\"20%\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.managerName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td width=\"10%\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.docInfoEO.scanRow}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td width=\"10%\">\r\n");
          out.write("\t\t\t\t\t\t<a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${downLoadUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.docInfoEO.pkFilestore}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">点击下载</a>\t\t\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t<td width=\"15%\">\r\n");
          out.write("\t\t\t\t\t\t<a class=\"btnLook\" href=\"payDocInfoAction!queryDocInfoByDoccode.do?doccode=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.docInfoEO.docCode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" lookupGroup=\"obj\" lookupPk=\"messageFrom\" style=\"\" resizable=\"false\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.docInfoEO.docName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a>\t\t\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t<td width=\"10%\">\r\n");
          out.write("\t\t\t\t\t\t<a href=\"payDocInfoAction!initAddDocFile.do?doccode=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.docInfoEO.docCode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" lookupGroup=\"obj\" lookupPk=\"messageFrom\" style=\"\" resizable=\"false\" >点击上传</a>\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}
