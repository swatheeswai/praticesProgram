/*Calculate and store student grades for various subjects.
 *Input: Student name and grades for multiple subjects.
*Output: Student's average grade and status (pass/fail).
*/

class Student{
    private String name;
    private String grade;
    private String status;
 Student(String name,String grade){
    this.name=name;
    this.grade=grade;
    }
  public String getName(){
    return name;
    }
  public String getGrade(){
    return grade();
    }
    }
 class Main{
    public static void main(String args[]){
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter your Name");
         String name = scan.next();
         System.out.println("Enter the subject");
         int sub = scan.nextInt();
         double grade[]=new int[sub];
         int total=0;
         for(int i=0;i<grade.length;i++){
              total=grade[i];
              }
          double average = total/sub;
          status=
