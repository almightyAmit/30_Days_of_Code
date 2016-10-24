import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day_26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fine = 1;
        int da = sc.nextInt();
        int ma = sc.nextInt();
        int ya = sc.nextInt();
        int de = sc.nextInt();
        int me = sc.nextInt();
        int ye = sc.nextInt();
        
        if(ya <= ye){
            if(ma <= me){
                if(da <= de){
                    fine = 0;
                }
                else{
                    fine = 15 * (da - de);
                }
            }
            else{
                fine = 500 * (ma - me);
            }
        }
        else{
            fine = 10000;
        }
        System.out.println(fine);
        
    }
}