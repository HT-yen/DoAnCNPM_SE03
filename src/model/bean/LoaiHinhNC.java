package model.bean;

public class LoaiHinhNC {
	
	private String idLoaiHinhNghienCuu;
	private String tenLoaiHinhNghienCuu;
	
	public LoaiHinhNC() {
		super();
	}

	public LoaiHinhNC(String idLoaiHinhNghienCuu, String tenLoaiHinhNghienCuu) {
		super();
		this.idLoaiHinhNghienCuu = idLoaiHinhNghienCuu;
		this.tenLoaiHinhNghienCuu = tenLoaiHinhNghienCuu;
	}

	public String getIdLoaiHinhNghienCuu() {
		return idLoaiHinhNghienCuu;
	}

	public void setIdLoaiHinhNghienCuu(String idLoaiHinhNghienCuu) {
		this.idLoaiHinhNghienCuu = idLoaiHinhNghienCuu;
	}

	public String getTenLoaiHinhNghienCuu() {
		return tenLoaiHinhNghienCuu;
	}

	public void setTenLoaiHinhNghienCuu(String tenLoaiHinhNghienCuu) {
		this.tenLoaiHinhNghienCuu = tenLoaiHinhNghienCuu;
	}

	@Override
	public String toString() {
		return "LoaiHinhNC [idLoaiHinhNghienCuu=" + idLoaiHinhNghienCuu
				+ ", tenLoaiHinhNghienCuu=" + tenLoaiHinhNghienCuu + "]";
	}
	
	

}
