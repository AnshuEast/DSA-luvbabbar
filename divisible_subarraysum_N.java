package Hackerblocksquestions;

import java.util.Scanner;

public class divisible_subarraysum_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0)
		{
			int n=sc.nextInt();
			int []arr=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
		System.out.println(divisble(arr));
		}
		
	}
	public static long divisble(int arr[])
	{
		long frq[]=new long[arr.length];
		frq[0]=1;
		int n=arr.length;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			if(sum<0)
			{
				sum+=n;
			}
			sum=sum%arr.length;
			frq[sum]=frq[sum]+1;//count of the remainder of that sum
		}
		long count=0;
		for(int i=0;i<frq.length;i++)
		{
			if(frq[i]>=2) {
			count+=((frq[i])*(frq[i]-1))/2; //choosing 2 elements form the count same as the permutation
			}
		}
			
		return count;

	}

}
