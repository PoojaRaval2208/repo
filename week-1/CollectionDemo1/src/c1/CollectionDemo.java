package c1;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.Scanner;

public class CollectionDemo {

	public static void main(String[] args) {
		
		int n,pos,x;
		int x1, flag = 0,loc = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of elements:");
		n = sc.nextInt();
        int[] vars = new int[n+5];
        System.out.println("enter vars:");
        for(int i = 0;i < n; i++) {
        	 vars[i]= sc.nextInt();
        }
        
        System.out.println("Enter the position:");
        pos = sc.nextInt();
        System.out.println("Enter the new element:");
        x = sc.nextInt();
        for(int i=(n-1);i >= (pos-1);i--) {
        	vars[i+1] = vars[i];
        }
        vars[pos-1] = x;
        System.out.print("After inserting: \n");
        for(int i = 0; i<n; i++) {
        	System.out.println(vars[i]+" ");
        }
        System.out.println(vars[n]);
        System.out.println("Enter the element to delete:");
        x1 = sc.nextInt();
        for (int i = 0 ; i<n;i++) {
        	if(vars[i]==x1) {
        		flag = 1;
        		loc = i;
        		break;
        	}
        	else {
        		flag = 0;
        	}
        }
        if (flag == 1) {
        	for(int i = loc+1; i<n;i++)
        	{
        		vars[i-1] = vars[i];
        	}
        	System.out.println("After Deleting:");
        	for(int i = 0;i< n-2; i++) {
        		System.out.println(vars[i]+" ");
        	}
        	System.out.println(vars[n-2]);
        }
        else {
        	System.out.println("Element not found");
        }
        sc.close();
         
		
		
		      // Arraylist collection
		      List a1 = new ArrayList();
		      
		      for (int i = 0; i < 10; i++) 
		            a1.add(i); 
		  
		      Iterator iterator = a1.iterator();
		      
		        
		        while (iterator.hasNext()) {
		        	int i = (Integer)iterator.next(); 
		        	System.out.println("value= " + i);
		        }
		        System.out.println(a1);
		        
		        //linked list collection
		        List l1 = new LinkedList();
		        for (int i = 0; i < 100; i++) 
		            l1.add(i); 
		  
		        //System.out.println(a1);
		      Iterator iterator1 = l1.iterator();
		      
		        while (iterator.hasNext()){
		        	int i = (Integer)iterator.next(); 
		        	System.out.println("value= " + i);
		        }
		        System.out.println(l1);
		        
		        //Hash set
		        Set s1 = new HashSet();
		        for (int i = 0; i < 1000; i++) 
		            s1.add(i); 
		        Iterator itr1 = l1.iterator();
			      
		        while (iterator.hasNext()){
		        	int i = (Integer)iterator.next(); 
		        	System.out.println("value= " + i);
		        }
		        System.out.println(s1);
		        
		        //Map set
		        Map m1 = new HashMap(); 
		        for (int i = 0; i < 10; i++) 
		        	m1.put("a",1);
		        	m1.put("b",2);
		        	m1.put("c",3);
		        	m1.put("d",4);
		        	m1.put("e",5);
		        	m1.put("f",6);
		        	m1.put("g",7);
		        	m1.put("h",8);
		  
		      Iterator itr2 = m1.keySet().iterator();
		      
		        
		        while (iterator.hasNext()) {
		        	int i = (Integer)iterator.next(); 
		        	System.out.println("Name"+i+"Num="+m1.get(i));
		        }
		        System.out.println(m1);
		        
		        Instant start = Instant.now();
		        try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        Instant end = Instant.now();
		        System.out.println(Duration.between(start,end));

	}

}
