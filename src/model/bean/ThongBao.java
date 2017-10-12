package model.bean;

import java.sql.Timestamp;

public class ThongBao {

	private String idThongBao;
	private String idUserThongBao;
	private String idUserDen;
	private String noiDung;
	private String idQuaTrinhThucHien;
	private Timestamp thoiGian;
	
	public ThongBao() {
		super();
	}

	public ThongBao(String idThongBao, String idUserThongBao, String idUserDen,
			String noiDung, String idQuaTrinhThucHien, Timestamp thoiGian) {
		super();
		this.idThongBao = idThongBao;
		this.idUserThongBao = idUserThongBao;
		this.idUserDen = idUserDen;
		this.noiDung = noiDung;
		this.idQuaTrinhThucHien = idQuaTrinhThucHien;
		this.thoiGian = thoiGian;
	}

	public String getIdThongBao() {
		return idThongBao;
	}

	public void setIdThongBao(String idThongBao) {
		this.idThongBao = idThongBao;
	}

	public String getIdUserThongBao() {
		return idUserThongBao;
	}

	public void setIdUserThongBao(String idUserThongBao) {
		this.idUserThongBao = idUserThongBao;
	}

	public String getIdUserDen() {
		return idUserDen;
	}

	public void setIdUserDen(String idUserDen) {
		this.idUserDen = idUserDen;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public String getIdQuaTrinhThucHien() {
		return idQuaTrinhThucHien;
	}

	public void setIdQuaTrinhThucHien(String idQuaTrinhThucHien) {
		this.idQuaTrinhThucHien = idQuaTrinhThucHien;
	}

	public Timestamp getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(Timestamp thoiGian) {
		this.thoiGian = thoiGian;
	}

	@Override
	public String toString() {
		return "ThongBao [idThongBao=" + idThongBao + ", idUserThongBao="
				+ idUserThongBao + ", idUserDen=" + idUserDen + ", noiDung="
				+ noiDung + ", idQuaTrinhThucHien=" + idQuaTrinhThucHien
				+ ", thoiGian=" + thoiGian + "]";
	}

	
	
	
	
}
