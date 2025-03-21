class employee{
   private String name;
   private String job_title;
   private double salary;
 employee(String name,String job_title,double salary){
     this.name=name;
     this.job_title=job_title;
     this.salary=salary;
     }
 public void setName(String name){
       this.name=name;
 }
 public void setJob_title(String job_title){
        this.job_title=job_title;
        }
 public void setSalary(double salary){
        this.salary=salary;
        }
 public String getName(){
       return name;
 }
 public String getJob_title(){
      return job_title;
        }
 public double getSalary(){
        return salary;
        }
 public void raisesalary(double percentage){
    salary=salary+salary*percentage/100;
    }
 
  public void displayEmployee(){
     System.out.println("Employee Name"+name);
      System.out.println("Employee job_title"+job_title);
       System.out.println("Employee salary"+salary);
       }
    }
class ProjectEmployee{
   public static void main(String args[]){
   employee emp= new employee("Alice","HR Manager",50000);
    employee emp1= new employee("Swathi","Software Developer",60000);
   emp.displayEmployee();
    emp1.displayEmployee();
   System.out.println("----------------------------");
            emp. raisesalary(12);
             emp1. raisesalary(20);
   System.out.println("12% Alice raiseslaray");
             emp.displayEmployee();
   System.out.println("20% swathi raiseslaray");
           emp1.displayEmployee();
  
   }
   }
   
//----------------------------------------------------------------------------------
      // System.out.println("Enter employee member");
    //int range=scan.nextInt();
        // employee emp[]= new employee(range);
        // for(int i=0;i<range;i++){
           // System.out.println("Enter employee Name:");
          //  String name = scan.next();
          // System.out.println("Enter employee Job Title:");
          // String job_title=scan.next();
      //emp=new employee(name,job_title,50000){
       
       // System.out.println("\nEmployee Details:");
       // for (Employee employee : emp) {
           // System.out.println(employee);
        //}
        
        
         
