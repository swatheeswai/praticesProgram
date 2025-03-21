//Arithmetic calculator
 class Calculator{
     public void add(int a,int b){
        System.out.println(a+b);
        }
     public void sub(int a,int b){
        System.out.println(a-b);
        }
     public void mul(int a,int b){
        System.out.println(a*b);
        }
     public void div(int a,int b){
        System.out.println(a%b);
        }
     public void add(double a,double b,double c){
        System.out.println(a+b+c);
        }
     public void sub(double a,double b,int c){
        System.out.println(a-b-c);
        }
     public void mul(double a,double b,long c){
        System.out.println(a*b*c);
        }
     public void div(double a,double b, double c){
        System.out.println(a%b%c);
        }
        }
        
 public class projectCalculator{
    public static void main(String[] args){
           Calculator calc= new Calculator();
           calc.add(1,2);
           calc.sub(1,2);
           calc.mul(1,2);
           calc.div(1,2);
             calc.add(1.1,1.2,1.3);
           //calc.sub(1,2);
           //calc.mul(1,2);
           //calc.div(1,2);
           
        }
        }
        
      
        
         
