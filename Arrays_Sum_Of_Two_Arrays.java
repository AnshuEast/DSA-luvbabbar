package Hackerblocksquestions;
import java.util.*;

public class Arrays_Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[]=new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		int m = sc.nextInt();
		int arr2[]=new int[m];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=sc.nextInt();
		}
		sum(arr1,arr2);
	}
	public static void sum(int arr1[],int arr2[])
	{
		int sum=0;
		int carry=0;
		int k=arr1.length-1;
		int w = arr2.length-1;
		ArrayList<Integer>ans = new ArrayList<>();
		while(k>=0||w>=0)
		{
			sum=0;
			if(k>=0)
			{
				sum=sum+arr1[k];
				k--;
			}
			if(w>=0)
			{
				sum=sum+arr2[w];
				w--;
			}
			sum+=carry;
			ans.add(0, sum%10);
			carry=sum/10;
		}
		// last mai jo element rh jata us pe bhi toh carry jaa skta h yeah uske liye h
		if(carry>0)
		{
			ans.add(0,carry);
		}
		for (Integer val : ans) {
			System.out.print(val+","+" ");
		}
		System.out.print("END");
		
	}
}
