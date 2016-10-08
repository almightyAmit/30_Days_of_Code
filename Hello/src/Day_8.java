//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;
/**
 * Name 	: Amit Saroj
 * Topic	: 30 days 
 * SubTopic : Dictionary
 */
class Day8{
    public static void main(String []argh){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        
        Map<String,Integer> phoneMap = new HashMap<String,Integer>(); 
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneMap.put(name, phone);    
        }
        while(in.hasNext()){
            String s = in.next();
            if (phoneMap.containsKey(s) == true){
                System.out.println(s+"="+phoneMap.get(s));
            }
            else
                System.out.println("Not found");
        }
        in.close();
    }
}