class EvenOdd{
public static void main(String args[]){
	int a[]={1,2,3,4,5,6,7,8,9};
	int Evencount=0;
	int Oddcount=0;
		for(int i = 0; i < a.length; i++)
		{
		if(a[i]%2==0){
		Evencount++;
		}
		else
		{
	         Oddcount++;
		}
		}
		System.out.println("Even number count:" +" "+Evencount);
		System.out.println("Odd number count:" +" "+Oddcount);
		}
		}
