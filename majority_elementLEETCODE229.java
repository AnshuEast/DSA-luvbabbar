package selfstudy;
import java.util.*;
public class majority_elementLEETCODE229 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		List<Integer> list = new ArrayList<>();
		majority(arr,list);
		System.out.println(list);
	}
	public static void majority(int arr[],List<Integer> list)
	{
		int count[]=new int[1000];
		for(int i=0;i<arr.length;i++)
		{
			if(count[i]>=0)
			{
				count[arr[i]]++;
			}
		}
		for (int i = 0; i < count.length; i++) {
			if(count[i]>(arr.length/3))
			{
				list.add(i);
			}
		}
	}
}
