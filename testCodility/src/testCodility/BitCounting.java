package testCodility;

public class BitCounting {
	public static void main(String[] args) {
		int n = 1234; 
		int position = 0, count = 0;
        String binaryString = Integer.toBinaryString(n);//indentation is wrong
        
        while (position != -1) { //indentation is wrong
        	count++;     // is there is no 1 in the number n, you will return 1, which looks like it's not the expetec result      
                                           
        	position = binaryString.indexOf(1, position + 1);
        }//indentation is wrong
        
        
	}
}
