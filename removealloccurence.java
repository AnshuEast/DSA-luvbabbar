package selfstudy;

import java.util.Scanner;

public class removealloccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner  sc = new Scanner(System.in);
			int nth = sc.nextInt();
			int c = 0;
			int i=2;
			while(c!=nth)
			{	
				
				if(check(i)) {
					c++;	
				}
				if(c==nth)
				{
					System.out.println(i);
					break;
				}
				i++;	
			}
	}
	public static boolean check(int i)
	{
		int div=2;
		while(div*div<=i)
		{
			if(i%div==0)
			{
				return false;
			}
			div++;
		}
		return true;
	}

}
