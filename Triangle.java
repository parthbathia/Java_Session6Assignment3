import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Triangle implements Shape {
	
	int height, base;
	public void draw(){
		
		System.out.println("The shape is a Triangle");
		
	}
	
	public void area(){
		
		System.out.println("Area of the Triangle is " + height*base*0.5);
		
	}
	
	public static void main(String[] args) throws Exception {
		
		Triangle t = new Triangle();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter height of Triangle : ");
		t.height = Integer.parseInt(br.readLine());
		
		System.out.print("Enter base of Triangle : ");
		t.base = Integer.parseInt(br.readLine());
		
		t.draw();
		t.area();

	}
	
}
