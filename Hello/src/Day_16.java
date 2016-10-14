import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Name 	: Amit Saroj
 * Topic	: 30 days 
 * SubTopic : Exception
 */

public class Day_16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            int stoInt = Integer.parseInt(S);
            System.out.println(stoInt);
        }
        catch(Exception e){
            System.out.println("Bad String");
        }
    }
}