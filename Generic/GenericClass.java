class GenericClass<T extends Number>{
     private T value;
     GenericClass(T value){
        this.value = value;
        }
      public void show(){
         System.out.println("The show method:"+value.getClass().getName());
         }
      public T getValue(){
           return value;
           }
      
  public static void main(String args[]){
      GenericClass<Integer> g = new GenericClass<Integer>(12);
      g.show();
      System.out.println(g.getValue());
      }
   }

