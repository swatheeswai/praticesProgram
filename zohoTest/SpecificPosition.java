//Write a Java program to insert an element (specific position) into an array.
import java.util.Arrays;
class SpecificPosition{
    public static void display(int arr[],int pos, int val){
           for(int i=0; i<=pos;i++){
                arr[pos]=val;
                }
            System.out.println(Arrays.toString(arr));
            }
   public static void main(String args[]){
        int arr[] = {12,34,56,78,90};
        int pos=7;
        int val=70;
        display(arr,pos,val);
        }
        }
       
