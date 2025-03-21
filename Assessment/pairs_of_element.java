class pairs_of_element{
public static void main(String args[]){
int a[]={1,3,2,4,5,6,7};
int target=7;
int sum=0;
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++){
sum=a[i]+a[j];
if(sum==target)
{
System.out.println(a[i]+" "+a[j]+" ");
}
}
}
}
}
