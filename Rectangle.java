import java.io.*;

public class Rectangle {

	int length, breadth;
	public void draw(){
		
		System.out.println("The shape is a Rectangle");
		
	}
	
	public void area(){
		
		System.out.println("Area of the Rectangle is " + length*breadth);
		
	}
	
	public static void main(String[] args) throws Exception {
		
		Rectangle r = new Rectangle();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter length of Rectangle : ");
		r.length = Integer.parseInt(br.readLine());
		
		System.out.print("Enter breadth of Rectangle : ");
		r.breadth = Integer.parseInt(br.readLine());
		
		r.draw();
		r.area();

	}
}