import java.io.*;
import java.util.*;

public class Day9 {
    
    public static int factorial(int n){
             int total = 1;
             if(n == 1){
                 return 1;
             }
             else
                 return n * factorial(n-1);
         }
    
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         System.out.println(factorial(n));
         in.close();
    }
}