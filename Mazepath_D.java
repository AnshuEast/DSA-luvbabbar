package RECURSION;

import java.util.Scanner;

public class Mazepath_D {
	static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nor=sc.nextInt();
		int noc = sc.nextInt();
		path(0,0,nor-1,noc-1,"");
		System.out.println("\n"+count);
	}
	public static void path(int r,int c,int er,int cl,String ans)
	{
		
		
		if(r==er&&c==cl)
		{
			count++;
			System.out.print(ans+" ");
			return ;
		}
		if(r>er||c>cl)
		{
			return;
		}
	      path(r+1, c, er, cl,ans+"V");
	      path(r, c+1, er, cl, ans+"H");
	      path(r+1, c+1, er, cl, ans+"D");
	}
}
