package RECURSION;
import java.util.*;

public class generate_paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> list = new ArrayList<>();
		generate(n,0,0,"",list);
		System.out.println(list);
	}
	public static void generate(int n , int op,int cl,String ans,List<String> list)
	{
		if(op==n&&cl==n)
		{
			list.add(ans);
			return;
		}
		if(cl<op)
		{
			generate(n, op, cl+1, ans+")",list);
		}
		if(op<n)
		{
			generate(n, op+1, cl, ans+"(",list);
		}
		
	}
}
