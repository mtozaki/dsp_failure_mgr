<%@page pageEncoding="UTF-8" isELIgnored="false" session="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="f" uri="http://www.slim3.org/functions"%>
<%@ page import="jp.co.dol.model.contents.*" %>
<!DOCTYPE html>
<html xml:lang="ja" lang="ja" dir="ltr">
	<head>
		<meta charset="utf-8"/>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta http-equiv="Content-Style-Type" content="text/css">
		<meta http-equiv="Content-Script-Type" content="text/javascript">
		<meta name="viewport" content="width=device-width,minimum-scale=1,maximum-scale=1,user-scalable=no">
		<title>案件登録</title>
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
		<header id="globalHeader">
			<p id="globalLogo"></p>
		</header>
		<noscript><div>JavaScriptが無効に設定されています。一部の機能が動作しない場合があります。</div></noscript>
		<div id="contentsHeader">
			<p class="headerBack"><a href="./index">戻る</a></p>
			<p class="headerHint">
				<span id="blogMenu" class="headerMenu"><a href="javascript:void(0)" id="blogMenuButton">メニュー</a></span>
			</p>
			<h1 class="headerTitle">案件登録</h1>
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
			<form name="form1" method="POST" action="/ment/project/upd" id="config">
				<input type="hidden" ${f:hidden("key")}/>
				<ul class="formBox">
					<li>
						<label class="labelTitle">案件No.</label>
						<div class="labelData"><input type="text" class="text" id="pjNo" maxlength="6" ${f:text("pjNo")}></div>
					</li>
					<li>
						<label class="labelTitle">案件名</label>
						<div class="labelData"><input type="text" class="text" id="pjName" maxlength="10" ${f:text("pjName")}></div>
					</li>
				</ul>
				<ul class="buttonBox">
					<li><input value="案件登録" class="button post" type="submit"></li>
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
