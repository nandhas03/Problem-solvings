//To print the below 20 prime number's
class Nandhu{                     
public static void main(String[] args){
	int no,c,prime;
     
     for(no=2;no<=20;no++){
   	        prime=0;
   	 for(c=2;c<no;c++) {
   		if(no%c==0) {
   		    prime++;break;    
   	}}	 
            if(prime==0){
  	        System.out.println(no);     
    }}}}
