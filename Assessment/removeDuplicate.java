class removeDuplicate{
public static void main(String args[]){
	int a[]={1,2,3,1,4,5,6,1,7,4,2,3};
	int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;i<a.length;j++)
			{
				if(a[i]!=a[j])
				{
					b[i]=a[i];
				}
                         }
				System.out.println(b[i]);
		}
}
}



