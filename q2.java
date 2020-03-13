import java.util.*;

public class q2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int[] checker_arr = new int[26];
		String string1 = new String(s.nextLine());
		String string2 = new String(s.nextLine());
		
		if(string1.length() != string2.length()) {
			System.out.println("Not an anagram");
			System.exit(0);
		}
		
		for(int i = 0; i < string1.length(); i++) {
			checker_arr[string1.charAt(i) - 'a']++;
			checker_arr[string2.charAt(i) - 'a']--;
		}
		
		if("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]".equals(Arrays.toString(checker_arr)))
			System.out.println("Anagram");
		else
			System.out.println("Not an anagram");
		
		s.close();
	}
}