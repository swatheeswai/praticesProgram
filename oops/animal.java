 //Static and non static method
 public class animal{
 public static String behaivour(int a, String s){    // if use public not neccessary to put class in s.o.p statement  // if not use (public static String behaivour(int a, String s))
  	return a+s;
  	}
void ani(int a, String s){
	System.out.println(a+s);
	}


public static void main(String args[]){
	int a = 2;
	String s = "walk";
		System.out.println(behaivour(a, s));    //System.out.println(behaivour(a, s));  like this  // System.out.println(animal.behaivour(a, s));  like this
	animal ani = new animal();
		ani.ani(a, s);           //ani is a object . and ani is method name and aruguments


}
}
