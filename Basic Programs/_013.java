//Sort_an_array_in_Descending
public class Nandhu{   
	public static void main(String[]args){
      int[]arr=new int[] {5,6,2,1};
      int tempry=0;
     
      for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
    	  
        	if(arr[i]<arr[j]){
        	   tempry=arr[i];
        	   arr[i]=arr[j];
        	   arr[j]=tempry;
            }}}
      for(int i=0;i<arr.length;i++){
    	   System.out.println(arr[i]);
      }}}
