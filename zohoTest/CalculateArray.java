//4. Write a Java program to calculate the average value of array elements.
class CalculateArray{
    public static void main(String args[]){
          int a[]={20, 30, 25, 35, -16, 60, -100};
          
          int sum =0;
             for(int i=0 ; i < a.length; i++){
                    sum =sum + a[i];
                    }
             double avg = sum / a.length;
            System.out.println(avg);
            }
            }
            
                
