import java.util.*;
public class leapyear {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year=s.nextInt();
		if(year%100==0) {
			if(year%400==0) System.out.println("It is a leap year");
			else System.out.println("It is not a leap year");
		}
		else {
			if(year%4==0) System.out.println("It is a leap year");
			else System.out.println("It is not a leap year");
		}
		s.close();
	}
}
