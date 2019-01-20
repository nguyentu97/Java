package communityuni.com.model;

public class NhanVien implements Cloneable {
	private int ma ;
	private String ten;
	public void setMa(int ma) {
		this.ma =ma;
	}
	public int getMa() {
		return ma;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getTen() {
		return ten;
	}
	public NhanVien(int ma , String ten) {
		this.ma = ma;
		this.ten = ten;
	}
	// sao chép 1 đối tượng giống y xì đối tượng cũ sang vùng nhớ khác  dùng hàm clone trong
	//Interface cloneable để sao chép đối tượng
	public NhanVien copy() {
		try {
			return (NhanVien) this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
