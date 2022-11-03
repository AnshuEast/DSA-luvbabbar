package RECURSION;
import java.util.Scanner;

public class boardpath_count_and_print {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int n=sc.nextInt();//size of the board
		int m=sc.nextInt();//face of the dice
		board(n,m,0,"");
		System.out.println("\n"+count);
	}
	public static void board(int n,int m,int curr,String ans)
	{
		if(curr==n)
		{
			count++;
			System.out.print(ans+" ");
		}
		if(curr>n)
		{
			return;
		}
		for(int i=1;i<=m;i++)
		{
			board(n, m, curr+i, ans+i);
		}
	}
}
