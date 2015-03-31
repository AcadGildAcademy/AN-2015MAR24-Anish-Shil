public class prime {
	public static void main(String args[]) {
		System.out.println("Prime numbers between 1 and 100");
		for(int i=1;i<=100;i++) {
			int cnt=0;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) cnt++;
			}
			if(cnt==0) System.out.print(i+" ");
		}
	}
}
