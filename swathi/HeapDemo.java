class HeapDemo{
public static void main(String args[]){
Runtime r = Runtime.getRuntime();
/*System.out.println("MaxMemory:"+r.maxMemory());
System.out.println("TotalMemory:"+r.totalMemory());
System.out.println("FreeMemory:"+r.freeMemory());
System.out.println("ConsumedMemory:"+ (r.totalMemory() - r.freeMemory()));*/


//IF CONVERT THE BYTE TO MB FORMATE
long mb = 1024*1024;

/*System.out.println("MaxMemory:"+r.maxMemory()/mb);
System.out.println("TotalMemory:"+r.totalMemory()/mb);
System.out.println("FreeMemory:"+r.freeMemory()/mb);
System.out.println("ConsumedMemory:"+ (r.totalMemory() - r.freeMemory())/mb);*/



//IF CONVERT THE DOUBLE FORMATE

//double mb = 1024*1024;
System.out.println("MaxMemory:"+r.maxMemory()/mb);
System.out.println("TotalMemory:"+r.totalMemory()/mb);
System.out.println("FreeMemory:"+r.freeMemory()/mb);
System.out.println("ConsumedMemory:"+ (r.totalMemory() - r.freeMemory())/mb);
}
}
