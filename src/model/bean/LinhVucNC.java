package model.bean;

public class LinhVucNC {

	private String idLinhVucNghienCuu;
	private String tenLinhVucNghienCuu;
	
	public LinhVucNC() {
		super();
	}

	public LinhVucNC(String idLinhVucNghienCuu, String tenLinhVucNghienCuu) {
		super();
		this.idLinhVucNghienCuu = idLinhVucNghienCuu;
		this.tenLinhVucNghienCuu = tenLinhVucNghienCuu;
	}

	public String getIdLinhVucNghienCuu() {
		return idLinhVucNghienCuu;
	}

	public void setIdLinhVucNghienCuu(String idLinhVucNghienCuu) {
		this.idLinhVucNghienCuu = idLinhVucNghienCuu;
	}

	public String getTenLinhVucNghienCuu() {
		return tenLinhVucNghienCuu;
	}

	public void setTenLinhVucNghienCuu(String tenLinhVucNghienCuu) {
		this.tenLinhVucNghienCuu = tenLinhVucNghienCuu;
	}

	@Override
	public String toString() {
		return "LinhVucNC [idLinhVucNghienCuu=" + idLinhVucNghienCuu
				+ ", tenLinhVucNghienCuu=" + tenLinhVucNghienCuu + "]";
	}
	
	
	
	
}
