import java.io.*;
import java.util.*;
class Node12{
	int data;
	Node12 next;
	Node12(int d){
        data=d;
        next=null;
    }
	
}
class Day_24{
public static Node12 removeDuplicates(Node12 head){
	    Node12 currentNode=head;
	    while(currentNode!=null && currentNode.next != null){
	        Node12 other = currentNode;
	        while(other.next!=null){
	            if(other.next.data == currentNode.data)
	            {
	                //Node nextNode = other.next.next;
	                //Node temp = other.next;
	                other.next = other.next.next;
	                //temp = null;
	            }
	            else{
	                other = other.next;
	            }
	            
	        }
	        currentNode = currentNode.next;
	    }
	    return head;
    }
public static  Node12 insert(Node12 head,int data)
    {
        Node12 p=new Node12(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node12 start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node12 head)
        {
              Node12 start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node12 head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    }