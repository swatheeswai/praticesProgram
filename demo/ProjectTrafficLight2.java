class trafficLight{
     private String color;
     private int duration;
  trafficLight(String color,int duration){
      this.color=color;
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
    public boolean isRed(){
       return color.equals("Red");
       }
    public boolean isgreen(){
       return color.equals("green");
       }
    }
 class ProjectTrafficLight2{
 public static void main(String args[]){
    trafficLight tr= new trafficLight("Red",70);
    System.out.println("traffic color"+tr.isRed());
     System.out.println("traffic color"+tr.isgreen());
     System.out.println("traffic duration"+tr.getDuration());
      System.out.println("--------------------------------------------");
        trafficLight tf= new trafficLight("green",50);
    System.out.println("traffic color"+tf.isRed());
     System.out.println("traffic color"+tf.isgreen());
     System.out.println("traffic duration"+tf.getDuration());
     }
     }
      
    
     
