class ConstructorDefault {
  String name;
   int roll;
    int marks;
    

    // Constructor with parameters
    ConstructorDefault( String name,int roll, int marks) {
        this.name="swathi";
        this.roll = 43;
        this.marks = 87;
        System.out.print("Roll: " + roll + ", Marks: " + marks + ", name: " + name);
        System.out.println();  // Adding a newline for clarity
    }

    public static void main(String args[]) {
        ConstructorDefault obj = new ConstructorDefault( "sss",111, 67);
        //ConstructorDefault obj2 = new ConstructorDefault("bbb",123, 67);
        //ConstructorDefault obj3 = new ConstructorDefault("ggg",126676, 67);
    }
}

//not using parameter
/*class ConstructorDefault {
  String name;
   int roll;
    int marks;
    

    // Constructor with parameters
    ConstructorDefault( String i,int x, int y) {
        name=i;
        roll = x;
        marks =y;
        System.out.print(i+" "+ x +" " + y );
        System.out.println();  // Adding a newline for clarity
    }

    public static void main(String args[]) {
        ConstructorDefault obj = new ConstructorDefault( "sss",111, 67);
        ConstructorDefault obj2 = new ConstructorDefault("bbb",123, 67);
        ConstructorDefault obj3 = new ConstructorDefault("ggg",126676, 67);
    }
}*/

//copy the constructor
/*class ConstructorDefault {
  String name;
   int roll;
    int marks;
    

    // Constructor with parameters
 public   ConstructorDefault( String i,int x, int y) {
        name=i;
        roll = x;
        marks =y;
        System.out.print(i+" "+ x +" " + y );
        System.out.println();  // Adding a newline for clarity
    }
 public  ConstructorDefault(ConstructorDefault original) {
        name = original.name;
        roll = original.roll;
        marks = original.marks;
        System.out.println("Copied: " + name + " " + roll + " " + marks);
    }
    

    public static void main(String args[]) {
        ConstructorDefault obj = new ConstructorDefault( "sss",111, 67);
        ConstructorDefault obj2 = new ConstructorDefault(obj);
       
    }
}*/

