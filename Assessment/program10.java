public class program10
{
  public static void main (String[]args)
  {
    int n=12345;
    String a=" ";
    while(n>0){
               int digit=n%10;
                a=digit+a;
                n=n/10;
    }
    System.out.print((a));
}
}

