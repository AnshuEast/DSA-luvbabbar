package RECURSION;

import java.util.*;

public class subset_recursionpblm {
	static int flag = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		subset(k, arr, 0, "");
		System.out.println("\n" + flag);
	}

	public static void subset(int k, int arr[], int count, String ans) {
		if (k==0&&ans.length()>=1) {
			flag++;
			for(int i=0;i<ans.length();i++)
			{
			System.out.print(ans.charAt(i)+" ");
			}
			return ;
		}
		if(count==arr.length)
		{
			return ;
		}
		subset(k-arr[count], arr, count+1, ans+arr[count]);//including 
		subset(k, arr, count, ans);//not including
	}
}
