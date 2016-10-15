import java.util.*;
import java.io.*;
/**
 * Name 	: Amit Saroj
 * Topic	: 30 days 
 * SubTopic : Exception
 */


class Calculator{
int power(int n, int p)throws Exception{
    int output = 1;
    if (n<0 || p<0){
        throw new Exception("n and p should be non-negative");
    }
    else{
        while(p>0){
            output *= n;
            p--;
        }
    }
        return output;
    }
}

class Day_17{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}
