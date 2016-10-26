import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Name 	: Amit Saroj
 * Topic	: 30 days 
 * SubTopic : Regular Expression
 */

public class Day_28 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> nameList  = new ArrayList<String>();
        int N = in.nextInt();
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            
            String[] email = emailID.split("@");
            if(email[1].equals("gmail.com")){
                nameList.add(firstName);
            }
        }
        in.close();
        Collections.sort(nameList);

        for(String name : nameList){
            System.out.println(name);
        }
            
        }
    }