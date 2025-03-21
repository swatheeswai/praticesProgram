import java.util.Scanner;
class Demo1 extends Thread{
  static int a =10;
  Demo1(){
     a++;
     
}
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
class Demo2 extends Thread{
 
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
class Demo3 extends Thread{
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
                 
 
public class MultiThreading{
   public static void main(String args[]){
   //Thread obj = Thread.currentThread();
       Demo1 d1 = new Demo1();
        Demo2 d2 = new Demo2();
         Demo3 d3 = new Demo3();
          System.out.println("Static value"+Demo1.a);
             d1.start();
             d2.start();
             d3.start();
       
          //System.out.println(obj);
         // System.out.println(d2.obj);
         // System.out.println(d3.obj);
             }
             }
            
      

                       
