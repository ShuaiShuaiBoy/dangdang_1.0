<%@page contentType="text/html;charset=utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>当当图书 – 全球最大的中文网上书店</title>
		<script type="text/javascript" src="../js/prototype-1.6.0.3.js">
		</script>
		<link href="../css/book.css" rel="stylesheet" type="text/css" />
		<link href="../css/second.css" rel="stylesheet" type="text/css" />
		<link href="../css/secBook_Show.css" rel="stylesheet" type="text/css" />
		<link href="../css/list.css" rel="stylesheet" type="text/css" />
	</head>
	<body>
		&nbsp;

		<!-- 头部开始 -->
		<%@include file="../common/head.jsp"%>
		<!-- 头部结束 -->

		<div style="width: 962px; margin: auto;">
			<a href="#"><img src="../images/default/book_banner_081203.jpg" border="0" /> </a>
		</div>
		<div class='your_position'>
			您现在的位置:&nbsp;
			<a href="<s:url value='/main/main.jsp'/>">当当图书</a> &gt;&gt;
			<s:if test="category3==null">
			<font style='color: #cc3300'><strong><s:property value="category.name"/></strong> </font>
			</s:if>
			<s:if test="category3!=null">
			<a href="<s:url action='categoryBook' namespace='/category'/>?categoryId=<s:property value='category.id'/>"><s:property value="category.name"/></a>
			&gt;&gt;
			<font style='color: #cc3300'><strong><s:property value="category3.name"/></strong> </font>
			</s:if>
		</div>

		<div class="book">

			<!--左栏开始-->
			<div id="left" class="book_left">
				<div id="__fenleiliulan">
					<div class=second_l_border2>
						<h2>
							分类浏览
						</h2>
						<ul>
							<li>
								<div>
									<div class=second_fenlei>
										&middot;<span style="<s:if test='category3==null'>color:red</s:if>" ><a href="<s:url action='categoryBook' namespace='/category'/>?categoryId=<s:property value='category.id'/>"><span style="<s:if test='category3==null'>color:red</s:if>">全部&nbsp;(<s:property value="category.bookNumber"/>)</span></a></span>
									</div>
								</div>
							</li>
							<div class="clear"></div>
							<s:url action="categoryBook" namespace="/category" var="c1"/>
							<!--2级分类开始-->
							<s:iterator value="category2.categorys">
								<li>
								<div>
									<div class=second_fenlei>
										&middot;
									</div>
									<div class=second_fenlei>
										<a href="<s:property value='#c1'/>?categoryId=<s:property value='category.id'/>&categoryCid=<s:property value='id'/>"><span style="<s:if test='category3.id==id'>color:red</s:if>"><s:property value="name"/>&nbsp;(<s:property value="bookNumber"/>)</span></a>
									</div>
								</div>
							</li>
						    <div class="clear"></div>
							</s:iterator>
							<!--2级分类结束-->
							
							<li>
								<div></div>
							</li>
						</ul>
					</div>
				</div>
			</div>

			<!--左栏结束-->

			<!--中栏开始-->
			<div class="book_center">

				<!--图书列表开始-->
				<div id="divRight" class="list_right">

					<div id="book_list" class="list_r_title">
						<div class="list_r_title_text">
							排序方式
						</div>
						<select onchange='' name='select_order' size='1'
							class='list_r_title_ml'>
							<option value="">
								按上架时间 降序
							</option>
						</select>
						<div id="divTopPageNavi" class="list_r_title_text3">

							<!--分页导航开始-->
							<s:if test="page.pageNo>1">
								<div class='list_r_title_text3a'>
								<a name=link_page_next
									href="<s:url action='categoryBook' namespace='/category'/>?categoryId=<s:property value='category.id'/>&categoryCid=<s:property value='category3.id'/>&page.pageNo=<s:property value='page.pageNo-1'/>">
								<img src='../images/page_up.gif' /> </a>
							</div>
							</s:if>
							<s:else>
								<div class='list_r_title_text3a'>
								<img src='../images/page_up_gray.gif' />
							</div>
							</s:else>
							<div class='list_r_title_text3b'>
								第<s:property value="page.pageNo"/>页/共<s:if test="page.num==0">1</s:if><s:else><s:property value="page.num"/></s:else>页
							</div>
							<s:if test="page.pageNo>=page.num">
								<div class='list_r_title_text3a'>
								<img src='../images/page_down_gray.gif' />
							</div>
							</s:if>
							<s:else>
								<div class='list_r_title_text3a'>
								<a name=link_page_next
									href="<s:url action='categoryBook' namespace='/category'/>?categoryId=<s:property value='category.id'/>&categoryCid=<s:property value='category3.id'/>&page.pageNo=<s:property value='page.pageNo+1'/>">
									<img src='../images/page_down.gif' /> </a>
							</div>
							</s:else>

							<!--分页导航结束-->
						</div>
					</div>
					
					<!--商品条目开始-->
						
						<div class="list_r_line"></div>
						<s:if test="category.books!=null&&category.books.size>0">
						<s:iterator value="category.books">
						<div class="clear"></div>
						<div class="list_r_list">
							<span class="list_r_list_book"><a name="link_prd_img" href="<s:url action='findBookById' namespace='/book'/>?book.id=<s:property value='id'/>">
								<img src="/dangdang1.0_cjs/productImages/<s:property value='picture'/>" /> </a> </span>
							<h2>
								<a name="link_prd_name" href="<s:url action='findBookById' namespace='/book'/>?book.id=<s:property value='id'/>"><s:property value="bookName"/></a>
							</h2>
							<h3>
								顾客评分：100
							</h3>
							<h4 class="list_r_list_h4">
								作 者:
								<a href='#' name='作者'><s:property value="author"/></a>
							</h4>
							<h4>
								出版社：
								<a href='#' name='出版社'><s:property value="press"/></a>
							</h4>
							<h4>
								出版时间：<s:date name="printDate" format="yyyy-MM-dd"/>
							</h4>
							<h5>
								<s:property value="comments"/>
							</h5>
							<div class="clear"></div>
							<h6>
								<span class="del">￥<s:property value="price"/></span>
								<span class="red">￥<s:property value="dPrice"/></span>
								节省：￥<s:property value="price-price"/>
							</h6>
							<span class="list_r_list_button">
							<a href="<s:url action='findBookById' namespace='/book'/>?book.id=<s:property value='id'/>"> 
							<img src='../images/buttom_goumai.gif' /> </a>
							<span id="cartinfo"></span>
						</div>
						<div class="clear"></div>
						</s:iterator>
						</s:if>
						<!--商品条目结束-->
					<div class="clear"></div>
					<div id="divBottomPageNavi" class="fanye_bottom">
					</div>

				</div>
				<!--图书列表结束-->

			</div>
			<!--中栏结束-->
			<div class="clear"></div>
		</div>

		<!--页尾开始 -->
		<%@include file="../common/foot.jsp"%>
		<!--页尾结束 -->
	</body>
</html>
