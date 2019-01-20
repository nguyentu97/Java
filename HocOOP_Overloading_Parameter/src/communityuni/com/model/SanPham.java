package communityuni.com.model;

public class SanPham {
	private int ma;
	private String ten;
	private double gia;
	public SanPham() {
		
	}
	public SanPham(int ma , String ten , double gia) {
		this.ma = ma;
		this.ten = ten;
		this.gia = gia;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public int ma() {
		return this.ma;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String ten() {
		return this.ten;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public double gia() {
		return this.gia;
	}
	@Override
	public String toString() {// ham  xuat du lieu
		return "ma :"+this.ma+"\nten : "+this.ten+"\ngia:"+this.gia;
	}
	public static double Sum(SanPham ...arr) {
		double tien = 0;
		for(SanPham sp:arr) {
			tien+=sp.gia; 
		}
		return tien;
	}
	
	
	
	
}
