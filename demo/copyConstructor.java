class copyConstructor{
 int age;
 String name;
 copyConstructor(int age,String name){
  this.age=age;
  this.name=name;
  }
  copyConstructor(){}
  void display(){
  System.out.println(age+" "+name);
  }
  public static void main(String args[]){
  copyConstructor c1= new copyConstructor(22,"swathi");
  copyConstructor c2= new copyConstructor();
  c2.age=c1.age;
  c2.name=c1.name;
   c1.display();
   c2.display();
   }
   }
  
 
