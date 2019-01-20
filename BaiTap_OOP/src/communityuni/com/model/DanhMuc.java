package communityuni.com.model;

import java.util.Scanner;

public  class DanhMuc {
	private String maDanhMuc;
	private String tenDanhMuc;
	
	public DanhMuc() {
		super();
	}

	public DanhMuc(String maDanhMuc, String tenDanhMuc) {
		super();
		this.maDanhMuc = maDanhMuc;
		this.tenDanhMuc = tenDanhMuc;
	}

	public String getMaDanhMuc() {
		return maDanhMuc;
	}

	public void setMaDanhMuc(String maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}

	public String getTenDanhMuc() {
		return tenDanhMuc;
	}

	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}
	public void nhapDanhMuc() {
		System.out.println("Nhập thông tin danh muc sản phẩm");
		System.out.println("Mã Danh Muc: ");
		maDanhMuc= new Scanner(System.in).nextLine();
		System.out.println("Tên Danh Muc: ");
		tenDanhMuc= new Scanner(System.in).nextLine();
	}
	
	@Override
	public String toString() {
		return maDanhMuc + "\t\t " + tenDanhMuc;
	}
	
}
