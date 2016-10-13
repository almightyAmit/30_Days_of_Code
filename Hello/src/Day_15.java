import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

public class Day_15 {
	
    public static  Node insert(Node head,int data) {
        
        Node temp;
        Node newNode = new Node(data);
        
        temp = head;
        if(temp == null){
            head = newNode;
        }
        else{
            while(temp.next != null){
            temp = temp.next;
            }  
        
            temp.next = newNode;
        }
        return head;
    }

public static void display(Node head) {
    Node start = head;
    while(start != null) {
        System.out.print(start.data + " ");
        start = start.next;
    }
}

public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Node head = null;
    int N = sc.nextInt();

    while(N-- > 0) {
        int ele = sc.nextInt();
        head = insert(head,ele);
    }
    display(head);
    sc.close();
}
}
