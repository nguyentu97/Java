package communityuni.com.model;

import java.util.Scanner;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void inPutPoint() {
		System.out.println("Nhập tọa độ điểm(x,y)");
		System.out.println("x= ");
		x = new Scanner(System.in).nextInt();
		System.out.println("y= ");
		y = new Scanner(System.in).nextInt();
	}
	
	
	
}
