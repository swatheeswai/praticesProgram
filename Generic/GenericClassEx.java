class demo<T>{
     T value;
     public void set(T value){
         this.value = value;
         }
     public T get(){
         return value;
         }
         public static <? extends Number> void disp(? element){
            System.out.println(element);
     }
     }
 class GenericClassEx{
 public static void main(String args[]){
 
    demo<String> s = new demo<>();
    s.set("jkj");
    System.out.println(s.get());
    demo.disp(12.3);
    }
    }
