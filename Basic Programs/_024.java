//Reverse the Number
public class Nandhu{
    public static void main(String[]args){
    int ip =123;
  	int rev=0;
  	   while(ip>0){
  		   int rem=ip%10;
  		   rev= rev*10+rem;
  		   ip=ip/10;
  		  }
      System.out.println(rev);
    }}
