import java.util.*;
public class vowel {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter an alphabet: ");
		char c=s.nextLine().charAt(0);
		if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
			System.out.println(c+" is a vowel");
		else System.out.println(c+" is a consonant");
		s.close();
	}
}
