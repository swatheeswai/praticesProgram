class ThreadMethod extends Thread{
   public static void main(String args[]){
    
    Thread t = Thread.currentThread();
          System.out.println(t);
          System.out.println("Thread Name:"+t.getName());
          System.out.println("Thread Priority:"+t.getPriority());
          System.out.println("Thread Group:"+t.getThreadGroup());
          t.setName("java");
          t.setPriority(1);
          System.out.println("==========Thread modify==================");
          System.out.println("Thread Name:"+t.getName());
          System.out.println("Thread Priority:"+t.getPriority());
          System.out.println("THread Group:"+t.getThreadGroup());
          
          }
          }
