class GenericType<T> {
     private T value;
    public void setValue(T value){
        this.value= value;
     }
     public T getValue(){
        return value;
        }
      public <T> void print(T item){
      System.out.println(item);
      } 
      public  <T extends Number> T say(T num){
            return num;
            }
      public  <T super Integer> void disp(T nums){
           System.out.println(nums);
           }
   public static void main(String args[]){
        GenericType g = new GenericType<>();                                 
        g.setValue('s');
        System.out.println(g.getValue());
        g.print(12);
        g.print("sde");
        g.print(90.00f);
        
         System.out.println(g.say(12));
         System.out.println(g.say(99.08f));
         System.out.println(g.say(99.098));
         System.out.println(g.say(32767));
         
        
       
        //g.disp(90.00f);
        }
        }
