package SLIDING_WINDOW;

import java.util.*;

public class kartik_bhaiya_and_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		String s=sc.next();
		int max1=maximum(s,k,'a');
		int max2=maximum(s,k,'b');
		System.out.println(Math.max(max1, max2));
	}
	public static int maximum(String s,int k,char ch) {
		int i=0;
		int j=0;
		int ans=0;
		int flip=0;
		while(j<s.length())
		{
		if(s.charAt(j)==ch)
		{
			flip++;
		}
		while(flip>k&&i<=j)
		{
			if(s.charAt(i)==ch)
			{
				flip--;
			}
			i++;
		}
		ans=Math.max(ans, j-i+1);
		j++;
	}
	return ans;
	}
}
