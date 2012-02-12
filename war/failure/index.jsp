<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>
<%@ page import="javax.servlet.http.*" %>
<%
	HttpSession session = request.getSession(false);
	String err = (String)session.getAttribute("err");
	session.setAttribute("err",null);
%>
<!DOCTYPE html>
<html xml:lang="ja" lang="ja" dir="ltr">
	<head>
		<meta charset="utf-8"/>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta http-equiv="Content-Style-Type" content="text/css">
		<meta http-equiv="Content-Script-Type" content="text/javascript">
		<meta name="viewport" content="width=device-width,minimum-scale=1,maximum-scale=1,user-scalable=no">
		<title>障害一覧</title>
		<link rel="stylesheet" href="/css/common.0.3.css" type="text/css">
		<link rel="stylesheet" href="/css/common.css" type="text/css">
		<link rel="stylesheet" href="/css/config.css" type="text/css">
		<script type='text/javascript' src='/js/jquery-1.6.2.min.js'></script>
		<script type='text/javascript' src='/js/jquery.micro_template.js'></script>
		<script type='text/javascript' src='/js/util.js'></script>
		<script type='text/javascript' src='/js/blog_menu.js'></script>
		<script type='text/javascript' src='/js/form_control.js'></script>
		<script type='text/javascript'>
			<!--
				function onload() {
<%	if ( err!=null && !err.equals("") ) {	%>
					alert('<%= err %>');<%	}	%>
				}
			-->
		</script>
	</head>
	<body onload="onload();">
		<noscript><div>JavaScriptが無効に設定されています。一部の機能が動作しない場合があります。</div></noscript>
		<div id="contentsHeader">
			<p class="headerBack">&nbsp;</p>
			<p class="headerHint">
				<span id="blogMenu" class="headerMenu"><a href="javascript:void(0)" id="blogMenuButton">メニュー</a></span>
			</p>
			<h1 class="headerTitle">障害一覧</h1>
		</div>
		<div id="blogMenuList">
			<div class="blogNavi">
				<ul>
					<li class="naviEdit"><a href="/failure">障害一覧</a></li>
					<li class="naviArticle"><a href="/ment/emp">社員メンテ</a></li>
					<li class="naviArticle"><a href="/ment/project">案件メンテ</a></li>
				</ul>
			</div>
		</div>
		<div id="container">
			<form name="form1" method="POST" id="config">
				<ul class="formBox">
<c:forEach var="head" items="${failureList}" varStatus="hs" >
					<li>
						<label for="title" class="labelTitle"><a href="upd?key=${f:h(head.key)}">更新</a> ／ <a href="del?key=${f:h(head.key)}">削除</a></label>
						<label for="title" class="labelTitle">${f:h(head.no)}</label>
						<div class="labelData">[${f:h(head.postDate)}]&nbsp;&nbsp;${f:h(head.title)}</div>
					</li>
</c:forEach>
				</ul>
				<ul class="buttonBox">
					<li><input value="障害登録" class="button post" type="button" onclick="location.href='add'"></li>
				</ul>
			</form>
		</div>
		<footer id="globalFooter">
			<ul class="footerLink">
				<li>sys_dolphinさん</li>
<!--				<li><a href="/logout">ログアウト</a></li> -->
			</ul>
			<p class="poweredBy">powered by <a href="http://www.dolphin-system.co.jp/">dolphin-system</a></p>
		</footer>
	</body>
</html>
