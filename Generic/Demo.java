class Demo<T,E,V>{
  private T element;
  private E value;
  private V sum;
   
  public Demo(T element,E value,V sum){
      this.element = element;
      this.value = value;
      this.sum = sum;
      
  }
   public T getT(){
       return element;
       }
     public E getE(){
       return value;
       }
 public V getV(){
       return sum;
       }
   public void group(){
      System.out.println(element);
      System.out.println(value);
      System.out.println(sum);
      }
   public static void main(String args[]){
          Demo<Integer,String,Double> d= new Demo<>();
          d.group();
          }
          }
