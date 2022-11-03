package RECURSION;
import java.util.*;

public class Recursion_Codes_of_the_string {
	static String arr[]= {"","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		List<String> list = new ArrayList<>();
		recursion_code(input, "",list);
		System.out.println(list);
	}
	public static void recursion_code(String s,String ans,List<String> list)
	{
		if(s.length()==0)
		{
			list.add(ans);
			return;
		}
		if(s.length()>=1)//one length ka character add hoga isme
		{
			recursion_code(s.substring(1), ans+arr[Integer.parseInt(s.substring(0,1))], list);
		}
		if(s.length()>=2&&Integer.parseInt(s.substring(0,2))<=26)//two length ka character add hoga isme
		{
			recursion_code(s.substring(2),ans+arr[Integer.parseInt(s.substring(0,2))], list);
		}
	}
}
