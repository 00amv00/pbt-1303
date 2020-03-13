import java.util.*;

public class q1 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] input_arr = new int[n];
		
		for(int i = 0; i < n; i++)
			input_arr[i] = s.nextInt();
		System.out.println(Arrays.toString(input_arr));
		
		int left_pointer = 0;
		int right_pointer = n - 1;
		
		while(left_pointer < right_pointer) {
			int temp  = input_arr[left_pointer];
			input_arr[left_pointer++] = input_arr[right_pointer];
			input_arr[right_pointer--] = temp;
		}
		System.out.println(Arrays.toString(input_arr));
		
		s.close();
	}
}