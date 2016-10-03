import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Loop{
    
    public static void Multiply(int number){
        if(number >= 2 && number <= 20){
            for(int i = 1;i < 11; i++){
                System.out.println(number + " x " + i + " = " + i*number);
            }
        }
        else return;
    }
        

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Multiply(n);
        in.close();
    }
}
