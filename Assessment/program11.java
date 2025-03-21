class program11{
public static void main(String args[]){
	String a[]={"2 hi 4 hello 3 a 4 b"};
	int temp=0;
	System.out.println("Orginal Array:");
                for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i=0;i<a.length;i++)
		{
  			for(int j=i+1;j<a.length;j++)
  			{
				 if(a[i]>a[j]){
				  temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
				  }
  			}
  		}
 		 System.out.println();
 		 System.out.println("Sort Array:");

			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
  }
  }
