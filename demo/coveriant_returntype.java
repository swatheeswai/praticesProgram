class A{
    A get(){
  return this;
  }
 class B extends A{
    @Override
    B get(){
    return this;
    }
    void print(){
    System.out.println("B is get");
    }
  class coveriant_returntype{
  public static void main(String args[]){
  B b =new B();
  b.get().print();
  
 
