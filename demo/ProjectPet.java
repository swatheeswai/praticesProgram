class pet{
   private String name;
   private String species;
   private int age;
pet(String name,String species,int age){
    this.name=name;
    this.species=species;
    this.age=age;
}
public String getName(){
  return this.name;
  }
public String getSpecies(){
 return this.species;
 }
public int getAge(){
    return this.age;
    }
public int calculateAge(){
    if(species.equals("dog")){
        return age*7;
        }
     else{
         return age;
         }
         }
public void Display(){
   System.out.println("Name:"+name);
   System.out.println("Species:"+species);
   System.out.println("Age:"+age);
   }
   }

class Dog extends pet{
   private String toy;
   
   Dog(String name,String species,int age,String toy){
         super(name,species,age);
          this.toy=toy;
         }
     
     @Override
     public void Display(){
     super.Display();
     System.out.println("pets favorite Toy"+toy);
     }
     }
     
 class Birds extends pet{
    private double wingspan;
    
    Birds(String name,String species,int age,double wingspan){
    super(name,species,age);
    this.wingspan=wingspan;
    }
    
    @Override
    public void Display(){
       super.Display();
       System.out.println("Brids Wingspan"+wingspan);
       }
       }
  class ProjectPet{
  public s tatic void main (String args[]){
    Dog d = new Dog("charli","dog",4,"ball");
  
   Birds b = new Birds("sparrow","Birds",3,0.3);
   System.out.println("Dog Details");
   d.Display();
   System.out.println("Age calculate:"+d.calculateAge());
   System.out.println("==========================================");
   System.out.println("Birds Details");
   b.Display();
   System.out.println("Age calculate:"+b.calculateAge());
   }
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
