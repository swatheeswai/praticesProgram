class Outer {
    void show() {
        System.out.println("Showing");
    }

    static void disp() {
                                              
       static  class Inner {
           static void display() {
                System.out.println("Displaying");
            }
        }

    }
}

public class local {
    public static void main(String[] args) {
        Outer out = new Outer(); 
        out.disp(); 
    }
}

