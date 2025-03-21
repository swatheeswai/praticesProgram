class AdLogical2{
public static void main(String args[]){
	int a[]={10,5,1};
	System.out.println(possiblity(a));
	}	
public static boolean possiblity(int []a){
		int count =0;
		for(int i=0; i<a.length-1; i++)
		{
		if(a[i]>a[i+1])
		{
		 count++;
		 if(count>1){
		 return false;
		 }
		 if (i > 0 && a[i - 1] > a[i + 1]) {
                    a[i + 1] = a[i];
                    }
                 }
                 }
                    return true;
       }
                    
  }
