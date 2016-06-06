import java.io.*;

public class Square implements Shape {

	int side;
	public void draw(){
		
		System.out.println("The shape is a Square");
		
	}
	
	public void area(){
		
		System.out.println("Area of the Square is " + side*side);
		
	}
	
	public static void main(String[] args) throws Exception {
		
		Square s = new Square();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter side of Square : ");
		s.side = Integer.parseInt(br.readLine());
		s.draw();
		s.area();

	}

}
