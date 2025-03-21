class Student{
public static void main(String args[]){
int a = 22;
String name = "swathi";
char ch= 'a';
boolean b = true;
float f =10.0f;
double d = 10.89;
System.out.print(master(a,name,ch,b,f,d));
}
public static String master(int a,String name,char ch,boolean b,float f,double d)
{
	return a+name+ch+b+f+d;
}
}
