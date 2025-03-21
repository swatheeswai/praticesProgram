class spiralMatrix{
public static void main(String args[]){
     int a[][]={{1,2,3,4,},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
       int top=0;
       int bottom=a.length-1;
       int left=0;
       int right=a[0].length-1;
       while(top<=bottom && left<=right)
       {
       	for(int i =left; i<=right; i++)
       	{
       	System.out.print(a[top][i]);
       	}
       	top++;
       	System.out.println();
       	for(int i =top; i<=bottom; i++)
       	{
       	System.out.print(a[i][right]);
       	}
       	right--;
       	System.out.println();
       	if(top<=bottom){
       	for(int i =right; i>=left; i--)
       	{
       	System.out.println(a[bottom][i]);
       	}
       	bottom--;
       	System.out.println();
       	}
       	
       	if(left<=right){
       	for(int i =bottom; i>=top; i--)
       	{
       	System.out.print(a[i][left]);
       	}
       	left++;
       	System.out.println();
       	}
       	
     }
   }
 }
       	
