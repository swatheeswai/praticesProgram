import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
class GenDemo<T extends List>{
   private T list;
   
   GenDemo(T list){
       this.list= list;
       }
    public void addElement(String element){
       list.add(element);
      }
    public T get(){
        return list;
        }
  public static void main(String args[]){
      GenDemo<List<String>> g = new GenDemo<>(new Stack<String>());
      g.addElement("Jafa");
      System.out.println(g.get());
}
}      


    
