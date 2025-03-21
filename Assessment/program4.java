class program4{
public static void main (String args[]){
int min=3456789;
long result=60*24*365;
long year=(min/result);
int days=(int)(min/60/24)%365;
System.out.print(min+" "+year+" year"+" "+days+"days");
}
}
