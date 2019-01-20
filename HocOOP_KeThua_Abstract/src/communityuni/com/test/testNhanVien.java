package communityuni.com.test;

import communityuni.com.model.NhanVienChinhThuc;
import communityuni.com.model.NhanVienThoiVu;

public class testNhanVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVienChinhThuc teo = new NhanVienChinhThuc(1,"Teo");
		teo.tinhLuong();
		
		NhanVienThoiVu ty = new NhanVienThoiVu(2,"Ty me");
		ty.tinhLuong();
	}

}
