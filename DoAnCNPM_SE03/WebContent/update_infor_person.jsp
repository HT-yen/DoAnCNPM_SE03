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
									
										 <li class="active breadcrumb-title">Cập nhật thông tin tài khoản</li>
									
				                </ol>
				            </div>
        				</div>
    				</div>
				</div>
			    <div class="container mb25">
			    	<div>
			    		<div class="col-xs-12">
			    			<h1 class="default_title">Cập nhật thông tin tài khoản</h1>
			    		</div>
			    	</div>
					
		            <div class="page_content">
						<form class="form">
							<div class="form-group row">
								<div class="col-xs-2">
									<label class="p-center">Họ Tên:</label>
								</div>
								<div class="col-xs-4">
									<input type="text" name="" class="form-control" placeholder="Vui lòng nhập họ tên ...">
								</div>
								
								<div class="col-xs-2">
									<label class="p-center">Tên đăng nhập  </label>
								</div>
								<div class="col-xs-4">
									<input disabled="disabled" type="text" name="" class="form-control">
								</div>
								
							</div>
							
						
							
							<div class="form-group row">
								<div class="col-xs-2">
									<label class="p-center">Mật khẩu </label>
								</div>
								<div class="col-xs-4">
									<input type="password" name="" class="form-control" placeholder="Vui lòng nhập mật khẩu ...">
								</div>
								
								<div class="col-xs-2">
									<label class="p-center">Email</label>
								</div>
								<div class="col-xs-4">
									<input type="text" name="" class="form-control" placeholder="Vui lòng nhập Email ...">
								</div>
								
								
							</div>
							
							
							
							<div class="form-group row">
								<div class="col-xs-2">
									<label class="p-center">Khoa</label>
								</div>
								<div class="col-xs-10">
									<input type="text" name="" class="form-control" placeholder="Vui lòng nhập khoa ...">
								</div>
								
							</div>
							
							
							 <div class="form-group row">
								 <div class="col-xs-2">
									  <label class="p-center">Học vị</label>
								 </div>
								 
								 <div class="col-xs-10">
									 <select name="friend_list" class="form-control border-input">
									     <option>Giáo sư</option>
										 <option>Phó giáo sư</option>
										 <option value="">Tiến sĩ</option>
										 <option>Thạc sĩ</option>
										 <option>Giáo viên</option>
									</select>
								</div>
                            </div>
							
							
							 <div class="form-group row">
								 <div class="col-xs-2">
									  <label class="p-center">Loại tài khoản</label>
								 </div>
								 
								 <div class="col-xs-10">
									 <select name="friend_list" class="form-control border-input">
										 <option value="">Admin</option>
										 <option>Giảng viên</option>
										 <option>Quản lý NCKH cấp khoa</option>
										  <option>Nhân viên quản lý NCKH cấp trường</option>
									</select>
								</div>
                            </div>
							
							<div class="form-group row">
								<div class="col-xs-2">
									<label class="p-center">Chức danh khoa học</label>
								</div>
								<div class="col-xs-10">
									<input type="text" name="" class="form-control" placeholder="Vui lòng nhập chức danh khoa học ...">
								</div>
								
							</div>
							
							<div class="form-group row">
								<div class="col-xs-2">
									<label class="p-center">Địa chỉ cơ quan</label>
								</div>
								<div class="col-xs-10">
									<input type="text" name="" class="form-control" placeholder="Vui lòng nhập địa chỉ cơ quan ...">
								</div>
								
							</div>
							
							<div class="form-group row">
								<div class="col-xs-2">
									<label class="p-center">Địa chỉ nhà riêng</label>
								</div>
								<div class="col-xs-5">
									<input type="text" name="" class="form-control" placeholder="Vui lòng nhập địa chỉ nhà riêng ...">
								</div>
								
								<div class="col-xs-1">
									<label class="p-center"></label>
								</div>
								<div class="col-xs-4">
									<input type="text" name="" class="form-control" placeholder="Vui lòng nhập Fax ...">
								</div>
								
							</div>
							
							<div class="form-group row">
								<div class="col-xs-2">
									<label class="p-center">Điện thoại cơ quan</label>
								</div>
								<div class="col-xs-5">
									<input type="text" name="" class="form-control" placeholder="Vui lòng nhập số điện thoại cơ quan ...">
								</div>
								
								<div class="col-xs-1" >
									<label class="p-center"></label>
								</div>
								<div class="col-xs-4">
									<input type="text" name="" class="form-control" placeholder="Vui lòng nhập số điện thoại di động ...">
								</div>
								
							</div>
							
							<div class="form-group row">
								
								<div class="col-xs-2">
									<label class="p-center">Ngày sinh:</label>
								</div>
								<div class="col-xs-10">
									<input type="Date" name="" class="form-control" placeholder="Vui lòng nhập ngày sinh ...">
								</div>
							</div>	
							<div class="form-group row">
								<div class="col-xs-2">
									
								</div>
								<div class="col-xs-10 ">
									
									<a href="javascript:void()" class="btn btn-lg btn-primary pull-right ml10" >Hủy</a>
									<a href="javascript:void()" class="btn btn-lg btn-primary pull-right" onclick="showMessage()">Cập nhật</a>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
			<!-- /SITE CONTENT -->
		</div>
	</div>

 
      <%@include file="/templates/public/inc/footer.jsp" %> 

