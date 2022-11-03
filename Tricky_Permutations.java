package RECURSION;

import java.util.*;

public class Tricky_Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		List<String> list = new ArrayList<>();
		permutate(s,"",list);
		Collections.sort(list);
		for(String val:list)
		{
			System.out.println(val);
		}
	}
	public static void permutate(String s,String ans,List<String> list)
	{
		if(s.length()==0)
		{
			list.add(ans);
			return;
		}
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			boolean flag=true;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(j)==ch)
				{
					flag = false;
					break;
				}
			}
			if(flag==true)
			{
				String ros = s.substring(0,i)+s.substring(i+1);
				char c = s.charAt(i);
				permutate(ros, ans+c,list);
			}
		}
	}
}
