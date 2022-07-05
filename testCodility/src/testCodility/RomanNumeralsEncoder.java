package testCodility;

public class RomanNumeralsEncoder {
	
	public static void solution(int n) {
		n = 12;
		String temp = Integer.toString(n);
		int[] numbers = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
		    numbers[i] = temp.charAt(i) - '0';
		}
		
		System.out.println(numbers);
        
    }
}
