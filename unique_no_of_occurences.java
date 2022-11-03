package selfstudy;

import java.util.*;

public class unique_no_of_occurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(unique(arr));
	}

	public static boolean unique(int arr[])
	{
		boolean visited[]=new boolean[256];
		int count[]=new int[256];
		for(int i=0;i<arr.length;i++)
		{
			if(count[arr[i]]>=0)
			{
				count[arr[i]]++;
			}
			if(!visited[arr[i]])
			{
				visited[arr[i]]=true;
			}
		}
		if(check(count,visited))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean check(int count[],boolean visited[]) {
		for(int i=0;i<count.length-1;i++)
		{
			for(int j=i+1;j<count.length-1;j++)
			{
				if(visited[i]==true)
				{
					if(count[i]==count[j])
					{
						return false;
					}
				}
			}
		}
		return true;
	}
}
