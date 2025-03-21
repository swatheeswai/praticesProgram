import java.util.*;
class Arraylist{
public static void main(String args[]){
String []a={"turkey","alphatrose","Angara","Istanbul"};
List<String> ab=Arrays.asList(a);
System.out.println(ab);
for(String element : ab){
System.out.println(element);
}
}
}            
