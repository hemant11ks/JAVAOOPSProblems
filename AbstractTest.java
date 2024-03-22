
public class AbstractTest {
	public static void main(String[] args) {
		
		Circle circle = new Circle(100);
		
		circle.draw();
		circle.calculateArea();
		circle.calculatePerimeter();
		circle.fillColor();
		
		System.out.println("-------");
		
		Ellipse e = new Ellipse(600,700);
		e.draw();
		e.calculateArea();
		e.calculatePerimeter();
		e.fillColor();
		
		System.out.println("-------");
		
		Square sq = new Square(50);
		sq.draw();
		sq.calculateArea();
		sq.calculatePerimeter();
		sq.fillColor();
		
		System.out.println("-------");
		
		Rectangle rect = new Rectangle(555, 666);
		rect.draw();
		rect.calculateArea();
		rect.calculatePerimeter();
		rect.fillColor();
		
	}
}

abstract class GeometricalShape
{
	abstract void calculateArea();
	abstract void draw();
	abstract void calculatePerimeter();
	void fillColor() {
		System.out.println("Filling color...");
	}
}
//The type Circle must implement the
//inherited abstract method GeometricalShape.draw()

//The type Circle must implement the 
//inherited abstract method GeometricalShape.calculatePerimeter()

//The type Circle must implement the 
//inherited abstract method GeometricalShape.calculateArea()
class Circle extends GeometricalShape
{
	int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	void draw() { 
		System.out.println("drawing Circle...");
	}
	void calculatePerimeter() { 
		System.out.println("calculating perimeter of Circle...");

		float peri = 2 * 3.14f * radius;
	}
	void calculateArea() { 
		System.out.println("calculating area of Circle...");

		float area = 3.14f  * radius * radius;
	}
}
class Ellipse extends Circle //isA
{
	int radius2;
	
	
	public Ellipse(int radius, int radius2) {
		super(radius);
		this.radius2 = radius2;
	}
	
	void draw() { 
		System.out.println("drawing Ellipse...");
	}
	void calculatePerimeter() { 
		//float peri = 4 * side;
		System.out.println("calculating perimeter of Ellipse...");
		
	}
	void calculateArea() { 
		System.out.println("calculating area of Ellipse...");

		//float area = side * side;
	}
}

class Square extends GeometricalShape
{
	int side;
	
	
	
	public Square(int side) {
		super();
		this.side = side;
	}
	void draw() { 
		System.out.println("drawing square...");
	}
	void calculatePerimeter() { 
		System.out.println("calculating perimeter of Square...");

		float peri = 4 * side;
	}
	void calculateArea() { 
		System.out.println("calculating area of Square...");

		float area = side * side;
	}
	
}

class Rectangle extends Square //isA
{
	int side2;
	
	
	
	public Rectangle(int side, int side2) {
		super(side);
		this.side2 = side2;
	}
	void draw() { 
		System.out.println("drawing square...");
	}
	void calculatePerimeter() { 
		System.out.println("calculating perimeter of Rectangle...");

		float peri = 2 * (side + side2);
	}
	void calculateArea() { 
		System.out.println("calculating area of Rectangle...");

		float area = side * side2;
	}
	
}








