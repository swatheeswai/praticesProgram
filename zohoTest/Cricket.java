import java.util.Scanner;
class Cricket{
  public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       //System.out.println("Enter the value");
        
      String s[] = scan.nextLine().split(" ");
      int p1Score=0;
      int p2Score=0;
      int extras=0;
       
       boolean isP1batting=true;
      
       for(String event:s){
           switch(event){
             case "W":
                  extras += 1;
                  break;
             case "N":
                   extras +=1;
                   break;
             case ".":
                   break;
               default: 
                   int run = Integer.parseInt(event);
                   if(isP1batting){
                      p1Score= run;
                      }
                   else{
                       p2Score=run;
                       }
                    if(run%2!=0){4
                       isP1batting =!isP1batting;
                       }
                       break;
                     }
                   }
        System.out.println("P1 - " + p1Score);
        System.out.println("P2 - " + p2Score);
        System.out.println("Extras - " + extras);
    }
}

                      
                
