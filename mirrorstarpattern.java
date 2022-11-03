package Pattern;
import java.util.*;

public class mirrorstarpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sp=n/2;
		int nst=1;
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=sp)
			{
				System.out.print("  ");
				j++;
			}
			j=1;
			while(j<=nst)
			{
				System.out.print("*"+" ");
				j++;
			}
			if(i<(n/2)+1)
			{
				sp--;
				nst+=2;
			}
			else
			{
				sp++;
				nst-=2;
			}
			i++;
			System.out.println();
		}

	}

}
