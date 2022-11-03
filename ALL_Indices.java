package RECURSION;
import java.util.Scanner;
public class ALL_Indices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int arr[] = new int[m];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int item=sc.nextInt();
		int ans[]=find(arr,0,item,0);
		for(int val:ans)
		{
			System.out.print(val+" ");
		}
	}
	public static int [] find(int arr[],int i,int item,int k) {
		if(i==arr.length)
		{
			return new int[k];
		}
		if(arr[i]==item)
		{
			int ans[]=find(arr, i+1, item, k+1);
			ans[k]=i;
			return ans;
		}
		else
		{
			int ans[]=find(arr, i+1, item, k);
			return ans;
		}
		
	}
}
