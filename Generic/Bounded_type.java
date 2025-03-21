class Bounded_type<T extends List>{
    T list;
   public static T add(<? extends Number> l){
      list.add(l);
      }
    public void get(){
         return list;
         }
     public static void main(String args[]){
           Bounded_Type<List<Integer>> a = new Bounded_Type<>(new ArrayList<Integer>()) ;
           a.set(1);
           }
           }
