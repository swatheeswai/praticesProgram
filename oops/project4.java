class BankAccount{
    private String Accountholder;
    private double balance;
        BankAccount(String Accountholder, double balance){
             this.Accountholder = Accountholder;
             this.balance=balance;
             }
         public void deposite(double amount){
             if(amount>0){
               balance+=amount;
               System.out.println("deposite amount"+balance);
               }
               else{
                   System.out.println("your account is must be handle 500");
                   }
            }
            public String getAccountHolder(){
                  return Accountholder;
                  }
            public double getBalance(){
                  return balance;
                  }
          }
  class withdrawAmount extends BankAccount {
           
             withdrawAmount(String Accountholder, double balance){
                    super(Accountholder,balance);
                    }
                    public void creditAmount(double amount){
                         if(amount<getBalance()){
                            double newbalance=getBalance()-amount;
                            System.out.println("credit amount"+newbalance);
                            }
                            else{
                            System.out.println("Insufficient amount");
                            }
                            }
                            }
             
              
  class savingAccount extends BankAccount{
         private double interestRate;
             savingAccount(String Accountholder, double balance,double interestRate){
                  super(Accountholder,balance);
                  this.interestRate=interestRate;
                  }
                  public void savings(){
                       double interest =getBalance()*interestRate/100;
                           System.out.println("Interest in savings"+interest);
                           }
                           }
class project4{
public static void main(String args[]){
    BankAccount bank = new BankAccount("alan",10000);
    bank.deposite(2000);
    withdrawAmount withdraw = new withdrawAmount("alan",2000);
    withdraw.creditAmount(2000);
    savingAccount saving = new savingAccount("alan",3000,5);
    saving.savings();
    }
    }
            
              
