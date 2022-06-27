package testCodility;

public class BitCounting {
	public static void main(String[] args) {
		int n = 1234;
		int position = 0, count = 0;
        String binaryString = Integer.toBinaryString(n);
        
        while (position != -1) { 
        	count++;          
                                           
        	position = binaryString.indexOf(1, position + 1);
        }
        
        
	}
}
