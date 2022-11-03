package selfstudy;
import java.util.*;

public class maxno_of_occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		String s = sc.nextLine();
		String ans = sort(s);
		int count = countocc(ans);
		if(count>1) {
			System.out.println(count);
		}
		else
		{
			System.out.println("0");
		}
	}
	
	
	public static String sort(String s)
	{
		char arr[]=s.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
	public static int  countocc(String s) {
		
		int i=0;
		int j=0;
		int counter = 0;
		int count = Integer.MIN_VALUE ;
		while(j<=s.length()-1)
		{
			if(s.charAt(j)!=s.charAt(i))
			{
				i=j;
				counter=0;
			}
			if(s.charAt(j)==s.charAt(i))
			{
				counter++;
			}
			j++;
			
			count= Math.max(counter, count);
		}
		return count;
	}
}
