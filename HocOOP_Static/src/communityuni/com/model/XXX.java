package communityuni.com.model;

public class XXX {
	// *)Biến Static (static cho thuộc tính : gọi là Class member)
	// 	-Biến static(chia sẻ chung 1 vùng nhớ) là biến chung của mọi đối tượng khi 1 đối
	//   tượng thay đổi biến a thì các đối tượng khác đều biết đến sự thay đổi 
	public static int a ; 
	public void setA(int a) {
		this.a= a;
	}
	public int getA() {
		return this.a;
	}
	
	//*) Hàm Static (satic cho phương thức : gọi là Class Method)
	//   -Những phương thức có static thì gọi phương thức thông qua lớp trục tiếp mà 
	//    không cần thông qua đối tượng của lớp đó .
	// vd : Class ABC => ABC.(method) không cần mất thêm 1 bước tạo đối tượng
	//      ABC FC1 = new ABC() => FC1.(method)
	
	public static void fc1() {
		
	}
	public void fc2() {
		
		
	}
	//*) Chú Ý : Khi nào dùng hàm(biến) static 
	//		+ Khi muốn cung cấp hàm(biến) mà hàm(biến) này là sử dụng chung thì ta để static 
	
	
	
	
}
