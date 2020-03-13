import java.util.HashSet;
import java.util.Scanner;

public class q3 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] input_arr = new int[n];
		
		for(int i = 0; i < n; i++)
			input_arr[i] = s.nextInt();
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i = 0; i < n; i++)
			if(!set.add(input_arr[i]))
				System.out.println(input_arr[i]);
		
		s.close();
	}
}