import java.util.*;

public class q4{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = s.nextInt();
		
		int k = s.nextInt();
		
		System.out.println(Arrays.toString(reservoir_sample(arr, n, k)));
		
		s.close();
	}
	
	static int[] reservoir_sample(int[] arr, int n, int k) {
		
		int[] reservoir_arr = new int[k];
		HashSet<Integer> reservoir_set = new HashSet<>();
		int f = 0;
		Random r = new Random();
		
		while(f != k)
			for(int i =  0; i < n && f != k; i++)
				if(r.nextInt(i + 1) == 0 && reservoir_set.add(i))
					reservoir_arr[f++] = arr[i];

		return reservoir_arr;
	}
}