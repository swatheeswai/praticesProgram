class student{
  student(){
  System.out.println("no args constructor");
}
}
class employee{
}
class customer{
}

class NewInstanceMethod {
   public static void main(String args[])throws Exception{
        Object obj = Class.forName(args[0]).newInstance();
        System.out.println("object created for:"+ obj.getClass().getName());
        }
        }
        
