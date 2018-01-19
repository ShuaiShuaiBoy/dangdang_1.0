<%@page contentType="text/html;charset=utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<div class="book_l_border1" id="__FenLeiLiuLan">
	<div class="book_sort_tushu">
		<h2>
			分类浏览
		</h2> 
		<s:url action="categoryBook" namespace="/category" var="c1"/>
		<s:iterator value="categoryList" var="i">
			<div class="bg_old" onmouseover="this.className = 'bg_white';"
				onmouseout="this.className = 'bg_old';">
				
				<h3>
					[<a href="<s:property value='#c1'/>?categoryId=<s:property value='id'/>"><s:property value="name"/></a>]
				</h3>
				<ul class="ul_left_list">

						<!--2级分类开始-->
						<s:iterator value="categorys">
							<li>
								<a href="<s:property value='#c1'/>?categoryId=<s:property value='#i.id'/>&categoryCid=<s:property value='id'/>"><s:property value="name"/></a>
							</li>
						</s:iterator>
						<!--2级分类结束-->
				</ul>
				<div class="empty_left">
				</div>
			</div>
			<div class="more2">
			</div>
		</s:iterator>
		
		<div class="bg_old">
			<h3>
				&nbsp;
			</h3>
		</div>
	</div>
</div>
