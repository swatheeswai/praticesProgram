class TestMemberOuter1{                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   abstract class person{
    abstract void eat();
}
public class Main
{
	public static void main(String[] args) {
		person p =new person();
	
		void eat(){
		    System.out.println("eat");
		}
		p.eat();
	}
}                                                                                                                               
 private int data=30;
 class Inner{
  void msg(){System.out.println("data is "+data);}
 }
 
 void display(){
  Inner in=new Inner();
  in.msg();
 }
 public static void main(String args[]){
  TestMemberOuter1 obj=new TestMemberOuter1();
  obj.display();
 }
}
