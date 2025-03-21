import java.util.Scanner;
class Demo1 implements Runnable{
 @Override
 public void run(){
  System.out.println("Printing character started..");
          
           for(int i =65;i<=69;i++){
                System.out.println((char)i);
                   try{
                      Thread.sleep(1000);
                }
                catch(Exception e){
                    e.printStackTrace();
                    }
            }
            System.out.println("Printing Number End");
      }
 }
class Demo2 implements Runnable{
 @Override
 public void run(){
  
       System.out.println("Printing Number started..");
               for(int i =1;i<=10;i++){
                System.out.println(i);
                   try{
                      Thread.sleep(1000);
                }
                catch(Exception e){
                    e.printStackTrace();
                    }
            }
       System.out.println("Printing Number End");
    }
 }   
class Demo3 implements Runnable{
Thread obj = Thread.currentThread();
 Scanner scan =new Scanner(System.in);
 @Override
 public void run(){
 
           try{
           
           System.out.println("Enter the number");
           int a = scan.nextInt();
          
            System.out.println("Enter the number");
           int b = scan.nextInt();
           
           int c = a/b;
           
           System.out.println(c);
           }
           catch(Exception e){
               System.out.println(e.getMessage());
               }
               finally{
                System.out.println(obj);
                }
    }
   
 }
                 
 
public class multithreading2{
   public static void main(String args[]){
   //Thread obj = Thread.currentThread();
       Demo1 d1 = new Demo1();
        Demo2 d2 = new Demo2();
         Demo3 d3 = new Demo3();
       
       Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
         Thread t3 = new Thread(d3);
       
             t1.start();
             t2.start();
             t3.start();
       
         // System.out.println(d2.obj);
         // System.out.println(d3.obj);
             }
             }
            
      

                       
