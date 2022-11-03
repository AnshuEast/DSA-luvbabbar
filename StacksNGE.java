package stacks;

import java.util.Stack;

public class StacksNGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 11, 2, 3, 23, 13, 14, 15 };
		NGE(arr);
	}

	public static void NGE(int arr[]) {
		Stack<Integer> st = new Stack<>();
		int nge[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				int ii = st.pop();
				nge[ii] = arr[i];
			}
			st.push(i);
		}
		while (!st.isEmpty()) {
			int ii = st.pop();
			nge[ii] = -1;
		}
		for (int i = 0; i < nge.length; i++) {
			System.out.println(arr[i]+" "+nge[i]);
		}
	}
}
