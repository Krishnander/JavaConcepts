package concepts;

import java.util.*;
import java.util.logging.Logger; 

public class TestLinkedList { 
  
    public static void main(String[] args) 
    { 
        // Creating object of the 
        // class linked list 
        LinkedList<String> ll 
            = new LinkedList<>(); 
  
        // Adding elements to the linked list 
        ll.add("A"); 
        ll.add("B"); 
        ll.addLast("C"); 
        ll.addFirst("D"); 
        ll.add(2, "E"); 
        
  
        System.out.println(ll); 
  
        ll.remove("B"); 
        ll.remove(3); 
        ll.removeFirst(); 
        ll.removeLast(); 
        
        ll.offer("GK");
        ll.offerFirst("First");
        ll.offerLast("LastO");
        
        Logger logger=Logger.getAnonymousLogger();
        logger.info("Linked list is "+ll);
        
        logger.info(ll.peekFirst());
        logger.info(ll.peekLast());
        
        logger.info(ll.pollFirst());
        logger.info(ll.pollLast());
        
        System.out.println(ll);
        
    } 
} 
