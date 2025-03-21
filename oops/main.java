class parent1{
int i=9;
}
class parent2{
int i=99;
}
class child extends parent1,parent2{
void disp(){
System.out.println(i);
}
}
class main{
public static void main(String []args)
{
child c =new child();
c.disp();
}
}
