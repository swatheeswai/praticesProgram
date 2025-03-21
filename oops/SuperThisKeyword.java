class p{
    String s= "parent Variable";
}
class C extends P{
   String s ="child variable"; 
     public void m1();
     {
         System.out.println(s);
          System.out.println(this.s);
             System.out.println(super.s);
         
     }
}
class Super_this_keyword
{
	public static void main(String[] args) {
	    C c =new C(); 
	    c.m1();
	}
}
