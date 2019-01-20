package communityuni.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class BaiTap_ArrayList {
	static ArrayList<String> dsSV = new ArrayList<String>();

	public static void menu() {
		System.out.println("Danh sách các lựa chọn");
		System.out.println("1.Thêm sinh viên");
		System.out.println("2.Xuất danh sách sinh viên");
		System.out.println("3.Sửa sinh viên");
		System.out.println("4.Xóa sinh viên chưa tên bất kỳ");
		System.out.println("5.Tìm sinh viên mà tên có chữ An");
		System.out.println("6.Sắp xếp sinh viên");
		System.out.println("7.Xuất ra số lượng sinh viên");
		System.out.println("8.Thoát");
		System.out.println("Mời thím chọn số mấy !");
		int chon = new Scanner(System.in).nextInt();
		switch (chon) {
		case 1:
			themSV();
			break;
		case 2:
			xuatSV();
			break;
		case 3:
			suaSV();
			break;
		case 4:
			xoaSV();
			break;
		case 5:
			timKiemSV();
			break;
		case 6:
			sapXepSV();
			break;
		case 7:
			soLuongSV();
			break;
		case 8:
			System.err.println("Cảm ơn thím đã dùng phần mềm");
			System.exit(0);
			;
			break;
		default:
			System.out.println("Thím nhập lụi rồi thím ới!!!");
			break;
		}
		System.out.println("------------------");

	}

	private static void themSV() {
		System.out.println("Mời thím nhập thêm sinh viên");
		String nameSV = new Scanner(System.in).nextLine();
		dsSV.add(nameSV);// thêm mới 1 tên sv
		System.out.println("Thêm thành công!");

	}

	private static void xuatSV() {
		System.out.println("Danh sách sinh viên");
		System.out.println("STT\tTên SV");
		for (  int i = 0  ; i < dsSV.size(); i++) {
			System.out.println((i+1) + "\t" + dsSV.get(i));
		}

	}

	private static void suaSV() {
		System.out.println("Số thứ tự sinh viên sửa :");
		int k = new Scanner(System.in).nextInt();
		System.out.println("Tên sinh viên mới :");
		String nameSV = new Scanner(System.in).nextLine();
		String s = "";
		for (int i = 0; i < dsSV.size()+1; i++) {
			if (i == k) {
				s = dsSV.set(k-1, nameSV);// đặt lại tên sv theo số thứ tự của sv
			}
		}
		if (s.length() > 0) {
			System.out.println("Sửa thành công!");
		} else {
			System.out.println("Không tìm thấy số thứ tự sv cần sửa");
		}

	}

	private static void xoaSV() {
/*		// xóa theo mã
		System.out.println("Số thứ tự sinh viên muốn xóa :");
		int xoaSV = new Scanner(System.in).nextInt();
		String s = "";
		for (int i = 0; i < dsSV.size(); i++) {
			if (i == xoaSV) {
				s = dsSV.remove(xoaSV);// xóa sv theo thứ tự
			}
		}
		if (s.length() > 0) {
			System.out.println("Xóa thành công!");
		} else {
			System.out.println("Không tồn tại thứ tự sv cần xóa");
		}
*/		
		// xóa theo tên
		System.out.println("Tên sinh viên bạn muốn xóa :");
		String tenSV = new Scanner(System.in).nextLine();
		String s="" ;
		for(int i = 0 ; i<dsSV.size();i++) {
			if(dsSV.get(i).contains(tenSV)) {
				s += dsSV.remove(tenSV);
			}
		}
		if(s.length()!=0)
		System.out.println("Xóa thành công!");
		else {
			System.out.println("Không tồn tại tên sv");
		}
		

	}

	private static void timKiemSV() {
		System.out.println("Nhập tên sinh viên muốn tìm :");
		String nameSV = new Scanner(System.in).nextLine();
		System.out.println();
		String s ;
		for (int i = 0; i < dsSV.size(); i++) {
			if (dsSV.get(i).contains(nameSV)) {// kiểm tra trong danh sách có tên SV nào cần tìm không
				s=dsSV.get(i);
//				s =i+"-"+ dsSV.get(i);
				System.out.println(i+"."+s);

			}
		}
/*		if (s.length() != 0) {
			
			System.out.println("Có tồn tại tên " +nameSV +" trong danh sách");
			System.out.println("Danh sách có tên " +nameSV +" :");
			System.out.println(s);

		}else {
			System.out.println("Không tồn tại tên sv cần tìm");
		}*/

	}

	private static void sapXepSV() {
		Collections.sort(dsSV);
		;// xắp xếp theo alphabeta

	}

	private static void soLuongSV() {
		System.out.println("Số lượng sinh viên trong danh sách là :");
		int dem = 0;
		for (int i = 0; i < dsSV.size(); i++) {
			dem++;
		}
		System.out.println(dem);
	}

	public static void main(String[] args) {
		while (true) {
			menu();
		}

	}

}
