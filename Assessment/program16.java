class program16{
public static void main(String args[]){
	int a[]={4,3,2,6,7,1,8,6,1,2,3,4,1,2,3,4,1};
	int target =13;
	boolean found=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
			{
			found=true;
			System.out.println(i);
			}
		}
		if(found==false){
                            System.out.println("not in array");
                            }
		
	}
	}
