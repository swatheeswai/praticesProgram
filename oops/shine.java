abstract class bike{
	abstract void run();
	}
 class shine extends bike{
      @Override
      void run(){
      System.out.println("running speed");
      }
public static void main(String[] args){
	bike b =new shine();
	b.run();
	}
	}
