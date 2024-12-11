//Reverse a String (using StringBuilder & Buffer) 

import java.util.*;
class Nandhu{                     
public static void main(String[] args){
    String input = "ABCD";
//StringBuilder 
    StringBuilder i1 = new StringBuilder(input);
	System.out.println(i1.reverse());
//StringBuffer	
	StringBuffer  i2 = new StringBuffer(input);
	System.out.println(i2.reverse());
//Append	
	StringBuilder i3 = new StringBuilder();
	i3.append(input);
	System.out.println(i3.reverse());
  }
}
