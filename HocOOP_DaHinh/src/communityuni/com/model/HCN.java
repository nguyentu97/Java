package communityuni.com.model;

public class HCN extends HinhHoc {
	
	public HCN() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HCN(int chieuDai, int chieuRong) {
		super(chieuDai, chieuRong);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tinhChuVI() {
		
		return (this.getChieuDai()+this.getChieuRong())*2;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return this.getChieuDai()*this.getChieuRong();
	}

}
