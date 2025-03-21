import java.util.*;
class Generic_wildCard<T>{
 private  List<T>list = new ArrayList<T>();
    public void set(T item){
      list.add(item);
      }
     public List<T> get(){
       return list;
       }
    public static void main(String args[]){
          Generic_wildCard<Integer> s = new Generic_wildCard<>();
          s.set(2);
          System.out.println(s.get());
          }
          }
    
