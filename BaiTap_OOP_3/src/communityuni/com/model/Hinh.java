package communityuni.com.model;

public abstract class Hinh {
	private String mau;
	
	public Hinh() {
		super();
	}

	public Hinh(String mau) {
		this.mau = mau;
	}

	public String getMau() {
		return mau;
	}

	public void setMau(String mau) {
		this.mau = mau;
	}

	public abstract double tinhDienTich();

	public abstract double tinhChuVi();
	
	public String LayTongTin() {
		return "Mau: " + mau + ",DienTich: " + tinhDienTich() + ",ChuVI: " + tinhChuVi() + "]";
	}

}
