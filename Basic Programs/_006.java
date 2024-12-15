//Count of each vowels
public class Nandhu1 {
     public static void main(String[]args){
		 String word = "education";
		 int cOfa=0, cOfe=0, cOfi=0, cOfo=0, cOfu=0;
		 for(int i=0;i<word.length();i++) {
			 char ch = word.charAt(i);
			 switch(ch){
			 case'a':cOfa++;break;
			 case'e':cOfe++;break;
			 case'i':cOfi++;break;
			 case'o':cOfo++;break;
			 case'u':cOfu++;break;
			 }}
		 System.out.println(cOfa+","+cOfe+","+
		           cOfi+","+cOfo+","+cOfu);
		 }}
