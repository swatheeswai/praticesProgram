//if suppose excption is occurs in catch block how to handle the code 
// try and catch block is invoke the catch block it will handle the exception
 
public class exception1
{
	public static void main(String[] args) {
		String s=null;
		try{
		 int length=s.length();
		 System.out.println(length);
		}
		catch(NullPointerException e){
		    
		  System.out.println("Exception Error:"+e);  
		  try{
		  System.out.println(10/0);
		  }
		  catch(ArithmeticException a){
		      System.out.println("exception Occurs:"+a.getMessage());
		  }
		  
		}
	}
}


//exception methods having 3 methods there
//1.printStrackTrace
//2.toString()
//3.getMessage()
//1st method printStrackTrace method they will giving a name of the discribtion and message and stack trace
public class Exception_1
{
	public static void main(String[] args) {
		String s=null;
		try{
		 int length=s.length();
		 System.out.println(length);
		}
		catch(NullPointerException e){
		  //System.out.println("Exception Error:"+e);  
		   e.printStackTrace();
		  try{
		  System.out.println(10/0);
		  }
		  catch(ArithmeticException a){
		      //System.out.println("exception Occurs:");
		       a.printStackTrace();
		  } 
		}
	}
//2 nd method is toString if you want a name of discription better to go for toString() or just print e bot are same
public class Exception_1
{
	public static void main(String[] args) {
		String s=null;
		try{
		 int length=s.length();
		 System.out.println(length);
		}
		catch(NullPointerException e){
		  System.out.println("Exception Error:"+e.toString()); 
		   System.out.println(e); 
		   //e.printStackTrace();
		  try{
		  System.out.println(10/0);
		  }
		  catch(ArithmeticException a){
		      //System.out.println("exception Occurs:"+a.toString());//both are same
		       System.out.println(a);               // both are same
		       //a.printStackTrace();
		  } 
		}
	}
	
// only a message or description wewill better to go for getmessage()
	public class Exception_1
{
	public static void main(String[] args) {
		String s=null;
		try{
		 int length=s.length();
		 System.out.println(length);
		}
		catch(NullPointerException e){
		  System.out.println("Exception Error:"+e.toString()); 
		   System.out.println(e); 
		   //e.printStackTrace();
		    System.out.println(e.getMessage()); 
		  try{
		  System.out.println(10/0);
		  }
		  catch(ArithmeticException a){
		      //System.out.println("exception Occurs:"+a.toString());//both are same
		       System.out.println(a);               // both are same
		       //a.printStackTrace();
		        System.out.println(a.getMessage());
		  } 
		}
	}
	}
	
// multiple catch block
public class Exception_1
{
	public static void main(String[] args) {
		String s=null;
		try{
		 int length=s.length();
		 System.out.println(length);
		}
		catch(exception e){
		System.out.println(e); 
		}
                 catch(NullPointerException e){
		  System.out.println("Exception Error:"+e);
		  }
		  }
		  } 
		
//finally block
public class Exception_1
{
	public static void main(String[] args) {
	    try{
	       System.out.println("try");
	       System.out.println(10/0);
    
	    }
         catch(NullPointerException a){
		     System.out.println("catch");
		  }
		 
		 finally{
		System.out.println("finally"); 
		}
		System.out.println("end");// if finally is only the excuted not remaining code is not excuted
		
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

