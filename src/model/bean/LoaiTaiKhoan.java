package model.bean;

public class LoaiTaiKhoan {

	private int  id_LoaiTaiKhoan;
	private String  tenLoaiTaiKhoan;
	
	public LoaiTaiKhoan() {
		super();
	}

	public LoaiTaiKhoan(int id_LoaiTaiKhoan, String tenLoaiTaiKhoan) {
		super();
		this.id_LoaiTaiKhoan = id_LoaiTaiKhoan;
		this.tenLoaiTaiKhoan = tenLoaiTaiKhoan;
	}

	public int getid_LoaiTaiKhoan() {
		return id_LoaiTaiKhoan;
	}

	public void setid(int id_LoaiTaiKhoan) {
		this.id_LoaiTaiKhoan = id_LoaiTaiKhoan;
	}

	public String getTenLoaiTaiKhoan() {
		return tenLoaiTaiKhoan;
	}

	public void setTenLoaiTaiKhoan(String tenLoaiTaiKhoan) {
		this.tenLoaiTaiKhoan = tenLoaiTaiKhoan;
	}

	@Override
	public String toString() {
		return "LoaiTaiKhoan [id_LoaiTaiKhoan=" + id_LoaiTaiKhoan
				+ ", tenLoaiTaiKhoan=" + tenLoaiTaiKhoan + "]";
	}
	
	
	
	
	
	
}
