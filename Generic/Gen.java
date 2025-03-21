class Dog{
   public void dog(){
      System.out.println("dog");
      }
  }
class Cat extends Dog{
     public void cat(){
        System.out.println("cat");
        }
   }
class Tiger extends Dog{
  public void tiger(){
        System.out.println("tiger");
        }
   }
class Gen<T extends Dog>{
    public static void main(String args[]){
        Gen<Cat> g = new Gen<>();
        Cat c = new Cat();
        c.cat();
        }
        }
