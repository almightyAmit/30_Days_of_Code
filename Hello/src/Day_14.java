import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	
  	 Difference(int[] inarray){
         this.elements = inarray;
     }

     public void computeDifference(){
         int maxnum = Integer.MIN_VALUE;
         int minnum = Integer.MAX_VALUE;
         int num;
         for(int i=0; i<elements.length; i++){
             num = elements[i];
             maxnum = Math.max(maxnum, num);
             minnum = Math.min(minnum, num);
         }
         maximumDifference = Math.abs(Math.abs(maxnum) - Math.abs(minnum));
     }
} // End of Difference class

public class Day_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
