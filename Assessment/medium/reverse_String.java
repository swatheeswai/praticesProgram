public class reverse_String {
    public static void main(String[] args) {
        char[] message = "Hello World!".toCharArray();
        System.out.println("Original message: " + String.valueOf(message));
        
        reverse(message, 0, message.length - 1);
        int start = 0;
        for (int end = 0; end <= message.length; end++) {
            if (end == message.length || message[end] == ' ') {
                reverse(message, start, end - 1);
                start = end + 1;
            }
        }
        
        System.out.println("Reversed message: " + String.valueOf(message));
    }
    
    private static void reverse(char[] message, int start, int end) {
        while (start < end) {
            char temp = message[start];
            message[start] = message[end];
            message[end] = temp;
            start++;
            end--;
        }
    }
}
