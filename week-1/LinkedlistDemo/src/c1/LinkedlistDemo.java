package c1;
import java.util.*;

public class LinkedlistDemo {
	
	public static class Node{
		int data;
		Node next;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node n4 = new Node();
		n1.data = 1;
		n2.data = 2;
		n3.data = 3;
		n4.data = 4;
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;
		
		for(int i = 1; i <= 4; i++) {
			System.out.println(n1.data+"");
			n1 = n1.next;
		}

		
	}

}
