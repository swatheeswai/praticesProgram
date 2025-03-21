class average{
public static void main(String args[]){
int a[]={10,2,3,4,1};
int min=a[0];
int max=a[0];
int size =a.length;
	for(int i=0; i < size; i++)
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
	double total=min+max/size;
	System.out.println("Average in min and max:"+ total);
	}
	}
	
