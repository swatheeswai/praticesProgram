class anti_spiralmatrix{
public static void main(String args[]){
     int a[][]={{1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}};
       int top=0;
       int bottom=a.length-1;
       int left=0;
       int right=a[0].length-1;
       while(top<=bottom && left<=right)
       {
       	for(int i =top; i<=bottom; i++)
       	{
       	System.out.println(a[i][left]);
       	}
       	left++;
       	
       	for(int i =left; i<=right; i++)
       	{
       	System.out.println(a[bottom][i]);
       	}
       	bottom--;
       	
       	
       	for(int i =bottom; i>=top; i--)
       	{
       	System.out.println(a[i][right]);
       	}
       	right--;
       	
       	
       
       	for(int i =right; i>=left; i--)
       	{
       	System.out.println(a[top][i]);
       	}
       	top++;
       	}
     }
   }
       	
