//To Check 1st Non-Repeated char
public class Nandhu{
    public static void main(String[]args){
	  String word="window";

	  for(int i=0;i<word.length();i++){ 
			 char ch=word.charAt(i);
	         boolean repeat=false;
	  
	  for(int j=i+1;j<word.length();j++){
		if(ch==word.charAt(j)){
		   repeat=true;
		   break;		
		}}
		if(repeat==false){
	       System.out.println("1st-non-rptd"+ch);	 
	       break;
       }}}}
