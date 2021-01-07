import java.util.*;
public class RemoveDuplicate {

	public static void main(String[] args) {
		 String s1 = "pooja";
	        System.out.println(removeDuplicateChars(s1));
	        String s2 = "hello";
	        System.out.println(removeDuplicateChars(s2));
	    }
	 
	    private static String removeDuplicateChars(String sourceStr) {
	        
	        char[] chrArray = sourceStr.toCharArray();
	        String targetStr = "";
	 
	        
	        for (char value : chrArray) {
	            
	            if (targetStr.indexOf(value) == -1) {
	                targetStr += value; 
	            }
	        }
	        return targetStr;
	}

}
