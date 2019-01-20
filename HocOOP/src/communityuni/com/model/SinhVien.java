package communityuni.com.model;

public class SinhVien {
	private String hoTen ;
	private double diem ;
/*	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getHoTen() {
		return this.hoTen;
	}
	public void setDiem(double diem) {// thay đổi thông tin
		this.diem = diem;
	}
	public double getDiem() {// lấy thông tin
		return this.diem;
	}*/
	public SinhVien(String hoTen , double diem ) {
		this.hoTen=hoTen;
		this.diem = diem;
		System.out.println("Đây là contrustor có đối số");
	}
/*	public SinhVien() {
		this.hoTen = "xyz";
		System.out.println("Đây là contrustor mặc định");
	}
	public void xuatThongTin() {
		System.out.println(this.hoTen +"->"+this.diem);
	}
	*/
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Họ tên ="+this.hoTen+"\nĐiểm="+this.diem;
	}
}
