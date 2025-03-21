import java.util.Scanner;
class letters{
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the alphates letters");
	String s = scan.nextLine();
	char c = s.charAt(0);
		if((c=='a'|| c=='e'||c == 'i' || c=='o' ||c=='u' || c=='A' ||c=='E'||c== 'I'||c=='O'||c=='U') )
		{
			System.out.println("vowels"+s);
		}
		else if (c >='a' && c <='z'||c >='A'&& c<='Z')
		{
			System.out.println("Consonent"+s);
		}
		else
		{
			System.out.print("not a alphate");
		}

}
}
