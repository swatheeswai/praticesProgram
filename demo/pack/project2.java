interface Bank{
   Static void getInterest(){
        System.out.println("different categories of loan are provided different banks ");
        }
   void homeloan();
   void goldloan();
   void landloan();
   }
class SBI implements Bank{
   @Override
   public  void homelone(){
       System.out.println("50% of interest in home loan");
       }
   @Override 
   public void goldloan(){
        System.out.println("2% of interest in gold loan");
        }
    @Override
    public void landloan(){
         System.out.println("5% of interest in landloan");
         }
//private String s;
    class takeLoan extends SBI{
          }
class project2{
   public static void main(String args[]){
         SBI s = new SBI();
       SBI.takeloan t=new 
             
             
         
     
    
