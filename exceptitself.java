package Hackerblocksquestions;

import java.util.Scanner;

public class exceptitself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] result=new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		result=except(arr);
		for(int i=0;i<n;i++)
		{
			System.out.print(result[i]+" ");
		}
	}
	public static int[] except(int arr[])
	{
		int lpdt=1;
		int rpdt[]=new int[arr.length];
		int totpdt=1;
		for(int i=0;i<arr.length;i++)
		{
			totpdt*=arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			int temp=lpdt;
			rpdt[i]=totpdt/(arr[i]*temp);
			lpdt=arr[i];
			arr[i]=rpdt[i]*temp;
		}
		return arr;
	}
}
