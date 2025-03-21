class A  
{  
    public void msg()  
    {  
        System.out.println("Try it");  
    }  
}  
class PublicExample3 extends A {  
    public void msg()  
{  
    System.out.println("Try to access the overridden method");  
}  
public static void main(String[] args) {  
    PublicExample3 p=new PublicExample3();  
    p.msg();  
      
}  
} 
