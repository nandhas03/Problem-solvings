import java.util.*;
import java.security.*;
public class Solution {
 public static void main(String[] args) {

  DoNotTerminate.forbidExit();

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   //String s=???; Complete this line below

//__________________________________This is our code______________________________________________
    //Write your code here 
    //There are three Methods to convert int to string 
    //String s = n+"";                //1.concatastion
    //String s =Integer.toString(n);  //2.to string method
      String s = String.valueOf(n);   //3.value of method
//_________________________________________________________________________________________________
 if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
  } catch (DoNotTerminate.ExitTrappedException e) {
   System.out.println("Unsuccessful Termination!!");
  }
 }
}
//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {
 public static class ExitTrappedException extends SecurityException {
  private static final long serialVersionUID = 1;
 }
 public static void forbidExit() {
  final SecurityManager securityManager = new SecurityManager() {
   @Override
   public void checkPermission(Permission permission) {
    if (permission.getName().contains("exitVM")) {
     throw new ExitTrappedException();
    }
   }
  };
  System.setSecurityManager(securityManager);
 }
}   
