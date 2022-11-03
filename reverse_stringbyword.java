package selfstudy;

import java.util.*;

public class reverse_stringbyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		System.out.println(rotation(s, n));
	}

	public static int rotation(String s, int k) {

		String arr[] = s.split("\\s");
		String cpy = s.intern();
		int count = 0;
		// here it will perform the rotations
		for (int r = 1; r <= k; r++) {
			for (int j = 0; j < arr.length; j++) {
				arr[j] = arr[j].substring(1) + arr[j].charAt(0);
			}
		}

		String org_arr[] = cpy.split("\\s");
		// using this loop for rotating word
		for (int i = 0; i < arr.length; i++) {
			// using this loop for actual word
			for (int j = 0; j < org_arr.length; j++) {
				// comparing rotated words with actual words
				if (arr[i].equals(org_arr[j]))
					// increment the counter if found same word after rotation
					count++;
			}
		}
		return count;
	}
}
