class CheckInteger{
public static void main(String args[]){
	int a[]={10,55,65,77};
	int key1 = 65;
	int key2 = 77;
	int count1=0;
	int count2=0;
		for(int i=0;i<a.length;i++)
	
		{
			if(a[i]==65){
			count1++;
			}
			if(a[i]==77){
			count2++;
			}
		}
		if(count1==1&&count2==1)
	System.out.print("present");}	
}
