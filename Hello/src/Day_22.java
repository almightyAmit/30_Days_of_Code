import java.util.*;
import java.io.*;

class Nodedefault{
	Nodedefault left,right;
    int data;
    Nodedefault(int data){
        this.data=data;
        left=right=null;
    }
}
class Day_22{   
    	
	public static int getHeight(Nodedefault root){
        if(root == null)
            return -1;
      return (1 + Math.max(getHeight(root.left), getHeight(root.right)));
    }

	public static Nodedefault insert(Nodedefault root,int data){
        if(root==null){
            return new Nodedefault(data);
        }
        else{
        	Nodedefault cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Nodedefault root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            int height=getHeight(root);
            System.out.println(height);
        }	
}