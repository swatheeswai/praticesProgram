import java.util.Scanner;
interface traffic{
   void displayLight();
   void duration_time();
   }
class trafficLight implements traffic{
     private String color;
     private int duration;
  trafficLight(int duration){
      this.duration=duration;
      }
   public void setColor(String color){
      this.color=color;
      }
   public void setDuration(int duration){
      this.duration=duration;
      }
    public String getColor(){
      return color;
      }
    public int getDuration(){
      return duration;
      }
       @Override
    public void displayLight() {
        System.out.println("Traffic Light Color: " );
    }
    @Override
    public void duration_time(){
        if(duration>=10 && duration<=30){
           System.out.println("Red");
           }
           
       else if(duration>=30 && duration<=70){
           System.out.println("green");
           }
        else{
                System.out.println("yellow");
           }
        }
   }
public class ProjectTrafficLight{
   public static void main(String args[]){
   Scanner scan = new Scanner(System.in);
      System.out.println("Enter the durationTime");
      int duration=scan.nextInt();
        trafficLight tf= new trafficLight(duration);
        tf.displayLight();
        tf.duration_time();
        }
        }
       
           
    
      
