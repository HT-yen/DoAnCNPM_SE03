<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/templates/admin/inc/header.jsp" %>

        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="header">
                                <h4 class="title">Danh sách hợp đồng</h4>
                                <!-- <p class="category success">Thêm thành công</p> -->
                                <form action="" method="post">
                                	<div class="row">
                                        <div class="col-md-1">
                                            <div class="form-group">
                                                <input type="text" name="id" class="form-control border-input" value=""  placeholder="ID">
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <input type="text" name="fullname" class="form-control border-input" placeholder="Đề tài" value="">
                                            </div>
                                        </div>
                                        <div class="col-md-3">
                                            <div class="form-group">
                                                <select name="friend_list" class="form-control border-input">
                                                	<option value="0">-- Chọn cấp đề tài --</option>
                                                	<option value="1">Cấp khoa</option>
                                                	<option>Cấp cơ sở</option>
                                                	<option>Cấp đại học Đà Nẵng</option>
                                                    <option>Cấp bộ giáo dục</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                        	<div class="form-group">
		                                        <input type="submit" name="search" value="Tìm kiếm" class="is" />
		                                        <input type="submit" name="reset" value="Hủy tìm kiếm" class="is" />
	                                        </div>
                                        </div>
                                    </div>
                                    
                                </form>                       
                                <a href="edit.html" class="addtop"><img src="<%=request.getContextPath() %>/templates/admin/img/add.png" alt="" /> Thêm hợp đồng</a>
                            </div>
                            <div class="content table-responsive table-full-width">
                                <table class="table table-striped">
                                    <thead>
                                        <th>ID</th>
                                    	<th>Tên đề tài</th>
                                    	<th>Chủ nhiệm</th>
                                    	<th>Chi phí</th>
                                    	<th>Thời gian thực hiện</th>
                                    	<th>Chức năng</th>
                                    </thead>
                                    <tbody>
                                        <tr>
                                        	<td>1</td>
                                            <td><a href="#">Nghiên cứu đề xuất phương pháp tính xói trụ cầu</a></td>
                                            <td>Nguyễn Thế Hùng</td>
                                        	<td>20.000.000</td>
                                        	<td>1 năm</td>
                                        	<td>
                                        		<a href="edit.html"><img src="<%=request.getContextPath() %>/templates/admin/img/edit.gif" alt="" /> Sửa</a> &nbsp;||&nbsp;
                                        		<a href=""><img src="<%=request.getContextPath() %>/templates/admin/img/del.gif" alt="" /> Xóa</a>
                                        	</td>
                                        </tr>
                                        <tr>
                                            <td>2</td>
                                            <td><a href="#">Nghiên cứu đề xuất phương pháp tính xói trụ cầu</a></td>
                                            <td>Nguyễn Thế Hùng</td>
                                            <td>20.000.000</td>
                                            <td>1 năm</td>
                                            <td>
                                                <a href="edit.html"><img src="<%=request.getContextPath() %>/templates/admin/img/edit.gif" alt="" /> Sửa</a> &nbsp;||&nbsp;
                                                <a href=""><img src="assets/img/del.gif" alt="" /> Xóa</a>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>3</td>
                                            <td><a href="#">Nghiên cứu đề xuất phương pháp tính xói trụ cầu</a></td>
                                            <td>Nguyễn Thế Hùng</td>
                                            <td>20.000.000</td>
                                            <td>1 năm</td>
                                            <td>
                                                <a href="edit.html"><img src="assets/img/edit.gif" alt="" /> Sửa</a> &nbsp;||&nbsp;
                                                <a href=""><img src="assets/img/del.gif" alt="" /> Xóa</a>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>4</td>
                                            <td><a href="#">Nghiên cứu đề xuất phương pháp tính xói trụ cầu</a></td>
                                            <td>Nguyễn Thế Hùng</td>
                                            <td>20.000.000</td>
                                            <td>1 năm</td>
                                            <td>
                                                <a href="edit.html"><img src="assets/img/edit.gif" alt="" /> Sửa</a> &nbsp;||&nbsp;
                                                <a href=""><img src="assets/img/del.gif" alt="" /> Xóa</a>
                                            </td>
                                        </tr>                                   
                                    </tbody>
                                </table>

								<div class="text-right pagination-div">
								    <ul class="pagination">
								        <li><a href="?p=0" title="">1</a></li> 
								        <li><a href="?p=1" title="">2</a></li> 
								        <li><a href="?p=1" title="">3</a></li> 
								        <li><a href="?p=1" title="">4</a></li> 
								    </ul>
								</div>
                            </div>
                        </div>
                    </div>


                </div>
            </div>
        </div>
<%@include file="/templates/admin/inc/footer.jsp" %>
