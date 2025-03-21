public class Exception7 {
public static void main(String[] args) 
{
    Object obj = new Object();
    String str = (String)obj;
    System.out.println(str);
  }
}
/*output
xception in thread "main" java.lang.ClassCastException: class java.lang.Object cannot be cast to class java.lang.String (java.lang.Object and java.lang.String are in module java.base of loader 'bootstrap')
	at Exception7.main(Exception7.java:5)*/

