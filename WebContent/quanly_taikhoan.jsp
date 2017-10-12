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
					
						 <li class="active breadcrumb-title">Quản lý tài khoản</li>
					
                </ol>
            </div>
        </div>
    </div>
</div>

					



					<section class="mb25 section-page">
    <div class="container">
			
			
				 <div>
					<div class="col-xs-6">
						<h1 class="default_title"><a href="#">Thông tin tài khoản</a></h1>
					</div>
					<div class="col-xs-6">
						
						<div class="col-xs-12 no-padding-lr">
							<div class="topbar">
								
								<div class="sub-menu-search hidden-xs hidden-sm pull-right col-xs-8">
										<form action="http://www.mamnonnumberone.edu.vn/search" method="get">

											<div class="input-group search_form_action">
												<input type="text" class="form-control" maxlength="70" name="query" id="search" placeholder="Tìm kiếm tài khoản..." autocomplete="off">
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
				
			<table align="center" border="1" cellpadding="1" cellspacing="1" style="width: 800px; height:20px;">
				<tbody>
					<tr>
						<td width="4%;" colspan="3">Lý lịch khoa học</td>
					</tr>
					
					<tr>
						<td width="4%;">1</td> <td width="25%;" style="font-weight:bold;">Họ tên</td>  <td> Trương Bảo</td>
					</tr>
					<tr>
						<td width="4%;">2</td> <td width="25%;" style="font-weight:bold;">Chức danh khoa học</td>  <td> Phó Giáo sư; công nhận năm: 2010 </td>
					</tr>
					<tr>
						<td width="4%;">3</td> <td width="25%;" style="font-weight:bold;">Địa chỉ cơ quan</td>  <td> Trường Đại học Bách Khoa Đà nẵng </td>
					</tr>
					<tr>
						<td width="4%;">4</td> <td width="25%;" style="font-weight:bold;">Điện thoại cơ quan</td>  <td> 051138273633 </td>
					</tr>
					<tr>
						<td width="4%;">5</td> <td width="25%;" style="font-weight:bold;">Học vị</td>  <td> Tiến sĩ; năm: 2003; Chuyên ngành: Công nghệ thực phẩm; Tại: Đại học Đà Nẵng. </td>
					</tr>
					<tr>
						<td width="4%;">6</td> <td width="25%;" style="font-weight:bold;">Năm sinh</td>  <td> 03/08/1960 </td>
					</tr>
					<tr>
						<td width="4%;">7</td> <td width="25%;" style="font-weight:bold;">Địa chỉ nhà riêng</td>  <td> 634/2 Trưng Nữ Vương- Đà Nẵng </td>
					</tr>
					<tr>
						<td width="4%;">8</td> <td width="25%;" style="font-weight:bold;">Số điện thoại di động</td>  <td> 016538829292 </td>
					</tr>
					<tr>
						<td width="4%;">9</td> <td width="25%;" style="font-weight:bold;">Email</td>  <td> baot3bk@gmail.com </td>
					</tr>
					<tr>
						<td width="4%;">10</td> <td width="25%;" style="font-weight:bold;">Tên tài khoản</td>  <td> nguyenvanbinh1312 </td>
					</tr>
					<tr>
						<td width="4%;">11</td> <td width="25%;" style="font-weight:bold;">Loại tài khoản</td>  <td> Quản lý NCKH cấp khoa </td>
					</tr>
					<tr>
						<td width="4%;">12</td> <td width="25%;" style="font-weight:bold;">Đơn vị công tác</td>  <td> Khoa hóa , Trường đại học bách khoa </td>
					</tr>
					<tr>
						<td width="4%;">13</td> <td width="25%;" style="font-weight:bold;">Fax</td>  <td> 001-1927993 </td>
					</tr>
					
				</tbody>
			</table>

			<p>&nbsp;</p>
			
			<div class="form-group row">
				<div class="col-xs-2">
					
				</div>
				<div class="col-xs-10 ">
					<a href="<%=request.getContextPath()%>/update-infor-person" class="btn btn-lg btn-primary pull-right">Cập nhật thông tin</a>
				</div>
			</div>



<p>&nbsp;</p>
			</div>
    </div>

	
</section>


				</div>
			</div>
			<!-- /SITE CONTENT -->


          <%@include file="/templates/public/inc/footer.jsp" %> 



