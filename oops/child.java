//Ananymous class
class person{
    public void eat()
    { 
    System.out.println("eats");
    }
    //abstract void sleep();
}
public class child
{
	public static void main(String[] args) {
		person p =new person(){
	
		public void eat(){
		    System.out.println("eat");
		}
		
		};
		p.eat();
		
		
	}
}
