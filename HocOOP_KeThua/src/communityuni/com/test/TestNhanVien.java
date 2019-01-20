package communityuni.com.test;

import communityuni.com.model.NhanVienChinhThuc;
import communityuni.com.model.NhanVienThoiVu;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVienChinhThuc teo = new NhanVienChinhThuc(1,"Nguyen Van Teo");
		NhanVienThoiVu ty = new NhanVienThoiVu(2, "Tran thi Ty");
		teo.tinhLuong();
		ty.tinhLuong();

	}

}
