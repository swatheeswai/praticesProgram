class difference{
public static void main(String args[]){
int a[]={10,2,3,4,5,1};
int min=a[0];
int max=a[0];
	for(int i=0; i < a.length; i++)
	{
	if(a[i]<min)
	{
	min=a[i];
	}
	if(a[i]>max){
	max=a[i];
	}
	}
	System.out.println("Minimum:"+" "+min);
	System.out.println("Maximum:"+" "+max);
	int total=max-min;
	System.out.println("difference in min and max:"+ total);
	}
	}
	
