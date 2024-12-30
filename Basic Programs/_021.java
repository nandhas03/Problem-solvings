//Count of any char in a string
public class Nandhu{
    public static void main(String[]args){
	String word ="nandhu";
    char x='a';
    int count=0;
     
    for(int i=0;i<word.length();i++){
       if(x==word.charAt(i)){
    	  count++;
       }}
    System.out.println("x-count is "+count);	
    }}
