 class Switchch {
    public static void main(String[] args) {
        

       final int a = 15;
       int b = 5;
        switch(b){
            case(a+10):{
                System.out.print("greater");
               
            }
            case(a-10):{
                System.out.println("smaller");
                break;
            }
            case(a*10):{
                System.out.print("equal");
                break;
            
            }
        }
    }
}
