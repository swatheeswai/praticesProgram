 class mainMethedOverloaded {

    public static void main(String[] args) {
    int a =2;
    int b =3;
    int c =5;
    main(a,b);
    main(a,b,c);
    }
    public static void main(int a, int b) {
       System.out.println (a+b);
    }
    
    public static void main() {
       
    }
    
    public static void main(int a, int b, int c) {
       System.out.println (a+b+c);
    }
}

