class Exception1 {
  //static ArithmeticException e= new ArithmeticException();
  static ArithmeticException e;
  public static void main(String args[]){
      throw e;
      }
      }
  //  o/p
   // Exception in thread "main" java.lang.ArithmeticException
	//at Exception1.<clinit>(Exception1.java:2)

