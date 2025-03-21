class CommonArray{
public static void main(String args[]){
	int a[]={1,2,3,1,5,6};
	int b[]={1,2,7,1,5,8};
	int count=0;
	 	if(a.length!=b.length)
	 	{
	 	System.out.println("Length Mismatch");
	 	}
	 	else
	 	{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<b.length;j++)
				{
                                     if(a[i]==b[j])
                                     {
                                           count++;
					System.out.print(a[i]);
				    }
				    
   			        }
   			}
   			
   		}	
      }
  }    
   		
   			
     
