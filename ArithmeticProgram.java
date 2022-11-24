package ExceptionClass;

public class ArithmeticProgram {
	public static void main(String[] args) {
		System.out.println("Start");
		int a =12;
		int b=0;
		try {
		System.out.println(a/b);
		}
		catch(ArithmeticException x) {
			//System.out.println("Error");
			//System.out.println(x);
			x.printStackTrace();
		}
	System.out.println("End");
		
	}

}
