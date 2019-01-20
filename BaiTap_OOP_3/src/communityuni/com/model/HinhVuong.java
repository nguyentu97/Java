package communityuni.com.model;

import java.util.Scanner;

public class HinhVuong extends Hinh {

	private double a;

	public HinhVuong(String mau, double a) {
		super(mau);
		this.a = a;
	}

	public HinhVuong() {
		super();
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}


	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return a * a;
	}


	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return 4 * a;
	}
	public void  input() {
		System.out.println("Nhap canh a: ");
		a = new Scanner(System.in).nextDouble();

	}

	public String toString() {
		return "HinhVuong [a=" + a + "," + super.LayTongTin();
	}

}
