package Pattern;
import java.util.*;

public class patternladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        int val=1;
        while(i<=n)
        {
        	int j = 1;
        	while(j<=i)
        	{
        		System.out.print(val+"\t");
        		j++;
        		val++;
        	}
        	i++;
        	System.out.println();
        }
	}

}
