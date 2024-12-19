//Fibonacci Series (using iterative method)
public static void main(String[]args){
 	int f=0,s=1,i=1;
	int count=7;
	 while(i<count){
		 System.out.println(f);
		 System.out.println(s);
		 f=f+s;
		 s=f+s;
		 i=i+2;
     if(i==count){
	     System.out.println(f);
	 }}}}
