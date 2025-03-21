//call by reference
class student{ }
class admin{  }
class libray{ }
class employee{ }
class college{
   public void disp(student s, admin a){
         System.out.println("Student and admin");
         }
   public void display(libray l, employee e){
         System.out.println("library employee");
         }
    
    public static void main(String args[]){
         college c = new college();
         student s = new student();
         admin a =new admin();
        c.disp(s,a);
        c.display(new libray(),new employee());
        
        }
        }
