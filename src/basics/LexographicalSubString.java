package basics;

import java.util.Arrays;
import java.util.Scanner;

public class LexographicalSubString {
	
	static void sortString(String str) { 
        char []arr = str.toCharArray(); 
        Arrays.sort(arr); 
        //System.out.print(String.valueOf(arr)); 
    } 

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        sortString(s);
        largest=s.substring(0, k);
        int n=s.length();
        smallest=s.substring(n-k);
        
        return smallest+"\n"+largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}


/*
 * import java.util.Scanner;
 * 
 * public class Solution {
 * 
 * public static String getSmallestAndLargest(String s, int k) { String smallest
 * = ""; String largest = "";
 * 
 * String[] list = new String[s.length() - k + 1]; for (int i = 0; i <=
 * s.length() - k; i++) { String str = s.substring(i, i+k); list[i] = str; }
 * 
 * smallest = list[0]; largest = list[0]; for (int i = 0; i <= s.length() - k;
 * i++) { String str = s.substring(i, i+k);
 * 
 * if (smallest == null || str.compareTo(smallest) < 0) { smallest = str; } if
 * (largest == null || str.compareTo(largest) > 0){ largest = str; } }
 * 
 * return smallest+"\n"+largest; }
 */


