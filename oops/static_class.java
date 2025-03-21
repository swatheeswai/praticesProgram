//static nested class
 
class outer{
    static int a =10;
static class inner{
    static int b =10;
    static void msg(){
    int sum = a+b;
       System.out.println(sum);
       }
       }
       }
public class static_class{
 public static void main(String args[]){
      outer.inner.msg();
      }
      }
      
