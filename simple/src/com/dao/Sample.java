/**
 * 
 */
package com.dao;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.security.Provider.Service;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author nag
 *
 */
public class Sample {
	public static void main(String[] args) {
		System.out.println("heloo");
	}

}





/**
 * @author nag
 *
 */
 class Sericeimpl {
	
	private boolean done;

	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	public void book()
	{
		synchronized(Sericeimpl.class)
		{
			
		}
	}
	private void syso() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		
	}
	
}

class Hotel {
    
    public static void book(short a) {
        System.out.print("short ");
    }
    
    public static void book(Short a) {
        System.out.print("SHORT ");
    }
    
    public static void book(long a) {
        System.out.print("LONG ");
    }
    
    public static void main(String[] args) {
        short shortRoom = 1;
        int intRoom = 2;
        book(shortRoom);
        book(intRoom);
    }
}


 class TryMe {
    
    public static void printB(String str) {
         System.out.print(Boolean.valueOf(str) ? "true" : "false"); 
    }
    
    public static void main(String args[]) {
        printB("tRuE");
        printB("false");
    }
}
 
 
 
 class Test {     
	    int a = 10;
	    
	    public void doStuff(int a) {
	        a += 1;
	        System.out.println(++a);
	    }
	    public static void main(String args[]) {
	        Test t = new Test();
	        t.doStuff(3);
	    }
	}
 
 
 
  class Cruiser {
	    private int a = 0;
	    
	    public void foo() {
	        Runnable r = new LittleCruiser();
	        new Thread(r).start();
	        new Thread(r).start();
	    }
	    
	    public static void main(String arg[]) {
	        Cruiser c = new Cruiser();
	        c.foo();
	    }
	    
	    
	    public class LittleCruiser implements Runnable {
	        public void run() {
	            int current = 0;
	            for (int i = 0; i < 4; i++) {
	                current = a;
	                System.out.print(current + ", ");
	                a = current + 2;
	            }
	        }
	    }
	}
  
  
   class TryMem {
	    public static void main(String args[]) {
	        List list = new LinkedList<String>();
	        list.add("one");
	        list.add("two");
	        list.add("three");
	        
	        Collections.reverse(list);
	        Iterator iter = list.iterator();
	       
	        Runtime.getRuntime().freeMemory();
	        
	        System.gc();
	     
	         Runtime.getRuntime().freeMemory();
	         Runtime.getRuntime().gc();
	              try {
	        System.out.println(10/0);          //some code goes here
	        	      }
	        	      catch (NullPointerException ne) {
	        	          System.out.print("1 ");
	        	      }
	        	      catch (RuntimeException re) {
	        	         System.out.print("2 ");
	        	         re.printStackTrace();
	        	       }
	        	      finally {
	        	          System.out.print("3");
	        	     }

	     
	       /* for (Object o : iter) {
	            System.out.print(o + " ");
	        }*/
	    }
	}
   
    class Cruiseri implements Runnable {
	    public static void main(String[] args) throws InterruptedException {
	        Thread a = new Thread(new Cruiseri());
	        a.start();
	        
	        System.out.print("Begin");
	        a.join();
	        System.out.print("End");
	        
	        int i = 10;
	             while (++i <= 10) {
	                  i++;
	             }
	             System.out.print(i);
	    }
	    
	    public void run() {
	        System.out.print("Run");
	    }
	}
    
    
    
    class Hotel1 {
        public int bookings;
        public void book() {
            bookings++;
        }
    }

     class SuperHotel1 extends Hotel1 {
        public void book() {
            bookings--;
        }
        
        public void book(int size) {
            book();
            super.book();
            bookings += size;
        }
     
        public static void main(String args[]) {
            SuperHotel1 hotel = new SuperHotel1();
            hotel.book(2);
            System.out.print(hotel.bookings);
        }
    }
