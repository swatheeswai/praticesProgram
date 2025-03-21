class Counter extends Thread {
   
    static int a = 0;

    
    public  void increment() {
        a++;  
    }

    @Override
    public void run() {
       
        increment();
    }
}

public class MultiThreading3 {
    public static void main(String[] args) {
        
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        Counter c5 = new Counter();

       
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();

        
       
        
        System.out.println("Final value of a: " + Counter.a);
    }
}

         
