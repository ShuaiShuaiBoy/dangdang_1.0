<%@page contentType="text/html;charset=utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<h2>
	编辑推荐
</h2>
<div id=__bianjituijian/danpin>
	<div class=second_c_02>
		<s:url action="findBookById" namespace="/book" var="bookId"/>
		<s:iterator value="grooms" begin="0" end="1">
			<div class=second_c_02_b1>
			<div class=second_c_02_b1_1>
				<a href="/dangdang1.0_cjs/productImages/<s:property value="picture"/>" onmouseover=" $(this).jqzoom({zoomWidth:120,zoomHeight:150});" onclick="location.href='<s:property value='#bookId'/>?book.id=<s:property value='id'/>'" target='_blank'><img src="/dangdang1.0_cjs/productImages/<s:property value="picture"/>" width=70 border=0 /> </a>
			</div>
			<div class=second_c_02_b1_2>
				<h3>
					<a href="<s:property value='#bookId'/>?book.id=<s:property value='id'/>" target='_blank' title='输赢'><s:property value="bookName"/></a>
				</h3>
				<h4>
					作者：<s:property value="author"/> 著
					<br />
					出版社：<s:property value="press"/>&nbsp;&nbsp;&nbsp;&nbsp;出版时间：
				</h4>
				<h5>
					<s:property value="auSynopsis"/>
				</h5>
				<h6>
					定价：￥<s:property value="price"/>&nbsp;&nbsp;当当价：￥<s:property value="price"/>
				</h6>
				<div class=line_xx></div>
			</div>
		</div>
		</s:iterator>
		
	</div>
</div>
