class AdLogical2{
public static void main(String args[]){
	int a[]={10,5,7};
	system.out.println(possiblity(a));
	}	
public static boolean possibility(int []a){
		int count =0;
		for(int i=0; i<a.length; i++)
		{
		if(a[i]>a[i+1])
		 count++;
		 if(count>1){
		 return false;
		 }
		 if (i > 0 && nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i];
                    }
                    }
                    }
                    return true;
  }
