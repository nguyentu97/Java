package communityuni.com.model;

public class SinhVien {
	private  int ma;
	private String ten;
	private double diem;
	public SinhVien() {
		
	}
	public SinhVien(int ma) {
		this();
		this.ma = ma;
	}
	public SinhVien(int ma ,String ten) {
		this(ma);
		this.ten=ten;
	}
	public SinhVien (int ma , String ten , double diem) {
		this(ma,ten);
		this.diem = diem;
	}
	public void xetTotNghiep() {
		if(this.diem>=5) {
			System.out.println("Du dk xet tot nghiep");
		}else {
			System.out.println("Chua du dk xet tot nghiep");
		}
	}
	public void xetTotNghiep(double diem) {
		System.out.println("ban co diem"+ diem);

	}
	public void xetTotNghiep(double diem , int vungUuTien) {
		System.out.println("ban co diem"+ diem +"Vung uu tien :"+vungUuTien);

	}
}
