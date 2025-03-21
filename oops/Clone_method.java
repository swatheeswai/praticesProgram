class Student implements Cloneable{
    int roll_no;
    String name;
    Student(int roll_no,String name){
    this.roll_no=roll_no;
    this.name=name;
    }
        public Object clone()throws CloneNotSupportedException{
             return super.clone();
    }
   public static void main(String args[]){
   try{
      Student s1 = new Student(199,"Albert");
      Student s2 = (Student)s1.clone();
      System.out.println("Student roll number"+ s1.roll_no);
      System.out.println("Student Name"+s1.name);
      }
      catch(CloneNotSupportedException e){
      System.out.println("clone notsupported");
      } 
    }
    }
