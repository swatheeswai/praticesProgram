class program3{
public static void main(String args[]){
int sum=565;
int digit=0;
int add=0;
while(sum>0){
digit=sum%10;
add+=digit;
sum=sum/10;
}
System.out.println(add);
}
}
