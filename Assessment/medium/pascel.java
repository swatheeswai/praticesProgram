 import java.util.Scanner;
 class pascel
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = scan.nextInt();        
        for (int i = 0; i < rows; i++)
        {
            int number = 1;
 
           
            for (int j = 0; j < rows - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++)
            {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
