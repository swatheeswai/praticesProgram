public class Logical1 {
    public static void main(String[] args) {

        int[] n = new int[4];
        

        n[0] = 1;
        n[1] = 1;
        

        for (int i = 2; i < n.length; i++) {

            n[i] = n[i-1] + n[i-2];
        }
        

        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println(); 
            }
}

