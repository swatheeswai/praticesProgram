class toys{
  String name;
  float size;
  toys(String name,float size){
    this.name=name;
    this.size=size;
    }
    static{
    System.out.println("After invoking the Copy Constructor:");  
    }
    toys(toys toy){
      this.name=toy.name;
      this.size=toy.size;
    }
  public void display(){
     System.out.println("Toys name:"+name);
     System.out.println("size of toys:"+size);
     }
  }
  class copy_Constructor{
    public static void main(String args[]){
          toys s = new toys("Elephant toy",4.5f);
          s.display();
          
          toys s1=new toys(s);
          toys s2=new toys(s);
          toys s3=new toys(s);
          toys s4=new toys(s);
          toys s5=new toys(s);
          s1.name="dogy";
          s1.size=3.0f;
          s1.display();
           s2.display();
            s3.display();
             s4.display();
              s5.display();
          
          }
          }
