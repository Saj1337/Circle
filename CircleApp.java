import java.util.Scanner; 

public class CircleApp {
	public static void main( String[] args )
{
		
	Scanner in = new Scanner(System.in);
	System.out.print("*** Circle App ***"); 
	int radius = in.nextInt();
	int diameter = (2 * radius);
	const PI = 3.142;
	System.out.printf("diameter: ", diameter);
	double area = (PI * (radius * 2));
	System.out.printf("area: ", area);
	//code to be completed
	System.out.print("end of program");
	
	}
	
	

}
