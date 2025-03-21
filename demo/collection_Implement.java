import java.util.Scanner;
class DynamicArray{
  static final int intialCapacity=16;
  int arr[];
  int size;
  int capacity;
DynamicArray(){
      size=0;
      arr= new int[intialCapacity];
      capacity=intialCapacity;
      }
public void add(int val){
   if(capacity==size){
   expandArray();
        //System.out.println(Array is full");
        }
    arr[size]=val;
    size++;
    }
private void expandArray(){
     capacity*=2;
     arr=java.util.Arrays.copyOf(arr,capacity);
     } 
public void display(){
System.out.println("Total Arrays");
    for(int i=0;i<size;i++)
        System.out.print(arr[i]+" ");
        }
public void insertAtpos(int pos,int val){
    if(size==capacity)
    expandArray();
    for(int i=size;i>pos;i--)
    arr[i+1]=arr[i];
    arr[pos]=val;
    size++;
    }
public void deletePos(int pos){
     for(int i=pos-1;i<size;i++)
     arr[i-1]=arr[i];
     size--;
     
     if(capacity>intialCapacity && capacity>3*size)
     shrikArray();
     }
private void shrikArray(){
        capacity /=2;
        arr=java.util.Arrays.copyOf(arr,capacity);
        }
public int length(){
     return size;
     }
 }
    
    
class collection_Implement{
  public static void main(String args[]){
  DynamicArray list= new DynamicArray();
  Scanner scan= new Scanner(System.in);
  int val,pos;
      while(true){
         System.out.println("-------------MenuList-----------------");
         System.out.println("1.Insert at End");
         System.out.println("2.display the list");
         System.out.println("3.Insert at specific position");
         System.out.println("4.Remove the list");
         System.out.println("5.Exit");
         System.out.println("-----------------------------");
         System.out.println("Enter your choice");
         int choice = scan.nextInt();
         switch(choice){
         case 1:System.out.println("Enter the data: "+" ");
                    val=scan.nextInt();
                    list.add(val);
                    break;
         
         case 2: list.display();
                  break;
         
         case 3: System.out.println("Enter the specific position(Starts with 0)");
                  pos = scan.nextInt();
                  if(pos<0){
                     System.out.println("Invalid index");
                     break;
                     }
                     System.out.println("Enter the data: "+" ");
                    val=scan.nextInt();
                    list.insertAtpos(pos,val);
                    break;
        
         case 4: System.out.println("Enter the specific position(Starts with 0)");
                  pos = scan.nextInt();
                   if(pos<0){
                     System.out.println("Invalid index");
                     break;
                     }
                     list.deletePos(pos);
                     break;
                     
         case 5:     System.exit(0);
                     break;
                     
         default :
                   System.out.println("Invalid Input");
                   break;
                   }
                 }
               }
             }
                     
                     
         
         
    
