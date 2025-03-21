class Voter{
   interface Demo{
       void display();
       }
     class Registration implements Demo{
        private int voterId;
        private String emailId;
        private long phoneNo;
        private String password;
     public Registration(int voterId,String emailId,long phoneNo,String password){
           this.voterId = voterId;
           this.emailId = emailId;
           this.phoneNo = phoneNo;
           this.password = password;
           }
     public void setVoterId(int voterId){
            this.voterId = voterId;
            }
     public void setEmailId(String emailId){
             this.emailId = emailId;
             }
     public void setPhoneNo(long phoneNo){
             this.phoneNo = phoneNo;
             }
     public void setPassword(String password){
             this.password = password;
           }
     public int getVoterId(){
        return voterId;
        }
     public String getEmailId(){
         return emailId;
         }
     public long getPhoneNo(){
          return phoneNo;
          }
     public String getPassword(){
          return password;
          }
      public void display(){
          System.out.println("Your details are registered");
          }
       }
    class login implements Demo{
        private int loginId;
        private String loginpassword;
        private Registration register;
      login(int loginId, String loginpassword, Registration register){
       this.register= register;
          if(loginId == register.getVoterId()){
          this.loginId = loginId;
          }
          else{
             System.out.println("Incorrect loginId");
           }
            if(loginpassword.equals(register.getPassword())){
          this.loginpassword = loginpassword;
          }
          else{
             System.out.println("Incorrect loginpassword");
           }
           }
      public int getLoginId(){
          return loginId;
          }
      public String getLoginPassword(){
          return loginpassword;
          }
          public void display(){
      System.out.println("your account is login");
      }
    }
    class Vote implements Demo{
        private int age;
        private boolean isEligible=false;
        private int count;
        Vote(int age){
        if(age>=18){
           this.age = age;
           this.isEligible = true;
           }
        else{
            System.out.println("your age too low ");
            }
         }
        void votecount(){
              
              if(isEligible){
                count++;
                }
              System.out.println(count);
              }
              
       public void display(){
             votecount();
             if(isEligible==true){
            
              System.out.println("voted"+count);
              
              }
              else{
              System.out.println("not voted");
          }
          }    
     
         }
         }  
         
  
  class VoteProject{
     public static void main(String args[]){
         Voter vote = new Voter();
         Voter.Registration register = vote.new Registration(29812,"java123@gmail.com",1234567890,"hbabba");
         register.display();
         
         Voter.login log = vote.new login(29812,"hbabba",register);
         log.display();
         
         Voter.Vote vot = vote.new Vote(12);
         vot.display();
          Voter.Vote vot1 = vote.new Vote(22);
         vot1.display();
          Voter.Vote vot2= vote.new Vote(24);
         vot2.display();
          Voter.Vote vot3 = vote.new Vote(45);
         vot3.display();
         
         }
         }
      
        
          
       
     
   
