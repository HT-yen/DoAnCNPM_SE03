package model.bean;

public class LoaiTaiKhoan {

	private String  idLoaiTaiKhoan;
	private String  tenLoaiTaiKhoan;
	
	public LoaiTaiKhoan() {
		super();
	}

	public LoaiTaiKhoan(String idLoaiTaiKhoan, String tenLoaiTaiKhoan) {
		super();
		this.idLoaiTaiKhoan = idLoaiTaiKhoan;
		this.tenLoaiTaiKhoan = tenLoaiTaiKhoan;
	}

	public String getIdLoaiTaiKhoan() {
		return idLoaiTaiKhoan;
	}

	public void setIdLoaiTaiKhoan(String idLoaiTaiKhoan) {
		this.idLoaiTaiKhoan = idLoaiTaiKhoan;
	}

	public String getTenLoaiTaiKhoan() {
		return tenLoaiTaiKhoan;
	}

	public void setTenLoaiTaiKhoan(String tenLoaiTaiKhoan) {
		this.tenLoaiTaiKhoan = tenLoaiTaiKhoan;
	}

	@Override
	public String toString() {
		return "LoaiTaiKhoan [idLoaiTaiKhoan=" + idLoaiTaiKhoan
				+ ", tenLoaiTaiKhoan=" + tenLoaiTaiKhoan + "]";
	}
	
	
	
	
	
	
}
