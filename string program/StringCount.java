class StringCount {
    public static void main(String args[]) {
        String s[] = {"Ant", "cat", "dog"};
        int count = 0;  

        
        for (int i = 0; i < s.length; i++) {
     
            System.out.println("String Index length"+i+"\nString value length"+s.length);//length of string value
            for (int j = 0; j < s[i].length(); j++) {
                
                count += (int) s[i].charAt(j);
            }
        }

        
        System.out.println(count);  // Output the total ASCII value
    }
}

