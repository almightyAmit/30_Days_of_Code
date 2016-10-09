import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*Test case#1
0 -4 -6 0 -7 -6
-1 -2 -6 -8 -3 -1
-8 -4 -2 -8 -8 -6
-3 -1 -2 -5 -7 -4
-3 -5 -3 -6 -6 -6
-3 -6 0 -8 -6 -7
output = -19

Test case#2
7 6 8 2 4 3
7 3 3 0 6 1
3 8 7 7 2 2
0 8 6 8 6 1
7 1 6 0 2 4
2 7 8 1 7 4
output = 44

Test case#3
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
output = 19*/


/**
 * Name 	: Amit Saroj
 * Topic	: 30 days 
 * SubTopic : 2D array
 */
public class Day_11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];			
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();			//2D array assignment
            }
        }
        
      /*  Since hourglass A have:
        	3 row as (0,1,2)
        	3 col as (0,1,2)
        	
        	Hourglass representation:
        	a b c
        	  d
        	e f g
        therefore maxcol = 2;
        maxrow = 2;*/
        	
        int minrow = 0;	
        int mincol = 0;
        int maxcol = 2;
        int maxrow = 2;
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        

        /* 1) Initially maxrow is 2 then it will incremented with 1 till maxrow = 5(max no. of row).
         *  2) This is  for checking the boundry of 2d array.*/
        while(maxrow < 6){			
        	/* 1) Initially maxcol is 2 then it will incremented with 1 till maxcol = 5(max no. of col).
            *  2) This is  for checking the boundry of 2d array.*/
            while(maxcol < 6){
            	
            	/*sum of all element of 2d array of size hourglass is calculated in this loop*/
                for(int i=minrow; i<=maxrow; i++){
                    for(int j=mincol; j<=maxcol; j++)
                    {
                    	//skipping the 4th and 6th element from the array to fit the dimension of hourglass.
                        if((i==minrow+1 && j==mincol) || (i==minrow+1 && j==mincol+2))
                            continue;
                        else
                            sum += arr[i][j];
                    }
                }
                //After each hourglass sum is calcuated, it is compared with maxsum, to get the max of all.
                maxsum = Math.max(maxsum, sum);
                mincol++;		//mincol and maxcol is increamented so that, we can find the 4 concecutive  
                maxcol++;		// maxsum in a row.
                sum = 0;
                }
            //After completing the row we reset the mincol and maxcol
            mincol = 0;
            maxcol = 2;
            //head toward new row.
            minrow++;
            maxrow++;
        }
        System.out.println(maxsum);
        
    }
        
}
