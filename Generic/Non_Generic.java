class Non_Generic{
   private Object value;
     public void set(Object value){
         this.value = value;
         }
     public Object get(){
         return value;
         }
    public static void main(String args[]){
         Non_Generic non =new Non_Generic();
         non.set("JAva");
         non.set(12);
         non.set(12.9f);
         non.set(12.99);
         non.set('a');
         char s = (char)non.get();
         System.out.println(s);
         }
         }
         
     
