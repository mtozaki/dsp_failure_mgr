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
		<title>障害登録</title>
		<link rel="stylesheet" href="/css/common.0.3.css" type="text/css">
		<link rel="stylesheet" href="/css/common.css" type="text/css">
		<link rel="stylesheet" href="/css/config.css" type="text/css">
		<script type='text/javascript' src='/js/jquery-1.6.2.min.js'></script>
		<script type='text/javascript' src='/js/jquery.micro_template.js'></script>
		<script type='text/javascript' src='/js/util.js'></script>
		<script type='text/javascript' src='/js/blog_menu.js'></script>
		<script type="text/javascript" src="/js/form_control.js"></script>
		<script type='text/javascript'>
			<!--
				function onload() {
<%	if ( err!=null && !err.equals("") ) {	%>
					alert('<%= err %>');<%	}	%>
				}
			-->
		</script>
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
			<h1 class="headerTitle">障害登録</h1>
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
		<form name="form1" method="POST" action="/failure/add" id="config">
			<div id="container">
				<ul class="formBox">
					<li>
						<label for="title" class="labelTitle">案件</label>
						<div class="labelData">
							<select name="pjNo" class="text" id="pjNo">
<c:forEach var="head" items="${projectList}" varStatus="hs" >
								<option value="${f:h(head.key)}">[${f:h(head.pjNo)}]&nbsp;${f:h(head.pjName)}</option>
</c:forEach>
							</select>
						</div>
					</li>
					<li>
						<label for="title" class="labelTitle">No.</label>
						<div class="labelData"><input type="text" name="no" class="text" id="no" maxlength="6"></div>
					</li>
					<li>
						<label for="title" class="labelTitle">発生日</label>
						<div class="labelData"><input type="text" name="postDate" class="text" id="postDate" maxlength="10"></div>
					</li>
				</ul>
				<ul class="formBox2">
					<li>
						<label for="title" class="labelTitle">概要</label>
						<div class="labelData"><input type="text" name="title" class="text" id="title"></div>
					</li>
				</ul>
				<ul class="formBox">
					<li>
						<label for="title" class="labelTitle">対応可否</label>
						<div class="labelData">
							<select name="supportKbn" class="text" id="supportKbn">
<c:forEach var="head" items="${SupportKbnList}" varStatus="hs" >
								<option value="${f:h(head[0])}">${f:h(head[1])}</option>
</c:forEach>
							</select>
						</div>
					</li>
					<li>
						<label for="title" class="labelTitle">優先度</label>
						<div class="labelData">
							<select name="priorityLv" class="text" id="priorityLv">
<c:forEach var="head" items="${PriorityLvList}" varStatus="hs" >
								<option value="${f:h(head[0])}">${f:h(head[1])}</option>
</c:forEach>
							</select>
						</div>
					</li>
					<li>
						<label for="title" class="labelTitle">重要度</label>
						<div class="labelData">
							<select name="importantLv" class="text" id="importantLv">
<c:forEach var="head" items="${ImportantLvList}" varStatus="hs" >
								<option value="${f:h(head[0])}">${f:h(head[1])}</option>
</c:forEach>
							</select>
						</div>
					</li>
					<li>
						<label for="title" class="labelTitle">リリース日</label>
						<div class="labelData"><input type="text" name="releaseDate" class="text" id="releaseDate"></div>
					</li>
					<li>
						<label for="title" class="labelTitle">指摘担当</label>
						<div class="labelData">
							<select name="discoveryEmp" class="text" id="discoveryEmp">
								<option value="">&nbsp;</option>
<c:forEach var="head" items="${empList}" varStatus="hs" >
								<option value="${f:h(head.key)}">[${f:h(head.empNo)}]&nbsp;${f:h(head.empName)}</option>
</c:forEach>
							</select>
						</div>
					</li>
					<li>
						<label for="title" class="labelTitle">対応担当</label>
						<div class="labelData">
							<select name="supportEmp" class="text" id="supportEmp">
								<option value="">&nbsp;</option>
<c:forEach var="head" items="${empList}" varStatus="hs" >
								<option value="${f:h(head.key)}">[${f:h(head.empNo)}]&nbsp;${f:h(head.empName)}</option>
</c:forEach>
							</select>
						</div>
					</li>
				</ul>
				<ul class="formBox2">
					<li>
						<label for="title" class="labelTitle">備考</label>
						<div class="labelData"><input type="text" name="remarks" class="text" id="remarks"></div>
					</li>
				</ul>
			</div>
			<div id="container2">
				<ul class="formBox">
					<li>
						<label for="title" class="labelTitle">対応開始日</label>
						<div class="labelData"><input type="text" name="startDate" class="text" id="startDate" maxlength="10"></div>
					</li>
					<li>
						<label for="title" class="labelTitle">対応終了日</label>
						<div class="labelData"><input type="text" name="endDate" class="text" id="endDate" maxlength="10"></div>
					</li>
				</ul>
				<ul class="formBox2">
					<li>
						<label for="title" class="labelTitle">障害発生箇所</label>
						<div class="labelData"><input type="text" name="troubleSpots" class="text" id="troubleSpots"></div>
					</li>
					<li>
						<label for="title" class="labelTitle">内容</label>
						<div class="labelData"><input type="text" name="failureBody" class="text" id="failureBody"></div>
					</li>
					<li>
						<label for="title" class="labelTitle">障害原因</label>
						<div class="labelData"><input type="text" name="troubleCause" class="text" id="troubleCause"></div>
					</li>
					<li>
						<label for="title" class="labelTitle">修正内容</label>
						<div class="labelData"><input type="text" name="repairBody" class="text" id="repairBody"></div>
					</li>
					<li>
						<label for="title" class="labelTitle">対応結果</label>
						<div class="labelData"><input type="text" name="results" class="text" id="results"></div>
					</li>
					<li>
						<label for="title" class="labelTitle">修正資産</label>
						<div class="labelData"><input type="text" name="repairSrc" class="text" id="repairSrc"></div>
					</li>
				</ul>
			</div>
			<div id="container3">
				<ul class="buttonBox">
					<li><input value="詳細" class="button post" type="button" id="detailFailure"></li>
				</ul>
				<ul class="buttonBox">
					<li><input value="登録する" class="button post" type="submit"></li>
				</ul>
			</div>
		</form>
		<footer id="globalFooter">
			<ul class="footerLink">
				<li>sys_dolphinさん</li>
<!--				<li><a href="/logout">ログアウト</a></li> -->
			</ul>
			<p class="poweredBy">powered by <a href="http://www.dolphin-system.co.jp/">dolphin-system</a></p>
		</footer>
	</body>
</html>
