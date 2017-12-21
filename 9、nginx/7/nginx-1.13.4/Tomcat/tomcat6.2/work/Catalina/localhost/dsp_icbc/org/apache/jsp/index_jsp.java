package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=7\" />\r\n");
      out.write("<title>数据共享平台</title>\r\n");
      out.write("\r\n");
      out.write("<link href=\"themes/green/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("<link href=\"themes/css/core.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("<link href=\"themes/css/print.css\" rel=\"stylesheet\" type=\"text/css\" media=\"print\"/>\r\n");
      out.write("<link href=\"uploadify/css/uploadify.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("<!--[if IE]>\r\n");
      out.write("<link href=\"themes/css/ieHack.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\r\n");
      out.write("<!--[if lte IE 9]>\r\n");
      out.write("<script src=\"js/speedup.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/jquery-1.7.2.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/jquery.cookie.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/jquery.validate.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/jquery.bgiframe.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"xheditor/xheditor-1.1.14-zh-cn.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"uploadify/scripts/jquery.uploadify.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- svg图表  supports Firefox 3.0+, Safari 3.0+, Chrome 5.0+, Opera 9.5+ and Internet Explorer 6.0+ -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"chart/raphael.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"chart/g.raphael.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"chart/g.bar.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"chart/g.line.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"chart/g.pie.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"chart/g.dot.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/dwz.core.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.util.date.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.validate.method.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.regional.zh.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.barDrag.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.drag.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.tree.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.accordion.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.ui.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.theme.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.switchEnv.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.alertMsg.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.contextmenu.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.navTab.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.tab.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.resize.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.dialog.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.dialogDrag.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.sortDrag.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.cssTable.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.stable.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.taskBar.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.ajax.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.pagination.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.database.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.datepicker.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.effects.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.panel.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.checkbox.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.history.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.combox.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"js/dwz.print.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<!--\r\n");
      out.write("<script src=\"bin/dwz.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("-->\r\n");
      out.write("<script src=\"js/dwz.regional.zh.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("\tDWZ.init(\"dwz.frag.xml\", {\r\n");
      out.write("\t\tloginUrl:\"login_dialog.html\", loginTitle:\"登录\",\t// 弹出登录对话框\r\n");
      out.write("//\t\tloginUrl:\"login.html\",\t// 跳到登录页面\r\n");
      out.write("\t\tstatusCode:{ok:200, error:300, timeout:301}, //【可选】\r\n");
      out.write("\t\tpageInfo:{pageNum:\"pageNum\", numPerPage:\"numPerPage\", orderField:\"orderField\", orderDirection:\"orderDirection\"}, //【可选】\r\n");
      out.write("\t\tdebug:false,\t// 调试模式 【true|false】\r\n");
      out.write("\t\tcallback:function(){\r\n");
      out.write("\t\t\tinitEnv();\r\n");
      out.write("\t\t\t$(\"#themeList\").theme({themeBase:\"themes\"}); // themeBase 相对于index页面的主题base路径\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body scroll=\"no\">\r\n");
      out.write("\t<div id=\"layout\">\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<div class=\"headerNav\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- navMenu -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"leftside\">\r\n");
      out.write("\t\t\t<div id=\"sidebar_s\">\r\n");
      out.write("\t\t\t\t<div class=\"collapse\">\r\n");
      out.write("\t\t\t\t\t<div class=\"toggleCollapse\"><div></div></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"sidebar\">\r\n");
      out.write("\t\t\t\t<div class=\"toggleCollapse\"><h2>主菜单</h2><div>收缩</div></div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"accordion\" fillSpace=\"sidebar\">\r\n");
      out.write("\t\t\t\t\t<div class=\"accordionHeader\">\r\n");
      out.write("\t\t\t\t\t\t<h2><span>Folder</span>系统管理</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"accordionContent\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"tree treeFolder\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">状态监控</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/dsp/sysManageAction!showMachineStatus.do\" target=\"navTab\" rel=\"machineStatus\" fresh=\"true\">服务器状态</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">WS监控</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/dsp/payInRequestAction!queryInRequests.do\" target=\"navTab\" rel=\"inRequest\" fresh=\"true\">外部请求日志</a></li><!-- t_ws_in_request -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/dsp/payOutRequestsAction!queryOutRequests.do\" target=\"navTab\" rel=\"outRequest\" fresh=\"true\">请求外部日志</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/dsp/payInRequestAction!queryInMessage.do\" target=\"navTab\" rel=\"inMessage\" fresh=\"true\">外部请求消息日志</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/dsp/payOutRequestsAction!queryOutMessage.do\" target=\"navTab\" rel=\"outMessage\" fresh=\"true\">请求外部消息日志</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/dsp/sysManageAction!queryWsdest.do\" target=\"navTab\" rel=\"wSDLConfig\" fresh=\"true\">外部服务配置</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">JMS监控</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/dsp/payLogAction!queryReceMsg.do\" target=\"navTab\" rel=\"jMSMessage\" fresh=\"true\">JMS消息查询（后期）</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"accordionHeader\">\r\n");
      out.write("\t\t\t\t\t\t<h2><span>Folder</span>业务管理</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"accordionContent\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"tree treeFolder\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">单证管理</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/dsp/payDocInfoAction!queryDocInfo.do\" target=\"navTab\" rel=\"payDoc\" fresh=\"true\">业务单证查询</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">回调管理</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/dsp/sendInstancesAction!querySendInstances.do\" target=\"navTab\" rel=\"sendInstance\" fresh=\"true\">业务回调日志</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"\">文件接收</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"/dsp/payReceFileAction!selectInfoWithProp.do\" target=\"navTab\" rel=\"receFile\" fresh=\"true\">接收文件查询</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"container\">\r\n");
      out.write("\t\t\t<div id=\"navTab\" class=\"tabsPage\">\r\n");
      out.write("\t\t\t\t<div class=\"tabsPageHeader\">\r\n");
      out.write("\t\t\t\t\t<div class=\"tabsPageHeaderContent\"><!-- 显示左右控制时添加 class=\"tabsPageHeaderMargin\" -->\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"navTab-tab\">\r\n");
      out.write("\t\t\t\t\t\t\t<li tabid=\"main\" class=\"main\" style=\"visibility: hidden;width: 1px;\"><span class=\"home_icon\">我的主页</span></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"tabsLeft\">left</div><!-- 禁用只需要添加一个样式 class=\"tabsLeft tabsLeftDisabled\" -->\r\n");
      out.write("\t\t\t\t\t<div class=\"tabsRight\">right</div><!-- 禁用只需要添加一个样式 class=\"tabsRight tabsRightDisabled\" -->\r\n");
      out.write("\t\t\t\t\t<div class=\"tabsMore\">more</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"navTab-panel tabsPageContent layoutBox\">\r\n");
      out.write("\t\t\t\t\t<div class=\"page unitBox\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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
