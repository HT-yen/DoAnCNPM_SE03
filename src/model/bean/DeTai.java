package model.bean;

import java.sql.Timestamp;

public class DeTai {
	
	private String idDeTai;
	private String tenDeTai;
	private String maSoDeTai;
	private String idLinhVucNghienCuu;
	private String idLoaiHinhNghienCuu;
	private Timestamp thoiGianBatDau;
	private Timestamp thoiGianKetThuc;
	private String donViChuTri;
	private String idUser;
	private String donViPhoiHopChinh;
	private String tongQuan;
	private String tinhCapThiet;
	private String mucTieu;
	private String phamViNghienCuu;
	private String phuongPhapNghienCuu;
	private String noiDung;
	private String sanPham;
	private String hieuQua;
	private int kinhPhiThucHien;
	private String trangThai;
	private String capDeTai;
	
	public DeTai() {
		super();
	}

	public DeTai(String idDeTai, String tenDeTai, String maSoDeTai,
			String idLinhVucNghienCuu, String idLoaiHinhNghienCuu,
			Timestamp thoiGianBatDau, Timestamp thoiGianKetThuc,
			String donViChuTri, String idUser, String donViPhoiHopChinh,
			String tongQuan, String tinhCapThiet, String mucTieu,
			String phamViNghienCuu, String phuongPhapNghienCuu, String noiDung,
			String sanPham, String hieuQua, int kinhPhiThucHien,
			String trangThai, String capDeTai) {
		super();
		this.idDeTai = idDeTai;
		this.tenDeTai = tenDeTai;
		this.maSoDeTai = maSoDeTai;
		this.idLinhVucNghienCuu = idLinhVucNghienCuu;
		this.idLoaiHinhNghienCuu = idLoaiHinhNghienCuu;
		this.thoiGianBatDau = thoiGianBatDau;
		this.thoiGianKetThuc = thoiGianKetThuc;
		this.donViChuTri = donViChuTri;
		this.idUser = idUser;
		this.donViPhoiHopChinh = donViPhoiHopChinh;
		this.tongQuan = tongQuan;
		this.tinhCapThiet = tinhCapThiet;
		this.mucTieu = mucTieu;
		this.phamViNghienCuu = phamViNghienCuu;
		this.phuongPhapNghienCuu = phuongPhapNghienCuu;
		this.noiDung = noiDung;
		this.sanPham = sanPham;
		this.hieuQua = hieuQua;
		this.kinhPhiThucHien = kinhPhiThucHien;
		this.trangThai = trangThai;
		this.capDeTai = capDeTai;
	}

	public String getIdDeTai() {
		return idDeTai;
	}

	public void setIdDeTai(String idDeTai) {
		this.idDeTai = idDeTai;
	}

	public String getTenDeTai() {
		return tenDeTai;
	}

	public void setTenDeTai(String tenDeTai) {
		this.tenDeTai = tenDeTai;
	}

	public String getMaSoDeTai() {
		return maSoDeTai;
	}

	public void setMaSoDeTai(String maSoDeTai) {
		this.maSoDeTai = maSoDeTai;
	}

	public String getIdLinhVucNghienCuu() {
		return idLinhVucNghienCuu;
	}

	public void setIdLinhVucNghienCuu(String idLinhVucNghienCuu) {
		this.idLinhVucNghienCuu = idLinhVucNghienCuu;
	}

	public String getIdLoaiHinhNghienCuu() {
		return idLoaiHinhNghienCuu;
	}

	public void setIdLoaiHinhNghienCuu(String idLoaiHinhNghienCuu) {
		this.idLoaiHinhNghienCuu = idLoaiHinhNghienCuu;
	}

	public Timestamp getThoiGianBatDau() {
		return thoiGianBatDau;
	}

	public void setThoiGianBatDau(Timestamp thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}

	public Timestamp getThoiGianKetThuc() {
		return thoiGianKetThuc;
	}

	public void setThoiGianKetThuc(Timestamp thoiGianKetThuc) {
		this.thoiGianKetThuc = thoiGianKetThuc;
	}

	public String getDonViChuTri() {
		return donViChuTri;
	}

	public void setDonViChuTri(String donViChuTri) {
		this.donViChuTri = donViChuTri;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public String getDonViPhoiHopChinh() {
		return donViPhoiHopChinh;
	}

	public void setDonViPhoiHopChinh(String donViPhoiHopChinh) {
		this.donViPhoiHopChinh = donViPhoiHopChinh;
	}

	public String getTongQuan() {
		return tongQuan;
	}

	public void setTongQuan(String tongQuan) {
		this.tongQuan = tongQuan;
	}

	public String getTinhCapThiet() {
		return tinhCapThiet;
	}

	public void setTinhCapThiet(String tinhCapThiet) {
		this.tinhCapThiet = tinhCapThiet;
	}

	public String getMucTieu() {
		return mucTieu;
	}

	public void setMucTieu(String mucTieu) {
		this.mucTieu = mucTieu;
	}

	public String getPhamViNghienCuu() {
		return phamViNghienCuu;
	}

	public void setPhamViNghienCuu(String phamViNghienCuu) {
		this.phamViNghienCuu = phamViNghienCuu;
	}

	public String getPhuongPhapNghienCuu() {
		return phuongPhapNghienCuu;
	}

	public void setPhuongPhapNghienCuu(String phuongPhapNghienCuu) {
		this.phuongPhapNghienCuu = phuongPhapNghienCuu;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public String getSanPham() {
		return sanPham;
	}

	public void setSanPham(String sanPham) {
		this.sanPham = sanPham;
	}

	public String getHieuQua() {
		return hieuQua;
	}

	public void setHieuQua(String hieuQua) {
		this.hieuQua = hieuQua;
	}

	public int getKinhPhiThucHien() {
		return kinhPhiThucHien;
	}

	public void setKinhPhiThucHien(int kinhPhiThucHien) {
		this.kinhPhiThucHien = kinhPhiThucHien;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public String getCapDeTai() {
		return capDeTai;
	}

	public void setCapDeTai(String capDeTai) {
		this.capDeTai = capDeTai;
	}

	@Override
	public String toString() {
		return "DeTai [idDeTai=" + idDeTai + ", tenDeTai=" + tenDeTai
				+ ", maSoDeTai=" + maSoDeTai + ", idLinhVucNghienCuu="
				+ idLinhVucNghienCuu + ", idLoaiHinhNghienCuu="
				+ idLoaiHinhNghienCuu + ", thoiGianBatDau=" + thoiGianBatDau
				+ ", thoiGianKetThuc=" + thoiGianKetThuc + ", donViChuTri="
				+ donViChuTri + ", idUser=" + idUser + ", donViPhoiHopChinh="
				+ donViPhoiHopChinh + ", tongQuan=" + tongQuan
				+ ", tinhCapThiet=" + tinhCapThiet + ", mucTieu=" + mucTieu
				+ ", phamViNghienCuu=" + phamViNghienCuu
				+ ", phuongPhapNghienCuu=" + phuongPhapNghienCuu + ", noiDung="
				+ noiDung + ", sanPham=" + sanPham + ", hieuQua=" + hieuQua
				+ ", kinhPhiThucHien=" + kinhPhiThucHien + ", trangThai="
				+ trangThai + ", capDeTai=" + capDeTai + "]";
	}
	
	
	
}
