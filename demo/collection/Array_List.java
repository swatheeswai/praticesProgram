import java.util.ArrayList;
import java.util.Iterator;
//import java.util.*;
class Array_List{
  public static void main(String args[]){
      ArrayList<String> list= new ArrayList<String>(5);
         list.add("Java0.1");
         list.add("Java");
         list.add("Java");
         list.add("Java");
         list.add("Java");
       // System.out.println("Index value of 3:"+list.get(3));
       //Traversing list through Iterator
           Iterator itr= list. iterator();
           while(itr.hasNext()){
           System.out.println(itr.next());
        }
        }
        }
