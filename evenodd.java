import java.util.*;
public class evenodd {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=s.nextInt();
		if(num%2!=0) System.out.println("Number is odd");
		else System.out.println("Number is even");
		s.close();
	}
}
