<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@ page import="java.util.*" %>
<%@ page import="jp.co.dol.model.contents.*" %>
<%
	String error = (String)request.getAttribute("error");
%>
<!DOCTYPE html>
<html xml:lang="ja" lang="ja" dir="ltr">
	<head>
		<meta charset="utf-8"/>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta http-equiv="Content-Style-Type" content="text/css">
		<meta http-equiv="Content-Script-Type" content="text/javascript">
		<meta name="viewport" content="width=device-width,minimum-scale=1,maximum-scale=1,user-scalable=no">
		<title>エラー</title>
		<link rel="stylesheet" href="/css/common.0.3.css" type="text/css">
		<link rel="stylesheet" href="/css/common.css" type="text/css">
		<link rel="stylesheet" href="/css/config.css" type="text/css">
		<script type='text/javascript' src='/js/jquery-1.6.2.min.js'></script>
		<script type='text/javascript' src='/js/jquery.micro_template.js'></script>
		<script type='text/javascript' src='/js/util.js'></script>
		<script type='text/javascript' src='/js/blog_menu.js'></script>
		<script type="text/javascript" src="/js/form_control.js"></script>
	</head>
	<body>
		<noscript><div>JavaScriptが無効に設定されています。一部の機能が動作しない場合があります。</div></noscript>
		<div id="contentsHeader">
			<p class="headerBack"><a href="../">戻る</a></p>
			<p class="headerHint">
				<span id="blogMenu" class="headerMenu"><a href="javascript:void(0)" id="blogMenuButton">メニュー</a></span>
			</p>
			<h1 class="headerTitle">エラー</h1>
		</div>
		<div id="blogMenuList">
			<div class="blogNavi">
				<ul>
					<li class="naviEdit"><a href="/menu">メニュー</a></li>
					<li class="naviArticle"><a href="/menu">メニュー</a></li>
				</ul>
			</div>
		</div>
		<div id="container">
			<form name="form1" method="POST" id="config">
				<ul class="formBox2">
					<li>
						<label for="title" class="labelTitle">エラー内容</label>
						<div class="labelData"><%= error %></div>
					</li>
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