 /*Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. 
 *Implement the getArea() method for each of the three classes.
 *Creat interface name should be shape
 *inferface having one method
 *interface should implements in three classes
 *inside the interface methods override must be visiblity is high (public)
 */
 interface Shape{
   double getArea();
   }
class Rectangle implements Shape{
   private double length;
   private double width;

Rectangle(double length,double width){
   this.length=length;
   this.width=width;
   }
 
 @Override
 public double getArea(){
        return length*width;
    }
    }
 
class Circle implements Shape{
  private double radius;
 
 Circle(double radius){
     this.radius=radius;
     }
 
  @Override
 public double getArea(){
    return Math.PI*radius*radius;
    }
    }
    
 class Triangle implements Shape{
       private double base;
       private double height;
       
 Triangle(double base,double height){
       this.base=base;
       this.height=height;
       }
 @Override
 public double getArea(){
    return 0.5*base*height;
    }
    }
    
class InterfaceProject{
public static void main(String args[]){
    Shape rectangle = new Rectangle(2.2,3.3);
    Shape circle = new Circle(2.3);
    Shape triangle = new Triangle(5.2,1.2);
        System.out.println(rectangle.getArea());
         System.out.println(circle.getArea());
         System.out.println(triangle.getArea());
         }
         }
        
 
