/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-03-19 13:27:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>晶科物流管理系统</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/css.css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery1.9.0.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/sdmenu.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/laydate/laydate.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("\t <div class=\"logo\"><img  src=\"img/logo.png\" /></div>\r\n");
      out.write("     \r\n");
      out.write("\t\t\t\t<div class=\"header-right\">\r\n");
      out.write("                <i class=\"icon-question-sign icon-white\"></i> <a href=\"#\">帮助</a> <i class=\"icon-off icon-white\"></i> <a id=\"modal-973558\" href=\"#modal-container-973558\" role=\"button\" data-toggle=\"modal\">注销</a> <i class=\"icon-user icon-white\"></i> <a href=\"#\">开票员的工作平台</a> <i class=\"icon-envelope icon-white\"></i> <a href=\"#\">发送短信</a>\r\n");
      out.write("                <div id=\"modal-container-973558\" class=\"modal hide fade\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\" style=\"width:300px; margin-left:-150px; top:30%\">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
      out.write("\t\t\t\t\t <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\r\n");
      out.write("\t\t\t\t\t<h3 id=\"myModalLabel\">\r\n");
      out.write("\t\t\t\t\t\t注销系统\r\n");
      out.write("\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t您确定要注销退出系统吗？\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t <button class=\"btn\" data-dismiss=\"modal\" aria-hidden=\"true\">关闭</button> <a class=\"btn btn-primary\" style=\"line-height:20px;\" href=\"登录.html\" >确定退出</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- 顶部 -->     \r\n");
      out.write("            \r\n");
      out.write("<div id=\"middle\">\r\n");
      out.write("     <div class=\"left\">\r\n");
      out.write("     \r\n");
      out.write("     <script type=\"text/javascript\">\r\n");
      out.write("var myMenu;\r\n");
      out.write("window.onload = function() {\r\n");
      out.write("\tmyMenu = new SDMenu(\"my_menu\");\r\n");
      out.write("\tmyMenu.init();\r\n");
      out.write("};\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div id=\"my_menu\" class=\"sdmenu\">\r\n");
      out.write("\t<div class=\"collapsed\">\r\n");
      out.write("\t\t<span>业务处理</span>\r\n");
      out.write("\t\t<a href=\"新增订单.html\">新增订单</a>\r\n");
      out.write("\t\t<a href=\"查询页面.html\">电脑开票</a>\r\n");
      out.write("\t\t<a href=\"分理处发货排行榜.html\">票据补录</a>\r\n");
      out.write("\t\t<a href=\"开票界面.html\">票单复核</a>\r\n");
      out.write("\t\t<a href=\"客户投诉.html\">货物配载</a>\r\n");
      out.write("\t\t<a href=\"线路管理.html\">发车清单</a>\r\n");
      out.write("\t\t<a href=\"#\">到货确认</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"collapsed\">\r\n");
      out.write("\t\t<span>统计</span>\r\n");
      out.write("\t\t<a href=\"#\">统计</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"collapsed\">\r\n");
      out.write("\t\t<span>资金结算</span>\r\n");
      out.write("\t\t <a href=\"#\">提货登记</a>\r\n");
      out.write("\t\t <a href=\"#\">收款核销</a>\r\n");
      out.write("\t\t <a href=\"#\">现金转账</a>\r\n");
      out.write("\t\t <a href=\"#\">现付结算</a>\r\n");
      out.write("\t\t <a href=\"#\">返款结算</a>\r\n");
      out.write("\t\t <a href=\"#\">提付结算</a>\r\n");
      out.write("\t\t <a href=\"#\">浦发打卡</a>\r\n");
      out.write("\t\t <a href=\"#\">建行打卡</a>\r\n");
      out.write("\t\t <a href=\"#\">其他打卡</a>\r\n");
      out.write("\t\t <a href=\"#\">原返提货</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("    \r\n");
      out.write(" \t<div class=\"collapsed\">\r\n");
      out.write("\t\t<span>票据查询</span>\r\n");
      out.write("\t\t<a href=\"#\">票据查询</a>\r\n");
      out.write("\t\t<a href=\"#\">跟踪查询</a>\r\n");
      out.write("\t\t<a href=\"#\">车次查询</a>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write(" \t<div class=\"collapsed\">\r\n");
      out.write("\t\t<span>数据统计</span>\r\n");
      out.write("\t\t   <a href=\"#\">放款统计</a>\r\n");
      out.write("\t\t   <a href=\"#\">综合统计</a>\r\n");
      out.write("\t\t   <a href=\"#\">司机提成</a>\r\n");
      out.write("\t\t   <a href=\"#\">收款详单</a>\r\n");
      out.write("\t\t   <a href=\"#\">每日汇总</a>\r\n");
      out.write("\t\t   <a href=\"#\">车辆运费</a>\r\n");
      out.write("\t\t   <a href=\"#\">原返收款明细</a>\r\n");
      out.write("\t\t   <a href=\"#\">现付确认详单</a>\r\n");
      out.write("\t\t   <a href=\"#\">回单结算明细</a>\r\n");
      out.write("\t\t   <a href=\"#\">返款确认明细</a>\r\n");
      out.write("\t\t   <a href=\"#\">提付结算明细</a>\r\n");
      out.write("\t\t   <a href=\"#\">分公司排行</a>\r\n");
      out.write("\t\t   <a href=\"#\">浦发转帐统计</a>\r\n");
      out.write("\t\t   <a href=\"#\">发货排行</a>\r\n");
      out.write("\t\t   <a href=\"#\">建行转帐统计</a>\r\n");
      out.write("\t\t   <a href=\"#\">其他转帐统计</a>\r\n");
      out.write("\t\t   <a href=\"#\">分理处排行</a>\r\n");
      out.write("\t\t   <a href=\"#\">分公司月运费对比</a>\r\n");
      out.write("\t\t   <a href=\"#\">分理处月运费对比</a>\r\n");
      out.write("\t\t   <a href=\"#\">线路货款未到排行</a>\r\n");
      out.write("\t\t   <a href=\"#\">分公司入库报表</a>\r\n");
      out.write("\t\t   <a href=\"#\">分公司收款日报</a>\r\n");
      out.write("\t\t   <a href=\"#\">分公司当日库存</a>\r\n");
      out.write("\t\t   <a href=\"#\">分公司往日库存</a>\r\n");
      out.write("\t\t   <a href=\"#\">专线现付统计</a>\r\n");
      out.write("\t\t   <a href=\"#\">专线分理处统计</a>\r\n");
      out.write("\t\t   <a href=\"#\">分理处专线统计</a>\r\n");
      out.write("\t\t   <a href=\"#\">货款回款率统计</a>\r\n");
      out.write("\t\t   <a href=\"#\">线路运量</a>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write(" \t<div class=\"collapsed\">\r\n");
      out.write("\t\t<span>单据管理</span>\r\n");
      out.write("\t\t<a href=\"#\">作废挂失</a>\r\n");
      out.write("\t\t<a href=\"#\">取消修改</a>\r\n");
      out.write("\t\t<a href=\"#\">修改清单</a>\r\n");
      out.write("\t\t<a href=\"#\">退单管理</a>\r\n");
      out.write("\t\t<a href=\"#\">转帐差错处理</a>\r\n");
      out.write("\t\t<a href=\"#\">运单修改查询</a>\r\n");
      out.write("\t\t<a href=\"#\">复核异常处理</a>\r\n");
      out.write("\t\t<a href=\"#\">运单修改</a>\r\n");
      out.write("\t\t<a href=\"#\">异常处理</a>\r\n");
      out.write("\t\t<a href=\"#\">单据备注</a>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write(" \t<div class=\"collapsed\">\r\n");
      out.write("\t\t<span>系统管理</span>\r\n");
      out.write("\t\t <a href=\"#\">线路管理</a>\r\n");
      out.write("\t\t   <a href=\"#\">手续费设置</a>\r\n");
      out.write("\t\t   <a href=\"#\">更改密码</a>\r\n");
      out.write("\t\t   <a href=\"#\">系统日志</a>\r\n");
      out.write("\t\t   <a href=\"#\">帐号管理</a>\r\n");
      out.write("\t\t   <a href=\"#\">复核设置</a>\r\n");
      out.write("\t\t   <a href=\"#\">部门管理</a>\r\n");
      out.write("\t\t   <a href=\"#\">角色管理</a>\r\n");
      out.write("\t\t   <a href=\"#\">用户管理</a>\r\n");
      out.write("\t\t   <a href=\"#\">短信设置</a>\r\n");
      out.write("\t\t   <a href=\"#\">短信发送</a>\r\n");
      out.write("\t\t   <a href=\"#\">分理处分成设置</a>\r\n");
      out.write("\t\t   <a href=\"#\">省价格设置</a>\r\n");
      out.write("\t\t   <a href=\"#\">市价格设置</a>\r\n");
      out.write("\t\t   <a href=\"#\">县价格设置</a>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write(" \t<div class=\"collapsed\">\r\n");
      out.write("\t\t<span>回单管理</span>\r\n");
      out.write("\t\t<a href=\"#\">回单结算</a>\r\n");
      out.write("\t\t<a href=\"#\">回单查询</a>\r\n");
      out.write("\t\t<a href=\"#\">回单接收</a>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write(" \t<div class=\"collapsed\">\r\n");
      out.write("\t\t<span>财务管理</span>\r\n");
      out.write("\t\t<a href=\"#\">分公司日报</a>\r\n");
      out.write("\t\t<a href=\"#\">科目管理</a>\r\n");
      out.write("\t\t<a href=\"#\">费用录入</a>\r\n");
      out.write("\t\t<a href=\"#\">费用统计</a>\r\n");
      out.write("\t\t<a href=\"#\">当日对账</a>\r\n");
      out.write("\t\t<a href=\"#\">往日对账</a>\r\n");
      out.write("\t\t<a href=\"#\">利润分成</a>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"collapsed\">\r\n");
      out.write("    <span>车辆管理</span>\r\n");
      out.write("   <a href=\"#\">基本资料管理</a>\r\n");
      out.write("    <a href=\"#\">维修管理</a>\r\n");
      out.write("    <a href=\"#\">加油管理</a>\r\n");
      out.write("    <a href=\"#\">保养记录</a>\r\n");
      out.write("    <a href=\"#\">派车管理</a>\r\n");
      out.write("    <a href=\"#\">派车记录</a>\r\n");
      out.write("    <a href=\"#\">包车分账</a>\r\n");
      out.write("    <a href=\"#\">月分账</a>\r\n");
      out.write("    <a href=\"#\">事故业务</a>\r\n");
      out.write("    <a href=\"#\">保险业务</a>\r\n");
      out.write("    <a href=\"#\">司机档案</a>\r\n");
      out.write("    <a href=\"#\">行驶证</a>\r\n");
      out.write("    <a href=\"#\">营运证</a>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write(" \t<div class=\"collapsed\">\r\n");
      out.write("\t\t<span>中转处理</span>\r\n");
      out.write("\t\t<a href=\"#\">中转操作</a>\r\n");
      out.write("\t\t<a href=\"#\">中转单修改</a>\r\n");
      out.write("\t\t<a href=\"#\">当日中转明细</a>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write(" \t<div class=\"collapsed\">\r\n");
      out.write("\t\t<span>客户管理</span>\r\n");
      out.write("\t\t<a href=\"#\">客户投诉</a>\r\n");
      out.write("\t\t<a href=\"#\">投诉处理</a>\r\n");
      out.write("\t\t<a href=\"#\">投诉查询</a>\r\n");
      out.write("\t\t<a href=\"#\">客户关怀</a>\r\n");
      out.write("\t\t<a href=\"#\">积分查询</a>\r\n");
      out.write("\t\t<a href=\"#\">分理处排行</a>\r\n");
      out.write("\t\t<a href=\"#\">客户管理</a>\r\n");
      out.write("\t\t<a href=\"#\">理赔申请</a>\r\n");
      out.write("\t\t<a href=\"#\">理赔审核</a>\r\n");
      out.write("\t\t<a href=\"#\">理赔结算</a>\r\n");
      out.write("\t\t<a href=\"#\">理赔查询</a>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write(" \t<div class=\"collapsed\">\r\n");
      out.write("\t\t<span>行政办公</span>\r\n");
      out.write("\t\t<a href=\"#\">文件管理</a>\r\n");
      out.write("\t\t<a href=\"#\">在线留言</a>\r\n");
      out.write("\t\t<a href=\"#\">人事管理</a>\r\n");
      out.write("\t\t<a href=\"#\">公告管理</a>\r\n");
      out.write("\t\t<a href=\"#\">罚款登记</a>\r\n");
      out.write("\t\t<a href=\"#\">滚动字幕</a>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write(" \t<div class=\"collapsed\">\r\n");
      out.write("\t\t<span>工资及包车费管理</span>\r\n");
      out.write("\t\t<a href=\"#\">工资管理</a>\r\n");
      out.write("\t\t<a href=\"#\">包车费管理</a>\r\n");
      out.write("\t\t<a href=\"#\">房租管理</a>\r\n");
      out.write("\t\t<a href=\"#\">货场费管理</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("  \t<div class=\"collapsed\">\r\n");
      out.write("\t\t<span>领导决策</span>\r\n");
      out.write("<a href=\"#\">新增客户分析</a>\r\n");
      out.write("<a href=\"#\">长期未发货分析</a>\r\n");
      out.write("<a href=\"#\">同比业务分析</a>\r\n");
      out.write("<a href=\"#\">环比业务分析</a>\r\n");
      out.write("<a href=\"#\">超期预警</a>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("     </div>\r\n");
      out.write("     <div class=\"Switch\"></div>\r\n");
      out.write("     <script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function(e) {\r\n");
      out.write("    $(\".Switch\").click(function(){\r\n");
      out.write("\t$(\".left\").toggle();\r\n");
      out.write("\t \r\n");
      out.write("\t\t});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("     <div class=\"right\"  id=\"mainFrame\">\r\n");
      out.write("     \r\n");
      out.write("     <div class=\"right_cont\">\r\n");
      out.write("<ul class=\"breadcrumb\">当前位置：\r\n");
      out.write("  <a href=\"#\">首页</a> \r\n");
      out.write("  \r\n");
      out.write("</ul>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("<!-- 底部 -->\r\n");
      out.write("<div id=\"footer\">版权所有：晶科客流 &copy; 2015&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"http://www.mycodes.net/\" target=\"_blank\">源码之家</a></div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write(" <script>\r\n");
      out.write("!function(){\r\n");
      out.write("laydate.skin('molv');\r\n");
      out.write("laydate({elem: '#Calendar'});\r\n");
      out.write("}();\r\n");
      out.write(" \r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
