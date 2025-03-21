class plane{
     void takeOff(){
         System.out.println("the plane are takeOff");
         }
     void fly(){
         System.out.println("the plane are flying");
         }
     void land(){
         System.out.println("the plane are landing");
         }
    }
 class CargoPlane extends plane{
         @Override
         void fly(){
             System.out.println("Cargoplane is fly a lower height");
             }
         void carry(){
             System.out.println("Cargoplane is carry a goods only");
             }
    }
 class PassengerPlane extends plane{
          @Override
           void fly(){
             System.out.println("Passengerplane is fly a  height");
             }
         void carry(){
             System.out.println("Passengerplane is carry a people only");
             }
   }
    class FighterPlane extends plane{
          @Override
           void fly(){
             System.out.println("figtherPlaneis fly a  height");
             }
         void carry(){
             System.out.println("FighterPlane is carry a missels weapean only");
             }
   }
 public class Inheritance{
   public static void main(String args[]){
        CargoPlane c =new CargoPlane ();
            c.takeOff();
            c.fly();
            c.carry();
	    c.land();
	PassengerPlane p1 =new PassengerPlane();
            p1.takeOff();
            p1.fly();
            p1.carry();
	    p1.land();
        FighterPlane f = new FighterPlane();
            f.takeOff();
            f.fly();
            f.carry();
	    f.land();
      }
 }
         
   
