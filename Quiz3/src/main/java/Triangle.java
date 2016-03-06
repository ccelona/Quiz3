
public class Triangle extends GeometricObject {

	//data fields
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	//no-arg constructor
	public Triangle() {
		
	}
	
	//constructor that creates triangle with specified sides
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	//Accessor methods
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	//Methods
	
	public double getPerimeter() { //returns the perimeter of triangle
		return side1 + side2 + side3;
	}
	
	public double gethP() { //hP is half the perimeter
		return (side1 + side2 + side3)/2;
	}
	
	public double getAreaSquared() { //gives the area squared of the triangle
		return gethP()*(gethP()-side1)*(gethP()-side2)*(gethP()-side3);
	}
	
	public double getArea() { //returns area of triangle
		return Math.sqrt(getAreaSquared());
	}
	
	public String toString() { //returns a string description for the triangle
		return "Side 1 = " + side1 + "Side2 = " + side2 + "Side3 = " + side3;
	}
	
}
