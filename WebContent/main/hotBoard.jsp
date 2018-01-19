<%@page contentType="text/html;charset=utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
		<h2 class="t_xsrm">
			新书热卖榜
		</h2>
		<div id="NewProduct_1_o_t" onmouseover="">
<ul>
	<s:url action="findBookById" namespace="/book" var="bookId"/>
	<s:iterator value="newFire" begin="0" end="7">
		<li><a  target='_blank' href="<s:property value='#bookId'/>?book.id=<s:property value='id'/>"><s:property value="bookName"/></a></li>
	</s:iterator>
</ul>
	<h3 class="second">
		<span class="dot_r"> </span><a href="#" target="_blank">更多&gt;&gt;</a>
	</h3>
</div>