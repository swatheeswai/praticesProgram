class recursion1{
    public static void m1(int i){
    if(i==5){
    System.out.println(5);
    return;
    }
    System.out.println(i);
    m1(i+1);
    }
   public static void main(String args[]){
        int s =1;
        m1(s);
        }
        }
