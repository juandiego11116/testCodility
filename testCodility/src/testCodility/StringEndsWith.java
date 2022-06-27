package testCodility;

public class StringEndsWith {
	/*
	 * DESCRIPTION:
		Complete the solution so that it returns true if the first argument(string) 
		passed in ends with the 2nd argument (also a string).
		
		Examples:

		solution('abc', 'bc') // returns true
		solution('abc', 'd') // returns false
	 * */
	
	public static boolean solution(String str, String ending) {
	    
	    int sizeStr = str.length()-1;
	    int sizeEnding = ending.length();
	    String result = "";
	    
	    
	    if(str.length()>=ending.length()){
	    for (int i = 0; i<sizeEnding; i++) {
	      result += str.charAt(sizeStr);
	      sizeStr = sizeStr -1;
	    }
	    
	    StringBuilder strb = new StringBuilder(result);
	    result = strb.reverse().toString();
	    
	    if(ending.equals(result)) {
	      return true;
	    }else {
	      return false;
	    }
	      
	  }else {
	      return false;
	    }}

}
