//Sum_of_digit's
public class Nandhu{   
	public static void main(String[]args){
	  int no = 1234;
	  int sum=0;
	  int rem;
	while(no>0) {
	      rem=no%10;  
		  sum=sum+rem;
		  no=no/10;
	   }
    System.out.println(sum);
    }}
