<%@page contentType="text/html;charset=utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<h2>
	<span class="more"><a href="#" target="_blank">更多&gt;&gt;</a> </span>最新上架图书
</h2>
<div class="book_c_04">

	<!--热销图书A开始-->
	<s:url action="findBookById" namespace="/book" var="bookId"/>
	<s:iterator value="newBook" begin="0" end="7">
	<div class="second_d_wai">
		<div class="img">
			<a href="<s:property value='#bookId'/>?book.id=<s:property value='id'/>" target='_blank'><img
					src="/dangdang1.0_cjs/productImages/<s:property value='picture'/>" border=0 /> </a>
		</div>
		<div class="shuming">
			<a href="<s:property value='#bookId'/>?book.id=<s:property value='id'/>" target="_blank"><s:property value="bookName"/></a><a href="#" target="_blank"></a>
		</div>
		<div class="price">
			定价：￥<s:property value="price"/>
		</div>
		<div class="price">
			当当价：￥<s:property value="price"/>
		</div>
	</div>
	<div class="book_c_xy_long"></div>
	</s:iterator>
	<!--热销图书A结束-->

</div>
<div class="clear"></div>