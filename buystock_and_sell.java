package selfstudy;
import java.util.*;
public class buystock_and_sell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("\n"+stock(arr));
	}
	public static int stock(int []prices) {
		int maxpro=0;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<prices.length;i++)
		{
			min = Math.min(min, prices[i]);
			maxpro = Math.max(maxpro, prices[i]-min);
		}
		return maxpro;
	}

}
