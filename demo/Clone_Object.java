class department implements Cloneable{
    //intitialize a variable in department class
    int dept_id;
    String course;
   //constructor 
         department(int dept_id,String course){
                   this.dept_id=dept_id;
                   this.course=course;
          }
          //Display method in department class
        public void display(){
               System.out.println("department Id:"+dept_id);
               System.out.println("Course:"+course);
            }
            @Override
             protected Object clone()throws CloneNotSupportedException{
                        return super.clone();
          }
     }
 class Student implements Cloneable{
    int id;
    String name;
    department dept;// create a object of department class 
   //constructor
   Student(int id,String name, department dept){
      this.id=id;
      this.name=name;
      this.dept=dept;
      }
      //Syntax of clone method override of clone()
      @Override
   protected Object clone()throws CloneNotSupportedException{
         Student s = (Student)super.clone();
         s.dept=(department)s.dept.clone();
         return s;
          }
      //display method 
  public void display(){
       System.out.println("Id:"+id);
         System.out.println("Name:"+name);
                dept.display();
     }
  }   
  class Clone_Object{
     public static void main(String args[]){
          //department class object
          try{
          department d = new department(1,"Maths");
         //Student class object
          Student s1= new Student(12,"swathi",d);
          //clone object
          Student s2 =(Student)s1.clone();
          d.dept_id=2;
          s1.name="hasan";
          d.course="pyhsics";
          s1.display();
          s2.display();
          }
          catch(CloneNotSupportedException e){
          System.out.println(e);
          } 
     }
     }
          
