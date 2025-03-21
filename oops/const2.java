class const1{
 int rollno;
 String name;
  const1(int rollno, String name){
this.rollno=rollno;
this.name=name;
System.out.println(rollno+name);
}
}

public class const2{
public static void main(String args[]){
const1 obj =new const1(16,"swathi");

}
}
