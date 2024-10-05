package advance_selenium;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.apache.logging.log4j.message.StringFormatterMessageFactory;

public class Setmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "suresh thangavel";
		char[] name_ch = name.toCharArray();
		
		Set<Character> new_name = new LinkedHashSet<Character>();

		
		for (Character character : name_ch) {
			new_name.add(character);
		}
        String final_name =" ";
        
        for (Character character : new_name) {
          if (character == ' ') {
        	  continue;
          }
          else{	
          final_name+=character;
        	
			}
        }
	     	
        StringBuilder reversed_string = new StringBuilder(final_name).reverse();
        System.out.println(reversed_string);
	}

}
