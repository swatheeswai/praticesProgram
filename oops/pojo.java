import java.util.Scanner;
class test1 {
	int x,y;
	test1() {
		x=100;
		y=200;
	}
	test1(int x,int y) {
                 //super();
		this.x=x;
		this.y=y;
	}
}
class test2 extends test1 {
	int a,b;
	test2() {
		a=300;
		b=400;
	}
	test2(int a, int b) {
		super(a,b);
		this.a=a;
		this.b=b;
	}
	void disp() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
}
class pojo {
	public static void main(String args[]) {
		test2 t = new test2(9,99);
		t.disp();
	}
}
