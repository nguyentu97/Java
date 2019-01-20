package communityuni.com.model;

import java.util.Scanner;

public class HinhTron extends Hinh {
	final double PI = 3.14;
	private double r;
	
	
	public HinhTron() {
		super();
	}

	public HinhTron(String mau, double r) {
		super(mau);
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return PI*r*r;
	}

	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return 2*PI*r;
	}
	public void input() {
		System.out.println("Nhap ban kinh(R): ");
		r = new Scanner(System.in).nextDouble();
	}

	public String toString() {
		return "HinhTron [PI=" + PI + ", r=" + r + ","+super.LayTongTin();
	}
	

}
