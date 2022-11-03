package Hackerblocksquestions;
import java.util.*;
public class alexshopping {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int items=sc.nextInt();
		int []price=new int[items];
		for(int i=0;i<price.length;i++)
		{
			price[i]=sc.nextInt();
		}
		int noq = sc.nextInt();
		for(int i=0;i<noq;i++)
		{
			check(price);
		}
	}
	public static void check(int price[])
	{
		int Q=sc.nextInt();
		int p=sc.nextInt();
		int count=0;
		for(int i=0;i<price.length;i++)
		{
			if(Q%price[i]==0)
			{
				count++;
			}
		}
		if(p>=count)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
