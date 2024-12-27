//Reverse_an_Array
public class Nandhu{   
	public static void main(String[]args){
        int[] arr={1,2,3,4,5};
        int i=0,j=arr.length-1,temp;
        while(i<j){
        	tempry=arr[i];
        	arr[i]=arr[j];
        	arr[j]=temp;
        	i++;
        	j--;
        }
        for(int k=0;k<arr.length;k++) {
        	  System.out.print(arr[k]);
        }}}
