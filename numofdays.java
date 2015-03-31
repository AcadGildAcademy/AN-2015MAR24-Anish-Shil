import java.util.*;
public class numofdays {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter name of the month (in lowercase): ");
		String month=s.nextLine();
		if(month.equalsIgnoreCase("february"))
			System.out.println("No. of days: 28");
		else if(month.equals("april")||month.equals("june")||month.equals("september")||month.equals("november"))
			System.out.println("No. of days: 30");
		else System.out.println("No. of days: 31");
		s.close();
	}
}
