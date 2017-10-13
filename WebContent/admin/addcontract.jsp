<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/templates/admin/inc/header.jsp" %>
        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12 col-md-12">
                        <div class="card">
                            <div class="header col-md-10 col-md-offset-1">
                                <h4 class="title" align="center">HỢP ĐỒNG THỰC HIỆN ĐỀ TÀI KHOA HỌC VÀ CÔNG NGHỆ CẤP BỘ CỦA BỘ GIÁO DỤC VÀ ĐÀO TẠO</h4>
                            </div>
                            <div class="main-content">
                                <form action="" method="post">
                                    <div class="col-md-10 col-md-offset-1">
                                        <div class="row">
                                            <span><strong>BÊN A (Bộ Giáo dục và Đào tạo):</strong></span>
                                            <div class="form-group col-md-12">
                                                Đại diện:
                                                <input type="text" name="ten-A" class="form-control border-input" value="">
                                            </div>
                                            <div class="form-group col-md-12">
                                                Chức vụ:
                                                <input type="text" name="chucvu-A" class="form-control border-input" value="">
                                            </div>
                                            <div class="form-group col-md-12">
                                                Địa chỉ:
                                                <input type="text" name="diachi-A" value="" class="form-control border-input">
                                            </div>
                                            <div class="form-group col-md-5">
                                                Số điện thoại
                                                <input type="text" name="sodienthoai-A" value="" class="form-control border-input">
                                            </div>
                                             <div class="form-group col-md-5">
                                                Email:
                                                <input type="text" name="email-A" value="" class="form-control border-input">
                                            </div>
                                        </div>
                                        <div class="row">
                                            <span><strong>BÊN B:</strong></span>
                                            <div class="form-group col-md-12">
                                                a) Tổ chức chủ trì đề tài:
                                            </div>
                                            <div class="form-group col-md-12">
                                                Đại diện:
                                                <input type="text" name="ten-B" class="form-control border-input" value="">
                                            </div>
                                            <div class="form-group col-md-12">
                                                Chức vụ:
                                                <input type="text" name="chucvu-B" class="form-control border-input" value="">
                                            </div>
                                            <div class="form-group col-md-12">
                                                Địa chỉ:
                                                <input type="text" name="diachi-B" value="" class="form-control border-input">
                                            </div>
                                            <div class="form-group col-md-5">
                                                Số điện thoại
                                                <input type="text" name="sodienthoai-B" value="" class="form-control border-input">
                                            </div>
                                            <div class="form-group col-md-5">
                                                Email:
                                                <input type="text" name="email-B" value="" class="form-control border-input">
                                            </div>
                                            <div class="form-group col-md-12">
                                                Số tài khoản:
                                                <input type="text" name="sotaikhoan" value="" class="form-control border-input">
                                            </div>
                                            <div class="form-group col-md-12">
                                                Tại:
                                                <input type="text" name="diachisotaikhoan" value="" class="form-control border-input">
                                            </div>
                                            <div class="form-group col-md-12">
                                                b) Chủ nhiệm đề tài: 
                                            </div>
                                            <div class="form-group col-md-12">
                                                Ông/bà:
                                                <input type="text" name="ten-B" class="form-control border-input" value="">
                                            </div>
                                            <div class="form-group col-md-12">
                                                Địa chỉ:
                                                <input type="text" name="chucvu-B" class="form-control border-input" value="">
                                            </div>
                                            <div class="form-group col-md-5">
                                                Điện thoại:
                                                <input type="text" name="diachi-B" value="" class="form-control border-input">
                                            </div>
                                            <div class="form-group col-md-5">
                                                Email:
                                                <input type="text" name="email-B" value="" class="form-control border-input">
                                            </div>
                                        </div>
                                        <div class="row">
                                            <span><strong>Chi tiết hợp đồng:</strong></span>
                                            <div class="form-group col-md-12">
                                                Đề tài:
                                                <select name="friend_list" class="form-control border-input">
                                                    <option value="0" selected>--- Chọn đề tài ---</option>
                                                    <option value="0">Nghiên cứu đề xuất phương pháp tính xói trụ cầu</option>
                                                    <option value="0">Nghiên cứu đề xuất phương pháp tính xói trụ cầu</option>
                                                    <option value="0">Nghiên cứu đề xuất phương pháp tính xói trụ cầu</option>
                                                    <option value="0">Nghiên cứu đề xuất phương pháp tính xói trụ cầu</option>
                                                </select>
                                            </div>
                                            <div class="form-group col-md-12">
                                                Chi phí:
                                                <input type="text" name="chiphi" value="" class="form-control border-input">
                                            </div>
                                        </div>
                                        <div class="text-center">
                                            <input type="submit" class="btn btn-info btn-fill btn-wd" value="Lưu và in" />
                                        </div>
                                    </div>
                                    <div class="clearfix"></div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <%@include file="/templates/admin/inc/footer.jsp" %>
