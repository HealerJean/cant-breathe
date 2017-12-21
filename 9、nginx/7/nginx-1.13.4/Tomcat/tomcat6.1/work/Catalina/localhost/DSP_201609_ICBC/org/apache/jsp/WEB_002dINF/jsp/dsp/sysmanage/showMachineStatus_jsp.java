package org.apache.jsp.WEB_002dINF.jsp.dsp.sysmanage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class showMachineStatus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=gbk");
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
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE script PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<META HTTP-EQUIV=\"pragma\" CONTENT=\"private, no-cache, no-store, proxy-revalidate, no-transform\">\r\n");
      out.write("<META HTTP-EQUIV=\"Cache-Control\" CONTENT=\"private, no-cache, no-store, proxy-revalidate, no-transform\">\r\n");
      out.write("<META HTTP-EQUIV=\"expires\" CONTENT=\"-1\">\r\n");
      out.write("<head>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/json2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction initLineChart(userTime){\r\n");
      out.write("\t\tif(userTime == null || userTime.length == 0){\r\n");
      out.write("\t\t\treturn ;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tr = null;\r\n");
      out.write("\t\tvar xUseTime = new Array();\r\n");
      out.write("\t\tfor(i in userTime){\r\n");
      out.write("\t\t\txUseTime[i] = i;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar options = {\r\n");
      out.write("\t\t\t\taxis: \"0 0 1 1\", // Where to put the labels (trbl)\r\n");
      out.write("\t\t\t\taxisxstep: 10, // How many x interval labels to render (axisystep does the same for the y axis)\r\n");
      out.write("\t\t\t\taxisystep: 20,\r\n");
      out.write("\t\t\t\tshade:false, // true, false\r\n");
      out.write("\t\t\t\tsmooth:true, \r\n");
      out.write("\t\t\t\tsymbol:\"circle\",\r\n");
      out.write("\t\t\t\tcolors:[\"#A88\"],\r\n");
      out.write("\t\t\t\tmaxy:100\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\r\n");
      out.write("\t\t\t$(function () {\r\n");
      out.write("\t\t\t\t// Make the raphael object\r\n");
      out.write("\t\t\t\tvar r = Raphael(\"chartHolder\"); \r\n");
      out.write("\t\t\t\tvar lines = r.linechart(\r\n");
      out.write("\t\t\t\t\t20, // X start in pixels\r\n");
      out.write("\t\t\t\t\t10, // Y start in pixels\r\n");
      out.write("\t\t\t\t\t600, // Width of chart in pixels\r\n");
      out.write("\t\t\t\t\t400, // Height of chart in pixels\r\n");
      out.write("\t\t\t\t\t[xUseTime],//xUseTime, // Array of x coordinates equal in length to ycoords\r\n");
      out.write("\t\t\t\t\t[userTime],//useTimeTemp, // Array of y coordinates equal in length to xcoords\r\n");
      out.write("\t\t\t\t\toptions // opts object\r\n");
      out.write("\t\t\t\t).hover(function () {\r\n");
      out.write("\t\t\t        this.tags = r.set();\r\n");
      out.write("\t\t\t        for (var i = 0, ii = this.y.length; i < ii; i++) {\r\n");
      out.write("\t\t\t        \tif(this.symbols[i] != null){\r\n");
      out.write("\t\t\t        \t\tthis.tags.push(r.tag(this.x, this.y[i], this.values[i], 16, 10).insertBefore(this).attr([{ fill: \"#fff\" }, { fill: this.symbols[i].attr(\"fill\") }]));\r\n");
      out.write("\t\t\t        \t}\r\n");
      out.write("\t\t\t        }\r\n");
      out.write("\t\t\t    }, function () {\r\n");
      out.write("\t\t\t    \tthis.tags && this.tags.remove();\r\n");
      out.write("\t\t\t    });\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t// Modify the x axis labels\r\n");
      out.write("\t\t\t\tvar xText = lines.axis[0].text.items;\t\t\r\n");
      out.write("\t\t\t\tfor(var i in xText){ // Iterate through the array of dom elems, the current dom elem will be i\r\n");
      out.write("//\t\t\t \t\tvar _oldLabel = (xText[i].attr('text') + \"\").split('.'), // Get the current dom elem in the loop, and split it on the decimal\r\n");
      out.write("//\t\t\t \t\t\t_newLabel = _oldLabel[0] + \":\" + (_oldLabel[1] == undefined ? '' : ''); // Format the result into time strings\r\n");
      out.write("\t\t\t\t\txText[i].attr({'text': i}); // Set the text of the current elem with the result\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("</script> \r\n");
      out.write(" <script type=\"text/javascript\"> \r\n");
      out.write(" \tfunction frashTypeChange(){ \r\n");
      out.write(" \t\tvar second = $(\"#second\").val(); \r\n");
      out.write("\t\tsetTimeout(function(){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t \t\t   url: 'sysManageAction!showCpuStatus.do',\r\n");
      out.write("\t\t \t\t   processData: false,\r\n");
      out.write("\t\t \t\t   data: '',\r\n");
      out.write("\t\t \t\t   cache:false,\r\n");
      out.write("\t\t \t\t   beforeSend:function(){\r\n");
      out.write("\t\t \t\t\t   //将dwz框架“数据加载中提示删除”\r\n");
      out.write("\t\t \t\t\t  var ajaxbg=$(\"#background,#progressBar\");\r\n");
      out.write("\t\t \t\t\t  ajaxbg.hide();\r\n");
      out.write("\t\t \t\t   },\r\n");
      out.write("\t\t \t\t   success: function(data){\r\n");
      out.write("\t\t \t\t\t  var cpu0 = JSON.parse((JSON.parse(data).message).replace(new RegExp(\"'\",\"gm\"),\"\\\"\")).cpu0;\r\n");
      out.write("\t\t \t\t\t  var userTime = new Array();\r\n");
      out.write("\t\t \t\t\t  $(cpu0).each(function(i){\r\n");
      out.write("\t\t\t\t\t\t  userTime[i] = cpu0[i].cpuUsageInfoVO.userTime;\r\n");
      out.write("\t\t\t\t\t\t  userTime[i] = parseFloat(userTime[i]);\r\n");
      out.write("\t\t \t\t\t  });\r\n");
      out.write("\t\t \t\t\t  $(\"#chartHolder\").html(\"\");\r\n");
      out.write("\t\t\t\t\t  initLineChart(userTime);\r\n");
      out.write("\t\t  \t\t   }, \r\n");
      out.write("\t\t  \t\t   error:function(){\r\n");
      out.write("\t\t  \t\t\t   alert(\"error\");\r\n");
      out.write("\t\t \t\t   }\r\n");
      out.write("\t\t \t\t});\r\n");
      out.write("\t\t\tvar frashType = $(\"#frashType\").val(); \r\n");
      out.write("\t\t\tif(frashType == 1){\r\n");
      out.write("\t\t\t\tfrashTypeChange();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t},1000); \r\n");
      out.write(" \t} \r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\tinitLineChart(null);\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<div>\r\n");
      out.write("<form id=\"pagerForm\" method=\"post\">\r\n");
      out.write("\t<input type=\"hidden\" id=\"auto\"/>\r\n");
      out.write("\t <label>刷新模式</label>\r\n");
      out.write("     <select name=\"frashType\" id=\"frashType\" onchange=\"frashTypeChange()\">\r\n");
      out.write("         <option value=\"0\">手动</option>\r\n");
      out.write("         <option value=\"1\">自动</option>\r\n");
      out.write("     </select>\r\n");
      out.write("     <button onclick=\"javascript:$('#chartHolder').loadUrl('sysManageAction!showMachineStatus.do',null, null);\">刷新</button>\r\n");
      out.write(" <label>时间：</label>\r\n");
      out.write("     <select name=\"second\" id=\"second\">\r\n");
      out.write("         <option value=\"1000\">1秒</option>\r\n");
      out.write("         <option value=\"3000\">3秒</option>\r\n");
      out.write("         <option value=\"5000\">5秒</option>\r\n");
      out.write("         <option value=\"10000\">10秒</option>\r\n");
      out.write("         <option value=\"30000\">30秒</option>\r\n");
      out.write("     </select>\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"chartHolder\" style=\"width: 650px;height: 450px\"></div>\r\n");
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
