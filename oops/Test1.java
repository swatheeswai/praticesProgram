class Test1{
Test1(double d)
	{
		this(10);
		System.out.println("Double args Constructor");
	}

Test1(int  i)
	{
		this();
		System.out.println("Int args Constructor");
	}

Test1()
	{
		
		System.out.println("No args Constructor");
	}


public static void main(String args[]){
	Test1 t1 = new Test1(10.0);
	System.out.println();
	//Test1 t2 = new Test1(10);
	//Test1 t2 = new Test1();
	}
	}
