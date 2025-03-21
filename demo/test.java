//singletonclass
class test{
 private static test t=null;
 private test(){
 }
 public static test getInstance(){
 if(t==null){
 t = new test();
 }
  return t;
  }
  public static void main(String args[]){
    test obj = test.getInstance();
     System.out.println(obj);
      
      test obj1 = test.getInstance();
    System.out.println(obj1);
     System.out.println("object and 1"+ (obj == obj1));
     System.out.println("------------------------------");
     
      test obj2 = test.getInstance();
     System.out.println(obj2);
      
      test obj3= test.getInstance();
     System.out.println(obj3);
       System.out.println("object 2 and 3"+ (obj2 == obj3));
       System.out.println("------------------------------");
     
      test obj4 = test.getInstance();
     System.out.println(obj4);
      
      test obj5 = test.getInstance();
     System.out.println(obj5);
       System.out.println("object 4 and 5"+ (obj4 == obj5));
    
    }
    }
      
