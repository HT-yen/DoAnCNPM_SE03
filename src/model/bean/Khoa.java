package model.bean;

public class Khoa {

	private String idKhoa;
	private String tenKhoa;
	
	public Khoa() {
		super();
	}

	public Khoa(String idKhoa, String tenKhoa) {
		super();
		this.idKhoa = idKhoa;
		this.tenKhoa = tenKhoa;
	}

	public String getIdKhoa() {
		return idKhoa;
	}

	public void setIdKhoa(String idKhoa) {
		this.idKhoa = idKhoa;
	}

	public String getTenKhoa() {
		return tenKhoa;
	}

	public void setTenKhoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}

	@Override
	public String toString() {
		return "Khoa [idKhoa=" + idKhoa + ", tenKhoa=" + tenKhoa + "]";
	}
	
	
	
	
}
