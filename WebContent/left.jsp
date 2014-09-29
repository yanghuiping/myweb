<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>left</title>
<style type="text/css">
<!--
html {
	width: 100%;
	height: 100%;
}
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	height: 100%;
	width: 100%;
}

.STYLE2 {
	color: #43860c;
	font-size: 12px;
}

a:link {
	font-size: 12px;
	text-decoration: none;
	color: #43860c;
}

a:visited {
	font-size: 12px;
	text-decoration: none;
	color: #43860c;
}

a:hover {
	font-size: 12px;
	text-decoration: none;
	color: #FF0000;
}
-->
</style>
<script type="text/javascript" src="xtree/xtree.js"></script>
<link type="text/css" rel="stylesheet" href="xtree/xtree.css">
<script type="text/JavaScript">
<!--
function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}
//-->
</script>
</head>
<body>
<table height="100%" border="0" cellpadding="0" cellspacing="0" style="height:100%">
  <tr>
    <td valign="top" style="border-right:solid 1px #9ad452;border-left:solid 1px #9ad452;">
    <table width="100%" border="0" cellspacing="0" cellpadding="0" style="table-layout:fixed">
      <tr>
        <td height="26" background="images/web/main/main_21.gif">&nbsp;</td>
      </tr>
      <tr>
        <td height="80" style="background-image:url(images/web/main/main_23.gif); background-repeat:repeat-x;">
	        <table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
	          <tr>
	            <td height="45"><div align="center"><a href="user/demo.htm" target="rightFrame"><img src="images/web/main/main_26.gif" name="Image1" height="40" border="0" id="Image1" onmouseover="MM_swapImage('Image1','','images/web/main/main_26_1.gif',1)" onmouseout="MM_swapImgRestore()" /></a></div></td>
	            <td><div align="center"><a href="user/demo.htm" target="rightFrame"><img src="images/web/main/main_28.gif" name="Image2" height="40" border="0" id="Image2" onmouseover="MM_swapImage('Image2','','images/web/main/main_29_1.gif',1)" onmouseout="MM_swapImgRestore()" /></a></div></td>
	            <td><div align="center"><a href="user/demo.htm" target="rightFrame"><img src="images/web/main/main_31.gif" name="Image3" height="40" border="0" id="Image3" onmouseover="MM_swapImage('Image3','','images/web/main/main_31_1.gif',1)" onmouseout="MM_swapImgRestore()" /></a></div></td>
	          </tr>
	          <tr>
	            <td height="25"><div align="center" class="STYLE2"><a href="user/demo.htm" target="rightFrame">配置管理</a></div></td>
	            <td><div align="center" class="STYLE2"><a href="user/demo.htm" target="rightFrame">日志管理</a></div></td>
	            <td><div align="center" class="STYLE2"><a href="user/demo.htm" target="rightFrame">数据分析</a></div></td>
	          </tr>
	        </table>
        </td>
      </tr>
      <tr>
        <td style="line-height:4px; background:url(images/web/main/main_38.gif)">&nbsp;</td>
      </tr>
      <tr>
        <td>
        	<img src="images/web/main/left_tree.gif" />
        	<div style="margin-left: 10px;margin-top: 10px;visibility:hidden">
	        	<script type="text/javascript">
					var tree = new WebFXTree('xxx管理系统');
					tree.setBehavior('classic');
					var demo = new WebFXTreeItem('demo','','rightFrame',tree);
					var demo1 = new WebFXTreeItem('demo1','','rightFrame',demo);
					new WebFXTreeItem("分页查询",'user/demo.htm','rightFrame',tree);
					document.write(tree);
				</script>
			</div>
        </td>
      </tr>
    </table>
    </td>
  </tr>
</table>
</body>
</html>