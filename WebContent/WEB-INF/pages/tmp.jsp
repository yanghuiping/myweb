<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="/ncs" prefix="ncs"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${ctx}/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
var  highlightcolor='#eafcd5';
var  clickcolor='#51b2f6';
function  changeto(){
source=event.srcElement;
if  (source.tagName=="TR"||source.tagName=="TABLE")
return;
while(source.tagName!="TD")
source=source.parentElement;
source=source.parentElement;
cs  =  source.children;
//alert(cs.length);
if  (cs[1].style.backgroundColor!=highlightcolor&&source.id!="nc"&&cs[1].style.backgroundColor!=clickcolor)
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor=highlightcolor;
}
}

function  changeback(){
if  (event.fromElement.contains(event.toElement)||source.contains(event.toElement)||source.id=="nc")
return
if  (event.toElement!=source&&cs[1].style.backgroundColor!=clickcolor)
//source.style.backgroundColor=originalcolor
for(i=0;i<cs.length;i++){
	cs[i].style.backgroundColor="";
}
}
</script>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-center: 0px;
	margin-bottom: 0px;
}
.STYLE1 {font-size: 12px}
.STYLE4 {
	font-size: 12px;
	color: #1F4A65;
	font-weight: bold;
}

a:link {
	font-size: 12px;
	color: #06482a;
	text-decoration: none;

}
a:visited {
	font-size: 12px;
	color: #06482a;
	text-decoration: none;
}
a:hover {
	font-size: 12px;
	color: #FF0000;
	text-decoration: underline;
}
a:active {
	font-size: 12px;
	color: #FF0000;
	text-decoration: none;
}
.STYLE7 {font-size: 12}

-->
</style>
</head>
<body>
	<form name="managerForm" id="managerForm" action="demo.htm" method="post">
		<table border="0" cellpadding="0" cellspacing="0">
			<tr>
				<td align="left">用户名称：</td>
				<td align="left">
					<input name="userName" id="userName" type="text" value="${user.userName}" style="width: 150px" />
				</td>
				<td align="left">开始时间：</td>
				<td align="left">
					<input type="text" name="startTime" id="startTime" class="Wdate" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${user.startTime}" />" onClick="WdatePicker()" style="cursor: pointer" readonly/>
				</td>
				<td align="left">结束时间：</td>
				<td align="left">
					<input type="text" name="endTime" id="endTime" class="Wdate" value="<fmt:formatDate pattern="yyyy-MM-dd" value="${user.endTime}" />" onClick="WdatePicker()" style="cursor: pointer" readonly/>
				</td>
				<td align="left">
					<input name="cx" type="submit" value="查询" style="cursor: pointer" />
				</td>
				<td align="left">
					<input name="cz" type="reset" id="resetBtn" value="重置" style="cursor: pointer" />
				</td>
			</tr>
		</table>
	</form>
	<form name="managerhiddenForm" id="managerhiddenForm" action="demo.htm"
		method="post">
		<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
		  <tr>
		    <td height="30"><table width="100%" border="0" cellspacing="0" cellpadding="0">
		      <tr>
		        <td width="15" height="30"><img src="../images/web/tab/images/tab_03.gif" width="15" height="30" /></td>
		        <td width="1101" background="../images/web/tab/images/tab_05.gif"><img src="../images/web/tab/images/311.gif" width="16" height="16" /> <span class="STYLE4">办公用品采购列表</span></td>
		        <td width="281" background="../images/web/tab/images/tab_05.gif"><table border="0" align="center" cellpadding="0" cellspacing="0">
		            <tr>
		              <td width="60"><table width="87%" border="0" cellpadding="0" cellspacing="0">
		                  <tr>
		                    <td class="STYLE1"><div align="center">
		                        <input type="checkbox" name="checkbox62" value="checkbox" />
		                    </div></td>
		                    <td class="STYLE1"><div align="center">全选</div></td>
		                  </tr>
		              </table></td>
		              <td width="60"><table width="90%" border="0" cellpadding="0" cellspacing="0">
		                  <tr>
		                    <td class="STYLE1"><div align="center"><img src="../images/web/tab/images/001.gif" width="14" height="14" /></div></td>
		                    <td class="STYLE1"><div align="center">新增</div></td>
		                  </tr>
		              </table></td>
		              <td width="60"><table width="90%" border="0" cellpadding="0" cellspacing="0">
		                  <tr>
		                    <td class="STYLE1"><div align="center"><img src="../images/web/tab/images/114.gif" width="14" height="14" /></div></td>
		                    <td class="STYLE1"><div align="center">修改</div></td>
		                  </tr>
		              </table></td>
		              <td width="52"><table width="88%" border="0" cellpadding="0" cellspacing="0">
		                  <tr>
		                    <td class="STYLE1"><div align="center"><img src="../images/web/tab/images/083.gif" width="14" height="14" /></div></td>
		                    <td class="STYLE1"><div align="center">删除</div></td>
		                  </tr>
		              </table></td>
		            </tr>
		        </table></td>
		        <td width="14"><img src="../images/web/tab/images/tab_07.gif" width="14" height="30" /></td>
		      </tr>
		    </table></td>
		  </tr>
		  <tr>
		  	<td>
				<table width="99%" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#c0de98" onmouseover="changeto()"  onmouseout="changeback()">
					<tr>
						<td width="15%" height="18" background="../images/web/tab/images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">序号</div></td>
						<td width="20%" height="18" background="../images/web/tab/images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">ID</div></td>
						<td width="20%" height="18" background="../images/web/tab/images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">用户名</div></td>
						<td width="20%" height="18" background="../images/web/tab/images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">密码</div></td>
						<td width="25%" height="18" background="../images/web/tab/images/tab_14.gif" class="STYLE1"><div align="center" class="STYLE2 STYLE1">操作</div></td>
					</tr>
					<c:forEach items="${page.data}" var="user" varStatus="serial">
						<tr id="${serial.index+1 }" align="center"
							onmouseover="this.style.backgroundColor='#fffcdd'"
							onmouseout="this.style.backgroundColor='#ffffff'">
							<td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">${serial.index+1+page.pageSize*(page.currentPageNo-1)}</div></td>
							<td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">${user.id}</div></td>
							<td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">${user.userName}</div></td>
							<td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1">${user.passWord}</div></td>
							<td height="18" bgcolor="#FFFFFF" class="STYLE2"><div align="center" class="STYLE2 STYLE1"><a href="#">浏览</a> <a href="#">修改</a></div></td>
						</tr>
					</c:forEach>
					<c:if test="${fn:length(page.data)==0}">
						<tr bgcolor="white">
							<td colspan="5">没有数据</td>
						</tr>
					</c:if>
					<tr>
						<td height="18" bgcolor="#FFFFFF" class="STYLE2" align="right" colspan="5">
							<div align="right" class="STYLE2 STYLE1">
								<ncs:page pageSize="${page.pageSize}"
									currentPageNo="${page.currentPageNo }"
									formId="managerhiddenForm" totalCount="${page.totalCount }"
									totalPageCount="${page.totalPageCount }" />
							</div>
						</td>
					</tr>
				</table>  	
		  	</td>
		  </tr>
  	</table>
</form>
</body>
</html>