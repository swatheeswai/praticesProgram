class user{
   private int id;
     public void setId(int id){
        if(id<100){
           this.id=id;
           }
        else{
        System.out.println("invalid input");
        }
        }
        public int getId(){
          return id;
          }
          }
 class encapsulation{
 public static void main(String args[]){
   user u = new user();
   u.setId(121);
   System.out.println("UserID"+" "+u.getId());
  
   }
   }
         
  
