class customer{
   private int cId;
   private String cName;
   private int cNum;
   customer(){
   }
   customer(int cId, String cName, int cNum){
    this.cId=cId;
    this.cName=cName;
    this.cNum=cNum;
    }
   public int getCId(){
      return cId ;
      }
   public String getCName(){
      return cName ;
      }
   public int getCNum(){
      return cNum ;
      }
  }
  class cust{
  public static void main(String []args){
  customer c1 = new customer();
  System.out.println(c1.getCId());
  System.out.println(c1.getCName());
  System.out.println(c1.getCNum());
  customer c2 = new customer(002,"swathi",654432218);
  System.out.println(c2.getCId());
  System.out.println(c2.getCName());
  System.out.println(c2.getCNum());
  }
  }
    
