
public class Circle {
	
	private double radius;
	private double area;
	private double circumference;
	
	public static double PI = 3.1416; //pi value
	
	public Circle(double rIn, double areaIn, double circumIn) {
		radius = 4.2; //radius value
		area = PI * radius * radius; //area value
		circumference = 2 * PI * radius; //circum value
	}
	
	public double getRadius() { //method
		
		return radius; 
	}
	
	public double calculateArea() { //method
		
		return area;
	}
	
	public double calculateCircumference() { //method
		
		return circumference;
	}
	
	public double setRadius() { //method
		
		return radius;
	}
	

}
