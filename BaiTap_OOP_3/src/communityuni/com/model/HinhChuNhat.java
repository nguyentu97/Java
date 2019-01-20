package communityuni.com.model;

import java.util.Scanner;

public class HinhChuNhat extends Hinh {
	private double chieuDai;
	private double chieuRong;

	public HinhChuNhat(String mau) {
		super(mau);
	}

	public HinhChuNhat(String mau, double chieuDai, double chieuRong) {
		super(mau);
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public HinhChuNhat() {
		super();
	}

	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}

	@Override
	public double tinhDienTich() {
		return chieuDai * chieuRong;
	}

	@Override
	public double tinhChuVi() {
		return (chieuDai + chieuRong) * 2;
	}
	
	public void input() {
		System.out.println("Chieu Dai: ");
		chieuDai = new Scanner(System.in).nextDouble();
		System.out.println("Chieu Rong: ");
		chieuRong = new Scanner(System.in).nextDouble();
	}
	
//	public String toString() {
//		return "HinhChuNhat [chieuDai: " + chieuDai + ", chieuRong: " + chieuRong + tinhChuVi()+tinhDienTich() ;
//	}
	public void output() {
		System.out.println("Chu Vi: " + tinhChuVi());
		System.out.println("Dien Tich: " + tinhDienTich());
	}

}
