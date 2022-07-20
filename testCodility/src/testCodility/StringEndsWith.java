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
	    
	    int sizeStr = str.length()-1; //setting the size of the string -1 is misleading
	    int sizeEnding = ending.length();
	    String result = "";
	    
	    
	    if(str.length()>=ending.length()){ // spacing is not correct: if (str.length() >= ending.length()) {
	    for (int i = 0; i<sizeEnding; i++) { // spacing is not correct: i < sizeEnding
	      result += str.charAt(sizeStr);
	      sizeStr = sizeStr -1;
	    }
	    
	    StringBuilder strb = new StringBuilder(result);
	    result = strb.reverse().toString(); //if you just keep the end of the str, you can commpare directly with ending, without the need to reverse it
	    
	    if(ending.equals(result)) { // spacing is not correct: if (ending
	      return true;
	    }else { // } else {
	      return false;
	    }
	      //useless space that does not improve readability
	  }else {
	      return false;
	    }}// indentation is wrong
	      //useless space that does not improve readability
}
