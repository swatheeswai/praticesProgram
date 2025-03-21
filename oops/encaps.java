class Animal {
      private String name;
      private int age;
   void setName(String name){
      this.name = name;
      }
   void setAge(int age){
        this.age = age;
        }
   public String getName(){
       return name;
       }
   public int getAge(){
       return age;
       }
   }
class encaps{
public static void main(String []args){
   Animal a = new Animal();
   a.setName("cat");
   a.setAge(2);
   System.out.println(a.getName());
   System.out.println(a.getAge());
   }
   }

