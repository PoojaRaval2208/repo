package c1;
import java.util.*;

public class ListModify {
	static class Node
	{
	    int data;
	    Node next;
	};
	 
	
	static Node push(Node head_ref, int new_data)
	{
	    
	    Node new_node =new Node();
	    
	    new_node.data = new_data;
	         
	   
	    new_node.next = head_ref; 
	         
	    
	    head_ref = new_node;
	     
	    return head_ref;
	} 
	 
	static Node front,back;
	 
	
	static void frontAndBackSplit( Node head)
	{
	    Node slow, fast;
	     
	    slow = head;
	    fast = head.next;
	     
	    
	    while (fast != null)
	    {
	        fast = fast.next;
	        if (fast != null)
	        {
	            slow = slow.next;
	            fast = fast.next;
	        }
	    }
	     
	    
	    front = head;
	    back = slow.next;
	    slow.next = null;
	}
	 
	
	static Node reverseList( Node head_ref)
	{
	    Node current, prev, next;
	    current = head_ref;
	    prev = null;
	    while (current != null)
	    {
	        next = current.next;
	        current.next = prev;
	        prev = current;
	        current = next;
	    } 
	    head_ref = prev;
	    return head_ref;
	}
	 
	
	static void modifyTheContentsOf1stHalf()
	{
	    Node front1 = front, back1 = back;
	    
	    while (back1 != null)
	    {
	        
	        front1.data = front1.data - back1.data;
	         
	        front1 = front1.next;
	        back1 = back1.next;
	    }
	}
	 
	
	static Node concatFrontAndBackList(Node front,
	                                   Node back)
	{
	    Node head = front;
	     
	    if(front == null)return back;
	     
	    while (front.next != null)
	        front = front.next; 
	         
	    front.next = back;
	     
	    return head;
	}
	 
	
	static Node modifyTheList( Node head)
	{
	   
	    if (head == null || head.next == null)
	        return head;
	    front = null; back = null;
	     
	    
	    frontAndBackSplit(head);
	         
	    
	    back = reverseList(back);
	     
	    
	    modifyTheContentsOf1stHalf();
	     
	   
	    back = reverseList(back);
	     
	    
	    head = concatFrontAndBackList(front, back);
	 
	    
	    return head;
	}
	 
	
	static void printList( Node head)
	{
	    if (head == null)
	        return;
	     
	    while (head.next != null)
	    {
	        System.out.print(head.data + " -> ");
	        head = head.next;
	    }
	    System.out.println(head.data );
	}
	 
	
	public static void main(String args[])
	{
	    Node head = null;
	     
	    
	    head = push(head, 10);
	    head = push(head, 7);
	    head = push(head, 12);
	    head = push(head, 8);
	    head = push(head, 9);
	    head = push(head, 2);
	     
	    
	    head = modifyTheList(head);
	     
	   
	    System.out.println( "Modified List:" );
	    printList(head);
	}
	}
