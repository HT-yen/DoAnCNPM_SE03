package model.bean;

import java.sql.Timestamp;

public class QuaTrinhThucHien {

	private String idQuaTrinhThucHien;
	private String idGiangVien;
	private String idDeTai;
	private String trangThai;
	private Timestamp thoiGian;
	private String chuDe;
	private String noiDung;
	
	public QuaTrinhThucHien() {
		super();
	}

	public QuaTrinhThucHien(String idQuaTrinhThucHien, String idGiangVien,
			String idDeTai, String trangThai, Timestamp thoiGian, String chuDe,
			String noiDung) {
		super();
		this.idQuaTrinhThucHien = idQuaTrinhThucHien;
		this.idGiangVien = idGiangVien;
		this.idDeTai = idDeTai;
		this.trangThai = trangThai;
		this.thoiGian = thoiGian;
		this.chuDe = chuDe;
		this.noiDung = noiDung;
	}

	public String getIdQuaTrinhThucHien() {
		return idQuaTrinhThucHien;
	}

	public void setIdQuaTrinhThucHien(String idQuaTrinhThucHien) {
		this.idQuaTrinhThucHien = idQuaTrinhThucHien;
	}

	public String getIdGiangVien() {
		return idGiangVien;
	}

	public void setIdGiangVien(String idGiangVien) {
		this.idGiangVien = idGiangVien;
	}

	public String getIdDeTai() {
		return idDeTai;
	}

	public void setIdDeTai(String idDeTai) {
		this.idDeTai = idDeTai;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public Timestamp getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(Timestamp thoiGian) {
		this.thoiGian = thoiGian;
	}

	public String getChuDe() {
		return chuDe;
	}

	public void setChuDe(String chuDe) {
		this.chuDe = chuDe;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	@Override
	public String toString() {
		return "QuaTrinhThucHien [idQuaTrinhThucHien=" + idQuaTrinhThucHien
				+ ", idGiangVien=" + idGiangVien + ", idDeTai=" + idDeTai
				+ ", trangThai=" + trangThai + ", thoiGian=" + thoiGian
				+ ", chuDe=" + chuDe + ", noiDung=" + noiDung + "]";
	}
	
	
	
	
	
}
