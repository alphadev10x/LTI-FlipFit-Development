/**
 * 
 */
package com.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 */
public class DemoStream {
	static List<Integer> inList=Arrays.asList(1,2,4,5,6,8,9,77,88,99,100);


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		beforeJava11();
		fromJava11();
		

	}
	// old Approcah to get write the code 
	
		 // private methods 
		
		private static void beforeJava11() {
		
		List <Integer> evenList=new ArrayList<Integer>();
		
		// logic here to iterate the even number list
		
		  for(int i : inList) {
			  
		    if(i%2==0) {	  
		    	
		    	evenList.add(i);
		  }
		    System.out.println("print the even number list-->" +evenList);
			
		}

		 //  same impl with stream with lambda expression 
		}  
		
		private static void fromJava11() {
			  
			  
			 System.out.println(
					 "Even Number List :-->" +inList.stream().filter(i -> i%2 == 0).collect(Collectors.toList()));
			 	
				
			  }

}
