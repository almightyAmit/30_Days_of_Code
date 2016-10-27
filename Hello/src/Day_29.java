import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Name 	: Amit Saroj
 * Topic	: 30 days 
 * SubTopic : Bitwise And
 */

public class Day_29 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            
        int sol = 0;
        int max = 0;
        for(int i = 1; i<n; i++){
            for(int j = i+1; j<=n; j++){
                sol = i&j;
                if(sol<k)
                    max = Math.max(sol, max);
            }
        }
        System.out.println(max);
        }
        
    }
}