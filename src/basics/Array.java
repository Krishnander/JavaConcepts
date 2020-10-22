package basics;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		Integer arr[] = new Integer[k];
		System.out.println("Enter array elements");
		for (int i = 0; i < k; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		  List<Integer> l1 = Arrays.asList(arr);
		  System.out.println("Array elements are: "+ l1);
		  System.out.println("lambda");
		  l1.forEach(l->System.out.println(l));
		  System.out.println("---------------------");
		  
		  Object[] obj = l1.toArray();
		  
		  for(Object o:obj) {
			  System.out.println(o);
		  }
		 
		/*
		 * for(int i:arr) { System.out.println(i); }
		 */
		  
		  
		sc.close();

	}

}
