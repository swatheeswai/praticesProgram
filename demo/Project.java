import java.util.Scanner;
interface Company{
   public static void admin(){
     System.out.println("Admin page is invoked");
}
void display();
void pay();
}
abstract class Customer_SignIn implements Company{
    private String customer_UserName;
    private String customer_Email;
    private long customer_phoneNo;
    private String customer_password;
  
public Customer_SignIn(String customer_UserName,String customer_Email,long customer_phoneNo,String customer_password){
  this.customer_UserName = customer_UserName;
   this.customer_Email = customer_Email;
    this.customer_phoneNo = customer_phoneNo;
    this.customer_password = customer_password;
}
 public void setCustomer_UserName(String customer_UserName){
       this.customer_UserName=customer_UserName;
       }
 public void setCustomer_Email(String customer_Email){
       this.customer_Email=customer_Email;
       }
 public void setCustomer_phoneNo(long customer_phoneNo){
       this.customer_phoneNo=customer_phoneNo;
       }
 public void setCustomer_password(String customer_password){
       this.customer_password=customer_password;
       }
 public String getCustomer_UserName(){
        return this.customer_UserName;
        }
 public String getCustomer_Email(){
        return this.customer_Email;
        }
 public long getCustomer_phoneNo(){
        return this.customer_phoneNo;
        }
 public String getCustomer_password(){
        return this.customer_password;
        }
   @Override
  public void display(){
       System.out.println("Customer UserName:"+" "+customer_UserName);
       System.out.println("Customer Email:"+" "+customer_Email);
       System.out.println("Customer PhoneNmber:"+" "+customer_phoneNo);
       System.out.println("Customer Password:"+" "+customer_password);
    }
}

class Customer_details extends Customer_SignIn{
      private int Id;
      private int payment;
      private int bending;
     public Customer_details (String customer_UserName,String customer_Email,long customer_phoneNo,String customer_password,int Id,int payment){
        super(customer_UserName,customer_Email,customer_phoneNo,customer_password);
        this.Id=Id;
        this.payment=payment;
      }
      public void setCustomerDetails(int payment,int bending){
           this.payment=payment;
           }
      
  public int customerId(int Id){
        return Id;
        }
  public int customerPayment(int payment){
        return payment;
        }
   @Override
   public void display(){
      super.display();
      System.out.println("Customer Id:"+Id);
        System.out.println("Customer Payment:"+payment);
   }
   @Override
   public void pay(){
       System.out.println("Payment is shown");
   }
   }
class Emplyee_SignIn{
     private int emp_Id;
     private String emp_Password;
 public Emplyee_SignIn(int emp_Id,String emp_Password){
     this.emp_Id=emp_Id;
     this.emp_Password=emp_Password;
 }
 public void setEmp_Id(int emp_Id){
   this.emp_Id=emp_Id;
 }
 public void setEmp_Password(String emp_Password){
   this.emp_Password=emp_Password;
 }
 public int getsetEmp_Id(){
    return emp_Id;
    }
 public String getsetEmp_Password(){
    return emp_Password;
    }
  @Override
  public String toString(){
     return "Employee_Id:"+emp_Id +"\nEmployee_Password:"+emp_Password;
     }
     } 
class Project {
   public static void main(String args[]){
     Company.admin();
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter Customer User Name: ");
        String customerUserName = scanner.nextLine();

        System.out.print("Enter Customer Email: ");
        String customerEmail = scanner.nextLine();

        System.out.print("Enter Customer Phone Number: ");
        long customerPhoneNo = scanner.nextLong();

        System.out.print("Enter Customer Password: ");
        String customerPassword = scanner.next();

        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();

        System.out.print("Enter Customer Payment: ");
        int customerPayment = scanner.nextInt();
     
     Customer_details c = new Customer_details(customerUserName, customerEmail, customerPhoneNo, customerPassword, customerId, customerPayment);
     c.setCustomer_Email(customerEmail);
    // System.out.println(c.getCustomer_Email());
        c.display();
        c.pay();
     
     System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();

        System.out.print("Enter Employee Password: ");
        String empPassword = scanner.next();
      Emplyee_SignIn e = new Emplyee_SignIn(empId, empPassword);
     System.out.println(e.toString());
     scanner.close();
        }
        }
      
 
