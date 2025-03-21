import java.util.Scanner;
class program7{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
	System.out.println("Enter the  Distance Meter:");
	double distance=scan.nextDouble();
        
        System.out.println("Enter the Hour:");
        int hour=scan.nextInt();
        
        System.out.println("Enter the Minutes:");
        int minutes=scan.nextInt();
        
        System.out.println("Enter the Seconds:");
        int second=scan.nextInt();
        
        double time = (hour*3600+minutes*60+second);
        
        double speed = (distance/time);
        
        double perhour = (distance/1000)/(time/3600);
        
        double miles = (distance/1609.0)/(time/3600);
        
        System.out.println("Your speed in meters/second is:"+" "+speed);
        System.out.println("Your speed in km/h is:" + " "+ perhour);
        System.out.println("Your speed in miles/h is:"+ " " + speed);
        }
        }
