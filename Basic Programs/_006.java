//Vowels count & Present or Not
public class Nandhu{
     public static void main(String[]args){
		 String word = "education";
		 int count=0;
		 for(int i=0;i<word.length();i++) {
			 char ch = word.charAt(i);
			 switch(ch) {
			 case'a':
			 case'e':
			 case'i':
			 case'o':
			 case'u':
				count++;
			 }}
		 System.out.print(count);
		 if(count==0)System.out.println(" No Vowels");
		   else System.out.println(" Vowels Present");
		 }}
