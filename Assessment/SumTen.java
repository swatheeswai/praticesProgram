class SumTen{
public static void main(String args[]){
	int a[]={10,23,45,65,10,10,10,10};
	int sum=0;
		for(int i =0;i<a.length;i++)
		{
			if(a[i]==10)
			{
				 sum+=a[i];
			}
		}
			if(sum==30)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
}
}

