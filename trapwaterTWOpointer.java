package selfstudy;

import java.util.Scanner;

public class trapwaterTWOpointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int n = sc.nextInt();
		while (T-- > 0) {
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(raintrap(arr));
		}
	}
	public static int raintrap(int arr[]) {
		int n=arr.length;
		int s=0;
		int e=n-1;
		int result=0;
		int leftmax=0;
		int rightmax=0;
		while(s<=e)
		{
			if(arr[s]<arr[e])
			{
				if(arr[s]<leftmax)
				{
					result=result+(leftmax-arr[s]);
				}
				else
				{
					leftmax=arr[s];
				}
				s++;
			}
			else
			{
				if(arr[e]<rightmax)
				{
					result=result+(rightmax-arr[e]);
				}
				else
				{
					rightmax=arr[e];
				}
				e--;
			}
		}
		return result;
	}

	
}
