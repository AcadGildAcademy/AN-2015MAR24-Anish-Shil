import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		//inheritance
		/*System.out.println("Enter base length and breadth/height: ");
		int len=s.nextInt();
		int br=s.nextInt();
		triIn t=new triIn(len,br);
		t.areaTri();*/
		
		//method overloading
		/*System.out.print("Enter 1 for default values, 2 for area of square, 3 for area of rectangle: ");
		int choice=s.nextInt();
		switch(choice) {
			case 1:rectLoad rect1=new rectLoad();
				rect1.areaRect();
				break;
			case 2:System.out.print("Enter side length: ");
				int side=s.nextInt();
				rectLoad rect2=new rectLoad(side);
				rect2.areaRect();
				break;
			case 3:System.out.println("Enter length and breadth: ");
				int len=s.nextInt();
				int br=s.nextInt();
				rectLoad rect3=new rectLoad(len,br);
				rect3.areaRect();
				break;
			default:System.out.println("Wrong choice!!");
		}*/
		
		//method overriding
		/*sbi ob1=new sbi();
		icici ob2=new icici();
		axis ob3=new axis();
		ob1.getRateOfInterest();
		ob2.getRateOfInterest();
		ob3.getRateOfInterest();*/
		s.close();
	}
}
