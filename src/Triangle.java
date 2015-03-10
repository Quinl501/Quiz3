import java.lang.Math;
public class Triangle extends GeometricObject{
	
	double side1;
	double side2;
	double side3;
	double Area;

	public Triangle(){
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
		
	}
	
	public Triangle( double sideA, double  sideB, double sideC){
		side1 = sideA;
		side2 = sideB;
		side3 = sideC;
		
	}
	
	public double getArea(){
		// need to use heron's formula????????????
		double HalfPerimeter = (side1 + side2 + side3) /2;
		Area = Math.sqrt((HalfPerimeter)*(HalfPerimeter - side1)*(HalfPerimeter - side2)*(HalfPerimeter - side3));
		return Area;
	}
	
	public double getSide1(){
		return side1;
		
	}

	public double getSide2(){
		return side2;
		
	}
	
	
	public double getSide3(){
		return side3;
		
	}
	
	
	

	public double getPerimeter() {
		return (side1 + side2 + side3);
	}
	
	public String toString(){
		return ("The triangle of side lengths" + side1 + ", " + side2 + ", " + side3 + " have and area of " + Area + ".");
	}
	
}
