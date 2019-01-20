package communityuni.com.model;

public class NhanVienChinhThuc extends NhanVien {

	@Override
	public void tinhLuong(int ngayCong) {
		if(ngayCong<20) {
			System.out.println("5tr");
		}else {
			System.out.println("20tr");
		}

	}

}
