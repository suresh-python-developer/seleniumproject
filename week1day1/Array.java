package week1day1;

import java.util.Arrays;

public class Array {
 
public static void main(String[] args) {
	int [] myarray= {1,2,4,9,8};
	
	Arrays.sort(myarray);
	
for (int i=0; i<myarray.length;i++) {
	if( i+1!=myarray[i]) {
		System.out.println(i+1);
	    
	}
	
	
}  
}
}
