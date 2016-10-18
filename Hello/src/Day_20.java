import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Name 	: Amit Saroj
 * Topic	: 30 days 
 * SubTopic : Sorting
 */
public class Day_20 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        //bubble sort
        int numSwaps = 0;
        for(int i=0; i<n; i++){
            
            for(int j=0; j<n-1; j++){
                if(a[j]>a[j+1])
                {a[j] = a[j]+a[j+1];
                 a[j+1] = a[j] - a[j+1];
                 a[j] = a[j] - a[j+1];
                 numSwaps++;
                }
            }
        }
        
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
            
        
    }
}