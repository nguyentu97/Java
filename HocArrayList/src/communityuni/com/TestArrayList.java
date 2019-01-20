package communityuni.com;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList ds1  = new ArrayList();
		ds1.add("1");
		ds1.add("5.5");
		ArrayList<Integer> ds2 = new ArrayList<Integer>();
		ArrayList<Double> ds3 = new ArrayList<Double>();
		ArrayList<Boolean>ds4 = new ArrayList<Boolean>();
		ArrayList<String>ds5 = new ArrayList<String>();
		ds5.add("Obama");
		ds5.add("Putin");
		ds5.add("Kim Jong Un");
		ds5.add("Biladen");
		
		for(int i = 0 ; i <ds5.size();i++) {
			System.out.println(ds5.get(i));
		}
		System.out.println();
		ds5.add(2, "Bush");
		System.out.println("Danh sach sau khi chen :");
		for(int i = 0 ; i <ds5.size();i++) {
			System.out.println(ds5.get(i));
		}
		System.out.println();
		ds5.remove(4);
		System.out.println("Danh sach sau khi xoa :");
		for(int i = 0 ; i <ds5.size();i++) {
			System.out.println(ds5.get(i));
		}
		System.out.println();
		System.out.println("Danh sach sau khi sua vt so 4");
	    ds5.set(3, "Ho Cam Dao");
	    for(int i = 0 ; i <ds5.size();i++) {
			System.out.println(ds5.get(i));
		}
		
		System.out.println();
		ds5.clear();
		System.out.println("Xoa toan bo danh sach :");
		System.out.println(ds5.size());
		
	}

}
