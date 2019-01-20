package communityuni.com.model;

import java.util.Scanner;


public class SanPham extends DanhMuc {
	private int maSP;
	private String tenSP;
	private double giaSP;
	private String xuatXuSP;
	public SanPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SanPham(String maDanhMuc, String tenDanhMuc) {
		super(maDanhMuc, tenDanhMuc);
		// TODO Auto-generated constructor stub
	}
	public SanPham(int maSP, String tenSP, double giaSP, String xuatXuSP) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.giaSP = giaSP;
		this.xuatXuSP = xuatXuSP;
	}
	public int getMaSP() {
		return maSP;
	}
	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public double getGiaSP() {
		return giaSP;
	}
	public void setGiaSP(double giaSP) {
		this.giaSP = giaSP;
	}
	public String getXuatXuSP() {
		return xuatXuSP;
	}
	public void setXuatXuSP(String xuatXuSP) {
		this.xuatXuSP = xuatXuSP;
	}
	public void nhapSanPham() {
		super.nhapDanhMuc();
		System.out.println("Nhập thông tin sản phẩm");
		System.out.println("Mã Sản Phẩm: ");
		maSP = new Scanner(System.in).nextInt();
		System.out.println("Tên Sản Phẩm: ");
		tenSP= new Scanner(System.in).nextLine();
		System.out.println("Giá Sản Phẩm: ");
		giaSP = new Scanner(System.in).nextDouble();
		System.out.println("Xuất Xứ Sản Phẩm: ");
		xuatXuSP = new Scanner(System.in).nextLine();
	}
	
	@Override
	public String toString() {
		return super.toString() +"\t\t "+ maSP + "\t\t " + tenSP + "\t\t " + giaSP + "\t\t " + xuatXuSP ;
	}
	
}
