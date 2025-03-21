 public class Mletter{
 public static void main(String args[]){
  
 int count = 0;  
 int h =5;
        for(int i = 0; i < h; i++) {  
            System.out.printf("*");  
            for(int j = 0; j <= h; j++) {  
                if(j == h) {  
                    System.out.printf("*");  
                }else if(j == count || j == (h - count - 1)){  
                    System.out.printf("*");  
                }else {  
                    System.out.printf(" ");  
                }  
            }  
            if(count == h / 2) {  
                count = -10;  
            }else {  
                count = count + 1;  
            }  
            System.out.printf("\n");  
        }
        }
        }  

