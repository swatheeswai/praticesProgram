import java.util.Scanner;
class month{
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of month:");
	int monthnumber = scan.nextInt();
	System.out.println("Enter the year:");
	int year = scan.nextInt();
	    String month="";
	    int day=0;
		switch(monthnumber){
			case 1:
			      month="January";
			      day =31;
			      break;
			case 2:
			      month="February";
			      if(year%4==0 && year%100!=0||year%400==0){
			      day =29;
			      }
			      else{
			      day = 28;
			      }
			      break;
			case 3:
			      month="March";
			      day =31;
			      break;      
			case 4:
			      month="Apirl";
			      day =30;
			      break;
			case 5:
			      month="May";
			      day =31;
			      break;
			      
			case 6:
			      month="June";
			      day =30;
			      break;   
			      
			case 7:
			      month="July";
			      day =31;
			      break;     
			      
			      
			case 8:
			      month="August";
			      day =31;
			      break;     
			      
			      
			case 9:
			      month="September";
			      day =30;
			      break;   
			      
			case 10:
			      month="October";
			      day =31;
			      break;    
			      
			      
			case 11:
			      month="November";
			      day =31;
			      break;     
			      
			      
			case 12:
			      month="December";
			      day =31;
			      break; 
			default:
			System.out.println("your month and years are unmatched");   
			     }

		System.out.println(month+ " " + year + " has " + day + " days");
			      
	}
	}
			      
			      
			      
