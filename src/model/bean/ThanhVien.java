package model.bean;

public class ThanhVien {
	
	private String idThanhVien;
	private String tenThanhVien;
	private String donVi;
	private String noiDungNghienCuu;
	private String idDeTai;
	
	public ThanhVien() {
		super();
	}
	
	public ThanhVien(String idThanhVien, String tenThanhVien, String donVi,
			String noiDungNghienCuu, String idDeTai) {
		super();
		this.idThanhVien = idThanhVien;
		this.tenThanhVien = tenThanhVien;
		this.donVi = donVi;
		this.noiDungNghienCuu = noiDungNghienCuu;
		this.idDeTai = idDeTai;
	}
	public String getIdThanhVien() {
		return idThanhVien;
	}
	public void setIdThanhVien(String idThanhVien) {
		this.idThanhVien = idThanhVien;
	}
	public String getTenThanhVien() {
		return tenThanhVien;
	}
	public void setTenThanhVien(String tenThanhVien) {
		this.tenThanhVien = tenThanhVien;
	}
	public String getDonVi() {
		return donVi;
	}
	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}
	public String getNoiDungNghienCuu() {
		return noiDungNghienCuu;
	}
	public void setNoiDungNghienCuu(String noiDungNghienCuu) {
		this.noiDungNghienCuu = noiDungNghienCuu;
	}
	public String getIdDeTai() {
		return idDeTai;
	}
	public void setIdDeTai(String idDeTai) {
		this.idDeTai = idDeTai;
	}
	@Override
	public String toString() {
		return "ThanhVien [idThanhVien=" + idThanhVien + ", tenThanhVien="
				+ tenThanhVien + ", donVi=" + donVi + ", noiDungNghienCuu="
				+ noiDungNghienCuu + ", idDeTai=" + idDeTai + "]";
	}
	
	
	
	
	

}
