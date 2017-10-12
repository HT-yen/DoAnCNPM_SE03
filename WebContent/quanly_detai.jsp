<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="/templates/public/inc/header.jsp"%>




			<!-- SITE CONTENT
=========================================================================== -->
		<div id="site-content">
			<div id="main">
				<div class="header-breadcrumb">
    				<div class="container">
        				<div class="row ">
				            <div class="col-xs-12">
				                <ol class="breadcrumb">
									
				                    <li><a href="index.html">Trang chủ </a> </li>
									
										 <li class="active breadcrumb-title">Quản lý đề tài</li>
									
				                </ol>
				            </div>
        				</div>
    				</div>
				</div>
			    <div class="container">
			    	<div>
			    		<div class="col-xs-6">
			    			<h1 class="default_title"><a href="#">Thông tin đề tài</a></h1>
			    		</div>
			    		<div class="col-xs-6">
			    			
			    			<div class="col-xs-12 no-padding-lr">
								<div class="topbar">
									
									<div class="sub-menu-search hidden-xs hidden-sm pull-right col-xs-8">
											<form action="http://www.mamnonnumberone.edu.vn/search" method="get">

												<div class="input-group search_form_action">
													<input type="text" class="form-control" maxlength="70" name="query" id="search" placeholder="Tìm kiếm đề tài..." autocomplete="off">
													<span class="input-group-btn">
														<button class="btn btn-default" type="submit"><i class="fa fa-search"></i></button>
													</span>
												</div>
												<!-- /input-group -->
											</form>
									</div>									
									<div class="sub-menu-account hidden-xs hidden-sm">
										
									</div>
								</div>
							</div>
			    		</div>
			    	</div>
					
		            <div class="page_content">
						<table class="table">
							<thead>
							<th>
								<td>Tên đề tài</td>
								<td>Chủ nhiệm đề tài</td>
								<td>Thời gian</td>
								<td>Trạng thái</td>
								<td style="float:right;margin-right:14px;"><center>Cập nhật</center></td>
								
							</th>
							</thead>
							<tbody>
							<tr>
								<td>1</td>
								<td>
									<a href="<%=request.getContextPath()%>/detail-detai"> Nghiên cứu giải tích 1 </a>
								</td>
								<td>
									Bạch Linh
								</td>
								<td>12/9/2017</td>
								<td>Đang đề xuất</td>
								<td>
									<center>
										<div class="pull-right" >
											<a href="<%=request.getContextPath()%>/update-detai" class="btn btn-default" style=""> Cập nhật </a>
										</div>
									</center>
								</td>
								
							</tr>
							<tr>
								<td>2</td>
								<td>
									<a href="<%=request.getContextPath()%>/detail-detai"> Nghiên cứu xe tự động </a>
								</td>
								<td>
									Bạch Linh
								</td>
								<td>13/9/2017</td>
								<td>Khoa đã duyệt</td>
								<td>
									<center>
										<div class="pull-right" >
											<a href="<%=request.getContextPath()%>/update-detai" class="btn btn-default" style=""> Cập nhật </a>
										</div>
									</center>
								</td>
								
							</tr>
							</tbody>
						</table>
					</div>
			</div>
			<!-- /SITE CONTENT -->
		</div>
	</div>


			<%@include file="/templates/public/inc/footer.jsp" %> 
			
			