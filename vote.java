import java.util.*;
public class vote {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age=s.nextInt();
		if(age>=18) System.out.println("You are eligible to vote");
		else System.out.println("You are not eligible to vote");
		s.close();
	}
}
