class outer {
  private int a =100;
  
  public void inner(){
    int b = 200;
     class Inner{
         void add(){
            int sum = a+b;
              System.out.println(sum);
            }
            }
       
       
        }
        }
        
  public class innerclass2{
     public static void main(String args[]){
         outer out = new outer();
         outer.Inner in = out.new Inner();
         out.in.add();
         }
         } 
