package communityuni.com.model;

import java.io.Serializable;

public class KhachHang implements Serializable,Comparable<KhachHang> {
	private int maKH;
	private String tenKH;
	private String phone;
	
	
	public KhachHang() {
		super();
	}
	
	public KhachHang(int maKH, String tenKH, String phone) {
		super();
		this.maKH = maKH;
		this.tenKH = tenKH;
		this.phone = phone;
	}

	public int getMaKH() {
		return maKH;
	}

	public void setMaKH(int maKH) {
		this.maKH = maKH;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		
		return this.maKH+"\t"+this.tenKH+"\t"+this.phone;
	}

	@Override
	public int compareTo(KhachHang o) {
		return this.phone.compareToIgnoreCase(o.phone);
	}
	
	
}
