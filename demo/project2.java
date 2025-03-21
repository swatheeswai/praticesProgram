class signI{
   private String username;
   private int password;
   private String email;
   private long phoneno;
     signIn(String username,int password,String email,long phoneno){
          this.username=username;
          this.password=password;
          this.email=email;
          this.phoneno=phoneno;
     }
   public void setUserName(String username){
          this.username=username;
   }
     public void setPassword(int password){
          this.username=username;
   }
    public void setEmail(String email){
          this. email= email;
   }
    public void setPhoneNo(long phoneno){
          this.phoneno=phoneno;
   }
interface Bank{
   static void getInterest(){
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
    public  void getloan(){
         System.out.println("what type of loan u want code 2134 ");
         } 
class IOB extends SBI{
 @Override
   public  void homelone(){
       System.out.println("30% of interest in home loan");
       }
   @Override 
   public void goldloan(){
        System.out.println("5% of interest in gold loan");
        }
    @Override
    public void landloan(){
         System.out.println("12% of interest in landloan");
         }
    public  void getloan(){
         System.out.println("what type of loan u want code 1234");
         } 
     public void educationloan(){
           System.out.println("0% of interest in educationloan");
           }
      public void farmerloan(){
           System.out.println(" 1% of interest in farmerloan);
}
class ICIC extends SBI{
     public  void homelone(){
       System.out.println("40% of interest in home loan");
       }
   @Override 
   public void goldloan(){
        System.out.println("15% of interest in gold loan");
        }
    @Override
    public void landloan(){
         System.out.println("20% of interest in landloan");
         }
    public  void getloan(){
         System.out.println("what type of loan u want code 3245");
         } 
         @Override
     public void educationloan(){
           System.out.println("0% of interest in educationloan");
           }
           @Override
      public void farmerloan(){
           System.out.println(" 1% of interest in farmerloan);
}
class 
class project2{
   public static void main(String args[]){
   
        
             
         
     
    
