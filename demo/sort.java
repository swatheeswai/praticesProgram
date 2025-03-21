/*Selection sorting 
 *using 2 forloop
 *first loop is check a first variable
 *another loop is check the next variable whichone is minimum
 *if check is check the both variable 
 *temp variable is used to swap a variable
*/
class sort{
    public static void selectionSort(int a[]){
      int temp=0;
      System.out.println("Original Array");
        for(int i=0;i<a.length;i++){
         System.out.print(a[i]+" ");
         }
      for(int i=0;i<a.length;i++){
           for(int j=i+1;j<a.length;j++){
                 if(a[i]>a[j]){
                 temp =a[i];
                 a[i]=a[j];
                 a[j]=temp;
                 }
                 }
                 }
             System.out.println("\nSorted Array");
             for(int i=0;i<a.length;i++){
             System.out.print(a[i]+" ");
             }
           }
  public static void main(String args[]){
        int a[]={2,5,7,32,1,15,6,8};
        selectionSort(a);
        }
        }
