public class Main {
    public static void main(String[] args) {
        String s1 = new String("you cannot change mee");
        String s2 = new String("you cannot change mee");
        System.out.println(s1 == s2); 

        String s3 = "you cannot change mee";
        System.out.println(s1 == s3); 

        String s4 = "you cannot change mee";
        System.out.println(s3 == s4); 

        String s5 = "you cannot" + "change mee";
        System.out.println(s3 == s5); 

        String s6 = "you cannot";
        String s7 = s6 + "change mee";
        System.out.println(s4 == s7); 

        final String s8 = "you cannot";
        String s9 = s8 + "change mee";
        System.out.println(s4 == s9); 
    }
}


