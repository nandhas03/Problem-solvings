//To_check_1st_letter_is_Repeated_Char
public class Nandhu{
    public static void main(String[]args){

	  String word="window";
	  boolean repeat=false;
	  char ch=word.charAt(0);
	  
		 for(int i=1;i<word.length();i++){

		    if(ch==word.charAt(i)) {
		      System.out.println(ch+" Repeated");
		    repeat=true;break;		
			}}
		    if(repeat==false) {
	        System.out.println(ch+" Not Repeated");	 
    }}}
