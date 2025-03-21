class consta{
    int roll ;
    String name;
    int age;
  consta(int roll,String name){
      this.roll=roll;
      this.name=name;
      }
  consta(int roll, String name, int age){
       this( roll, name);
       this.age =age;
       }
       
      void display(){
      System.out.println(roll+name+age);
     }
     }
  class constructor{
  public static void main(String args[]){
        consta c=new consta(222,"hasan");
        c.display();
        consta c1 = new consta(222,"hasan",23);
        c1.display();
     }   
    }
    
