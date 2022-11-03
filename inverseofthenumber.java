package lecture_6;

import java.util.*;

public class inverseofthenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans=0;
		int i=1;
		while(n!=0)
		{
			int rem=n%10;
			ans=(int) (ans+(i*Math.pow(10,(rem-1))));
			n=n/10;
			i++;
		}
		System.out.print(ans);
	}

}
