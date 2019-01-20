package communityuni.com.model;

public class Circle extends Point {
	final double PI = 3.14;
	private double radius;
	
	public Circle(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public Circle() {
		super();
	}

	public Circle(double radiusValue,int xValue, int yValue) {
		
		setX(xValue);
		setY(yValue);
		this.radius = radiusValue;
		
	}

	public double getRadius() {
		return getDiameter()/2;
	}

	public void setRadius(double radiusValue) {
		this.radius = radiusValue;
	}
	
	public double getDiameter() {
		return Math.sqrt(Math.pow(getX(), 2)+Math.pow(getY(), 2));
	}
	public double getCircumference() {
		return 2*PI*(getDiameter()/2);

	}
	public double getArea() {
		return PI*Math.pow(getRadius(), 2);
	}
	public void inPutCircle() {
		super.inPutPoint();
	}
	public void outPut() {
		System.out.println("Đường kính hình tròn :" + getDiameter());
		System.out.println("Bán kính hình tròn :" + getRadius());
		System.out.println("Chu vi hình tròn :" + getCircumference());
		System.out.println("Dien tich hình tròn :" + getArea() );
	}
	

	
}
