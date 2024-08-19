import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s=s.trim();//remove white space
        if(s.length()==0){
            System.out.println(0);//token will 0
            return;//return to prgrm
        }
        String[] words=s.split("[^a-zA-Z]+");
        System.out.println(words.length);//no.of Tokens
        for(String word:words){
            System.out.println(word);//Tokens
        }
        scan.close();
    }
}
