package communityuni.com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "An");// dua gia tri vao
		map.put(2, "Binh");
		map.put(3, "Hanh");
		map.put(4, "Phuc");
		map.put(5, "Giai");
		map.put(6, "Thoat");
		// Lay danh sach ten
		Collection<String> dsTen = map.values();
		for (String ten : dsTen) {
			System.out.println(ten);
		}
		// Lay danh sach ma
		Set<Integer> dsMa = map.keySet();
		for (int ma : dsMa) {
			System.out.println(ma);
		}
		// Lay phan tu trong danh sach
		String ten = map.get(4);
		System.out.println(ten);
		// them vao danh sach trung thi ko them ma khac thi them vao 
		if (map.containsKey(4) == false) {
			map.put(4, "Happy");
		}
		dsTen = map.values();
		for (String ten1 : dsTen) {
			System.out.println(ten1);
		}
		System.out.println("--------------------------");
		dsTen = map.values();
		for (String ten1 : dsTen) {
			System.out.println(ten1);
		}

		map.remove(2);// xoa theo khoa chinh
		System.out.println("Danh sach sau khi xoa");
		for (String ten1 : dsTen) {
			System.out.println(ten1);
		}

		map.clear();// xoa toan bo sanh sach
		System.out.println("So phan tu con lai la :" + dsTen.size());

	}

}
