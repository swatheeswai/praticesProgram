class targetvalue{
public static void main(String args[]){
	int a[]={1,2,3,4,5,6};
	int target=6;
	int sum =0;
		for(int i=0; i<a.length; i++){
		 for(int j=i+1; j<a.length;j++){
		sum=a[i]+a[j];
	           if(sum==target){
		System.out.println(a[i]+"+"+a[j]+"="+sum);
		}	
	  }
	}
}
}
		
