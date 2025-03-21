class by{
public static void main(String args[]){
int a = 10;
int b = 80;
int c = 20;
{
System.out.println(++a);
System.out.println(a++);
System.out.println(--a);
System.out.println(a--);
System.out.println(--a + ++a);
System.out.println(~a);

System.out.println(a>b||a>c);
for(int row=1;row<=4;row++)
  {
  for(int col=1;col<=4;col--)
  {
  System.out.println(row);
  }
  
  System.out.println();
  
  }

//for (int row = 3; row >= 0; row--)
//{
//System.out.println(row);
//}

 

       
        // Using increment operator in a for loop
        for (int i = 1; i <=3; i++) {

        for (int j = 3; j >=0; j--) 
            System.out.println(i+""+j);
        
        
        for(int row=3;row>0;row--){
        for(int col=3;col>=row;col--)
      
        System.out.print(col);
          System.out.println();
        }
        for(int row=1; row <=3; row++)
      {
      for(int col=1; col<=row; col++)
       System.out.print("@"); 
        System.out.println();
      }
      //@ and # program
  /*for (int row=1; row <=3; row++)
  {
  for(int col1=1; col1 <row; col1++)
  System.out.print("@");
  {
  for(int col2=3; col2 >=row; col2--)
  System.out.print("#");
  System.out.println();
  }
  }
  */
  /*for (int row=1; row <=3; row++)
  {
  for(int col1=1; col1 <row; col1++)
  System.out.print(col1);
  {
  for(int col2=3; col2 >=row; col2--)
  System.out.print(row);
  System.out.println();
  }
  }
  */
  /*for (int row=3; row >=1;row--)
  {
  for (int col=3; col >=row; col--)
  System.out.print(row);
    System.out.println();
  }*/
  /*for(int row=1; row <=3; row++)
  {
  for(int col=3; col >=row; col--)
  
  System.out.print(col);
  System.out.println();*/
/*for( int row=1; row <=3; row++)
{
for(int col=2; col>=row; col--)

System.out.print("+");
{
for(int col2=1; col2 <=row; col2++)

System.out.print("*");
System.out.println();

}
 
 }*/ 
/*for( int row=1; row <=3; row++)
{
for(int col=2; col >=row; col--)

System.out.print("?");

for(int col2=1; col2 <=row; col2++)

System.out.print(col2);
System.out.println();
 }
 */
/*for( int row=3; row >=1; row--)
{
for(int col=2; col <=row; col++)

System.out.print("?");

for(int col2=3; col2 >=row; col2--)

System.out.print(col2);
System.out.println();
 }*/
/* for( int row=3; row >=1; row--)
{
for(int col=2; col >=row; col--)

System.out.print("?");

for(int col2=1; col2 <=row; col2++)

System.out.print(col2);
System.out.println();
 }*/
 /*for( int row=1; row <=3; row++)
{
for(int col=1; col >=row; col--)

System.out.print("");

for(int col2=1; col2 <=row; col2++)
System.out.print(col2);

for(int col3=1; col3 >row; col3--)
System.out.println(col3);
System.out.println();
 }*/
 
 /*int total=1;
 {
 for(int count=1; count<=5; count++){
 int mark=1;
     total=total*mark;
     }
     System.out.println(total);
 
 
 }*/
//8*8 pattern
/*
{
for(int row=1; row <=8; row++)
{
for(int col=1; col <=8; col++)
   
   if(row==1 || col==4 || row==8)
   System.out.print("* ");
   else
System.out.print("  ");
System.out.println();
}
}*/
//c letter
/*{
 for(int row=1; row <=8; row++)
  System.out.print("*");
 for(int col=1; col <=8;  col++)
 System.out.println("*");
 for(int row=1; row <=8; row++)
  System.out.print("*");
 System.out.println();
 }*/
 //H letter
 /*{
for(int row=1; row <=8; row++)
{
for(int col=1; col<=8; col++)
{
if(col==1 || col==8 || row==4)
System.out.print("*");
else
{
System.out.print(" ");
}
}
System.out.println();    
}
 }*/
 
 //O letter
  /*{
for(int row=1; row <=8; row++)
{
for(int col=1; col<=8; col++)
{
if(col==1 || col==8 || row==1 || row==8)
System.out.print("*");
else
{
System.out.print(" ");
}
}
System.out.println();    
}
 }*/
 //U letter
  /* {
for(int row=1; row <=8; row++)
{
for(int col=1; col<=8; col++)
{
if(col==1 || col==8 || row==8)
System.out.print("*");
else
{
System.out.print(" ");
}
}
System.out.println();    
}
 }*/
 //+ letter
 /*{
 for(int row=1; row <=8; row++)
{
for(int col=1; col<=8; col++)
{
if( row==4 ||  col==8/2)
System.out.print("*");
else
{
System.out.print(" ");
}
}
System.out.println();    
}
 }*/
 //P letter
 /*{
 for(int row=1; row <=8; row++)
{
for(int col=1; col<=8; col++)
{
if(col==1 || col==8 || row==1 || row==8)
System.out.print("*");
else
{
System.out.print(" ");
}
}
System.out.println();    
}
 for(int col1=1; col1 <=8; col1++)
 System.out.println("*");
 
 }*/
 
 {
for(int row=1; row <=8; row++)
{
for(int col=1; col<=8; col++)
{
if(col==1 || col==8 || row==1 || row==8)
 if(col!=8)
System.out.print("*");
else
{
System.out.print(" ");
}
}
System.out.println();    
}
 }
 
 
 
 }    
 }
