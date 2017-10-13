<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/templates/admin/inc/header.jsp" %>
        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-12">
                        <div class="card">
                            <div class="header">
                               <!--  <h4 class="title">Danh sách bạn bè</h4>
                                <p class="category success">Thêm thành công</p> -->
                                <form action="" method="post">
                                	<div class="row">
                                        <div class="col-md-2">
                                            <div class="form-group">
                                                <select name="friend_list" class="form-control border-input">
                                                    <option value="0">Năm 2001</option>
                                                    <option value="0">Năm 2002</option>
                                                    <option value="0">Năm 2003</option>
                                                    <option value="0">Năm 2004</option>
                                                    <option value="0">Năm 2005</option>
                                                    <option value="0">Năm 2006</option>
                                                    <option value="0">Năm 2007</option>
                                                    <option value="0">Năm 2008</option>
                                                    <option value="0">Năm 2009</option>
                                                    <option value="0">Năm 2010</option>
                                                    <option value="0">Năm 2011</option>
                                                    <option value="0">Năm 2012</option>
                                                    <option value="0">Năm 2013</option>
                                                    <option value="0">Năm 2014</option>
                                                    <option value="0">Năm 2015</option>
                                                    <option value="0">Năm 2016</option>
                                                    <option value="0" selected>Năm 2017</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <select name="friend_list" class="form-control border-input">
                                                	<option value="0">-- Chọn kiểu thống kê --</option>
                                                	<option value="1">Thống kê đề tài theo cấp đề tài</option>
                                                	<option>Thông kê đề tài hoàn thành</option>
                                                	<option>Thống kê đề tài chưa hoàn thành</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <div class="form-group">
                                                <select name="friend_list" class="form-control border-input" disabled>
                                                    <option value="0">-- Chọn cấp đề tài --</option>
                                                    <option value="1">Khoa</option>
                                                    <option>Cơ sở</option>
                                                    <option>Đại học Đà Nẵng</option>
                                                    <option>Bộ giáo dục</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="col-md-2">
                                        	<div class="form-group">
		                                        <input type="submit" name="search" value="Thống kê" class="btn btn-default" />
	                                        </div>
                                        </div>
                                    </div>
                                    
                                </form>
                                
                                <!-- <a href="edit.html" class="addtop"><img src="assets/img/add.png" alt="" /> Thêm</a> -->
                            </div>
                            <div class="content table-responsive table-full-width">
                                <table class="table table-striped">
                                    <thead>
                                        <th>ID</th>
                                    	<th>Tên đề tài</th>
                                    	<th>Chủ nhiệm đề tài</th>
                                    	<th>Trạng thái</th>
                                    	<th>Cấp đề tài</th>
                                    	<th>Ghi chú</th>
                                    </thead>
                                    <tbody>
                                        <tr>
                                        	<td>1</td>
                                        	<td><a href="#">Nghiên cứu đề xuất phương pháp tính xói trụ cầu</a></td>
                                        	<td>Nguyễn Thế Hùng</td>
                                        	<td>Đã hoàn thành</td>
                                        	<td>Đại học Đà Nẵng</td>
                                        	<td></td>
                                        </tr>
                                         <tr>
                                            <td>2</td>
                                            <td><a href="#">Nghiên cứu đề xuất phương pháp tính xói trụ cầu</a></td>
                                            <td>Nguyễn Thế Hùng</td>
                                            <td>Đã hoàn thành</td>
                                            <td>Đại học Đà Nẵng</td>
                                            <td></td>
                                        </tr>
                                         <tr>
                                            <td>3</td>
                                            <td><a href="#">Nghiên cứu đề xuất phương pháp tính xói trụ cầu</a></td>
                                            <td>Nguyễn Thế Hùng</td>
                                            <td>Đã hoàn thành</td>
                                            <td>Đại học Đà Nẵng</td>
                                            <td></td>
                                        </tr>
                                         <tr>
                                            <td>4</td>
                                            <td><a href="#">Nghiên cứu đề xuất phương pháp tính xói trụ cầu</a></td>
                                            <td>Nguyễn Thế Hùng</td>
                                            <td>Đã hoàn thành</td>
                                            <td>Đại học Đà Nẵng</td>
                                            <td></td>
                                        </tr>
                                        
                                    </tbody>
 
                                </table>

								<div class="text-right pagination-div">
								    <ul class="pagination">
								        <li><a href="#" title="">1</a></li> 
								    </ul>
								</div>
                            </div>
                            <div class="text-center">
                                <button class="btn btn-default" type="button" style="margin-bottom: 20px;">In</button>
                            </div>
                        </div>
                    </div>


                </div>
            </div>
        </div>
 <%@include file="/templates/admin/inc/footer.jsp" %>