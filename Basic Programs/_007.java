//To check if the given number is Prime or Not Prime
public class Nandhu{
     public static void main(String[]args){
      int no=71,i=2;
      boolean prime=true;

      while(i<no){
    	  if(no%i==0){
    		  System.out.println("Not Prime");
    		  prime=false;  
    	  }i++;break;
      }
          if(prime==true){
        	  System.out.println("Prime");
    }}}
