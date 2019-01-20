package communityuni.com.model;

public class NhanVienChinhThuc extends NhanVien {
	public NhanVienChinhThuc() {
		super();
	}
	public NhanVienChinhThuc(int ma , String ten) {
		super(ma,ten);
	}
	public void tinhLuong() {
		super.tinhLuong();
		System.out.println("Day la nhan vien chinh thuc");
	}

}
