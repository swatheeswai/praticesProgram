public class methodcalling{
public static void main(String args[]){
/*int a =2;
int b =9;

methodcalling m = new methodcalling();
int c=m.m( a,b);
System.out.println(c);
}
private int m(int a , int b ){
 int c =a+b;
return c;*/



/*mymethod();
mymethod();
mymethod();
mymethod();
}

 static void mymethod(){
System.out.println("hello");
}*/


 /*methodcalling m = new methodcalling();
 System.out.println(m.hashCode());
 }
 }*/
 
class B{
void add(int a , int b)
{
System.out.println(b);
}
}

public class A{
public static void main(String args[]){
int a =2;
int b ='s';
B obj = new B();
obj.add(a,b);
}
}

 
