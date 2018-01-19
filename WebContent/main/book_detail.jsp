<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
	<head>
		<title>图书详情</title>
		<link rel="stylesheet" type="text/css" href="../css/book_detail.css"/>
		<link href="../css/public_footer.css" rel="stylesheet" type="text/css" />

	</head>
	<body>
		<br/>
		<div><h1></h1></div>
		丛书名：<s:property value="book.bookName"/>
		<hr/>
		<table width="80%" border="0" align="center" cellspacing="0" cellpadding="5">
			<tr>
				<td rowspan="9" width="20%" valign="top"><img src="/dangdang1.0_cjs/productImages/<s:property value='book.picture'/>" width="120px" height="170px" /></td>
				<td colspan="2">作者：<s:property value="book.author"/></td>
			</tr>
			<tr>
				<td colspan="2">出版社：<s:property value="book.press"/></td>
			</tr>
			<tr>
				<td>出版时间：<s:date name="book.printDate" format="yyyy-MM-dd"/> </td>
				<td>字数：<s:property value="book.wordNumber"/></td>
			</tr>
			<tr>
				<td>版次：<s:property value="book.edition"/></td>
				<td>页数：<s:property value="book.pageNumber"/></td>
			</tr>
			<tr>
				<td>印刷时间：<s:date name="book.printDate" format="yyyy-MM-dd"/></td>
				<td>开本：<s:property value="book.style"/></td>
			</tr>
			<tr>
				<td>印次：<s:property value="book.printNumber"/></td>
				<td>纸张：<s:property value="book.paper"/></td>
			</tr>
			<tr>
				<td>ISBN：<s:property value="book.isbn"/></td>
				<td>包装：<s:property value="book.packages"/></td>
			</tr>
			<tr>
				<td colspan="2">定价：￥<s:property value="book.price"/>&nbsp;&nbsp;&nbsp;&nbsp;
				<font color="red">当当价：￥<s:property value="book.price"/></font>&nbsp;&nbsp;&nbsp;&nbsp;
				节省：￥<s:property value="book.price-book.price"/></td>
			</tr>
			<tr>
				<td colspan="2"><a href="<s:url action='saveCartItem' namespace='/cart'/>?book.id=<s:property value='book.id'/>"><img src="../images/buttom_goumai.gif"/></a></td>
			</tr>
		</table>
		<hr style="border:1px dotted #666"/>
		<h2>编辑推荐</h2>
		<p>&nbsp;&nbsp;<s:property value="book.recommend"/></p>
		<hr style="border:1px dotted #666"/>
		<h2>内容简介</h2>
		<p>&nbsp;&nbsp;<s:property value="book.synopsis"/></p>
		<hr style="border:1px dotted #666"/>
		<h2>作者简介</h2>
		<p>&nbsp;&nbsp;<s:property value="book.auSynopsis"/></p>
		<hr style="border:1px dotted #666"/>
		<h2>目录</h2>
		<p>&nbsp;&nbsp;<s:property value="book.directory"/></p>
		<hr style="border:1px dotted #666"/>
		<h2>媒体评论</h2>
		<p>&nbsp;&nbsp;<s:property value="book.comments"/></p>
		<hr style="border:1px dotted #666"/>
		<h2>书摘插图</h2>
		<p>&nbsp;&nbsp;<s:property value="book.plate"/></p>
		<!--页尾开始 -->
		<div class="public_footer">
			<div class="public_footer_bottom">
				<div class="public_footer_icp" style="line-height: 48px;">
					Copyright (C) 当当网 2004-2008, All Rights Reserved
					<a href="#" target="_blank"><img src="../images/bottom/validate.gif" border="0" align="middle" /> </a>
					<a href="#" target="_blank" style="color: #666;">京ICP证041189号</a>
				</div>
			</div>
		</div>
		<!--页尾结束 -->
	</body>
</html>
