package model.bean;

public class User {
	
	private int idUser;
	private String tenUser;
	private String chucDanhKhoaHoc;
	private String diaChiCoQuan;
	private String dienThoaiCoQuan;
	private String hocVi;
	private String namSinh;
	private String diaChiNhaRieng;
	private String dienThoaiNhaRieng;
	private String email;
	private String fax;
	private String taiKhoan;
	private String matKhau;
	private int idLoaiTaiKhoan;
	private int idKhoa;
	
	public User() {
		super();
	}

	public User(int idUser, String tenUser, String chucDanhKhoaHoc,
			String diaChiCoQuan, String dienThoaiCoQuan, String hocVi,
			String namSinh, String diaChiNhaRieng, String dienThoaiNhaRieng,
			String email, String fax, String taiKhoan, String matKhau,
			int idLoaiTaiKhoan, int idKhoa) {
		super();
		this.idUser = idUser;
		this.tenUser = tenUser;
		this.chucDanhKhoaHoc = chucDanhKhoaHoc;
		this.diaChiCoQuan = diaChiCoQuan;
		this.dienThoaiCoQuan = dienThoaiCoQuan;
		this.hocVi = hocVi;
		this.namSinh = namSinh;
		this.diaChiNhaRieng = diaChiNhaRieng;
		this.dienThoaiNhaRieng = dienThoaiNhaRieng;
		this.email = email;
		this.fax = fax;
		this.taiKhoan = taiKhoan;
		this.matKhau = matKhau;
		this.idLoaiTaiKhoan = idLoaiTaiKhoan;
		this.idKhoa = idKhoa;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getTenUser() {
		return tenUser;
	}

	public void setTenUser(String tenUser) {
		this.tenUser = tenUser;
	}

	public String getChucDanhKhoaHoc() {
		return chucDanhKhoaHoc;
	}

	public void setChucDanhKhoaHoc(String chucDanhKhoaHoc) {
		this.chucDanhKhoaHoc = chucDanhKhoaHoc;
	}

	public String getDiaChiCoQuan() {
		return diaChiCoQuan;
	}

	public void setDiaChiCoQuan(String diaChiCoQuan) {
		this.diaChiCoQuan = diaChiCoQuan;
	}

	public String getDienThoaiCoQuan() {
		return dienThoaiCoQuan;
	}

	public void setDienThoaiCoQuan(String dienThoaiCoQuan) {
		this.dienThoaiCoQuan = dienThoaiCoQuan;
	}

	public String getHocVi() {
		return hocVi;
	}

	public void setHocVi(String hocVi) {
		this.hocVi = hocVi;
	}

	public String getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}

	public String getDiaChiNhaRieng() {
		return diaChiNhaRieng;
	}

	public void setDiaChiNhaRieng(String diaChiNhaRieng) {
		this.diaChiNhaRieng = diaChiNhaRieng;
	}

	public String getDienThoaiNhaRieng() {
		return dienThoaiNhaRieng;
	}

	public void setDienThoaiNhaRieng(String dienThoaiNhaRieng) {
		this.dienThoaiNhaRieng = dienThoaiNhaRieng;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public int getIdLoaiTaiKhoan() {
		return idLoaiTaiKhoan;
	}

	public void setIdLoaiTaiKhoan(int idLoaiTaiKhoan) {
		this.idLoaiTaiKhoan = idLoaiTaiKhoan;
	}

	public int getIdKhoa() {
		return idKhoa;
	}

	public void setIdKhoa(int idKhoa) {
		this.idKhoa = idKhoa;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", tenUser=" + tenUser
				+ ", chucDanhKhoaHoc=" + chucDanhKhoaHoc + ", diaChiCoQuan="
				+ diaChiCoQuan + ", dienThoaiCoQuan=" + dienThoaiCoQuan
				+ ", hocVi=" + hocVi + ", namSinh=" + namSinh
				+ ", diaChiNhaRieng=" + diaChiNhaRieng + ", dienThoaiNhaRieng="
				+ ", email=" + email + ", fax=" + fax
				+ ", taiKhoan=" + taiKhoan + ", matKhau=" + matKhau
				+ ", idLoaiTaiKhoan=" + idLoaiTaiKhoan + ", idKhoa=" + idKhoa
				+ "]";
	}

	
	
	
	
}
