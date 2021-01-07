import java.util.ArrayList; 
import java.util.Deque; 
import java.util.LinkedList;
import java.util.*;
public class FreqCharsDemo2 {

	public static void main(String[] args) {
		String input;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		input = sc.nextLine();
		  
	        System.out.println("All possible palindrome" +  
	                            "partions for " + input  
	                            + " are :"); 
	  
	        allPalPartitions(input); 
	    } 
	  
	    // Function to print all possible 
	    // palindromic partitions of str. 
	    // It mainly creates vectors and 
	    // calls allPalPartUtil() 
	    private static void allPalPartitions(String input)  
	    { 
	        int n = input.length(); 
	  
	        // To Store all palindromic partitions 
	        ArrayList<ArrayList<String>> allPart = new ArrayList<>(); 
	  
	        // To store current palindromic partition 
	        Deque<String> currPart = new LinkedList<String>(); 
	  
	        // Call recursive function to generate  
	        // all partiions and store in allPart 
	        allPalPartitonsUtil(allPart, currPart, 0, n, input); 
	  
	        // Print all partitions generated by above call 
	        for (int i = 0; i < allPart.size(); i++)  
	        { 
	            for (int j = 0; j < allPart.get(i).size(); j++) 
	            { 
	                System.out.print(allPart.get(i).get(j) + " "); 
	            } 
	            System.out.println(); 
	        } 
	  
	    } 
	  
	   
	    private static void allPalPartitonsUtil(ArrayList<ArrayList<String>> allPart,  
	            Deque<String> currPart, int start, int n, String input) 
	    { 
	        // If 'start' has reached len 
	        if (start >= n)  
	        { 
	            allPart.add(new ArrayList<>(currPart)); 
	            return; 
	        } 
	  
	        // Pick all possible ending points for substrings 
	        for (int i = start; i < n; i++)  
	        { 
	              
	            // If substring str[start..i] is palindrome 
	            if (isPalindrome(input, start, i)) 
	            { 
	                  
	                // Add the substring to result 
	                currPart.addLast(input.substring(start, i + 1)); 
	  
	                // Recur for remaining remaining substring 
	                allPalPartitonsUtil(allPart, currPart, i + 1, n, input); 
	  
	                // Remove substring str[start..i] from current 
	                // partition 
	                currPart.removeLast(); 
	            } 
	        } 
	    } 
	  
	    // A utility function to check  
	    // if input is Palindrome 
	    private static boolean isPalindrome(String input,  
	                                    int start, int i) 
	    { 
	        while (start < i)  
	        { 
	            if (input.charAt(start++) != input.charAt(i--)) 
	                return false; 
	        } 
	        return true; 

	}

}