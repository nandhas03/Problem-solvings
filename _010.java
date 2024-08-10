import java.io.*;
import java.util.*;

public class Solution {
     private static int B;// breadth of the parallelogram
     private static int H;// height of the parallelogram
     private static boolean flag;   
        static{
            Scanner scan = new Scanner(System.in);
            B=scan.nextInt();
            H=scan.nextInt();
            scan.close();
            
            if(B<=0 || H<=0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
                flag = false;
            }
            else{
                flag =true;
            }
        }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        if(flag){
            int area=B*H;
            System.out.println(area);//area of the parallelogram
        } 
    }
}
