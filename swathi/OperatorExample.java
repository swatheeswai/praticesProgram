public class OperatorExample{  
  /*int a=10; 
  
{
++a;
}*/

public static void main(String args[])
{  

  /*for (int i=0;i<5;i++)
  {
   for (int j=0;j<i;j++)
   {
System.out.print("*");
}
System.out.println();*/
/*int term = 6;
for(int i=0;i<=term;i++)
{
for(int j=term;j>=i;j--){
System.out.print("*");
}
System.out.println();*/
 /* OperatorExample o1 = new OperatorExample();
  System.out.println(o1.a);
   OperatorExample o2 = new OperatorExample();
 System.out.println(o2.a);
   OperatorExample o3 = new OperatorExample();
  System.out.println(o3.a);*/
int row=4;
int col=4;
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
if(i==0 || i==row-1 || j==0 || j==col-1)
 System.out.print("*");
else
 System.out.print("");
  
  }
}
}
}

