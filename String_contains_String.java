package selfstudy;

import java.util.*;

public class String_contains_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		String s = sc.nextLine();
		String q = sc.nextLine();
		if(s.contains(q))
		{
			System.out.println("yes");
		}
		else
		{ 
			System.out.println("no");
		}

	}

}
