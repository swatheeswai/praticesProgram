class Esprogram52{
public static void main(String args[]){
int a[]={1,2,3,4,5,6,7,8,9};
int left =0;
int right= a.length-1;
	for(int i=0;i<a.length;i++)
	{	
	   while(left<right)
		if(a[left]%2==0)
		{
			left++;
		}
		else if(a[right]%2!=0)
		{
			right--;
		}
		else
		{
			int temp =a[left];
			a[left]=a[right];
			a[right]=temp;
			left++;
			right--;
		}
		System.out.println(a[i]);
	
	}	
}
}

