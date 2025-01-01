//Reverse each word's in String
public class Nandhu{
    public static void main(String[]args){
    	String ip ="Nandha Kumar";
	    String op=" ";
        String[]words=ip.split(" ");
  
    for(String word:words) {
    	String rev="";
    for(int i=word.length()-1;i>=0;i--){
    	rev=rev+word.charAt(i);
       }
    op=op+rev+" ";
   }
    System.out.println(op);
  }}
