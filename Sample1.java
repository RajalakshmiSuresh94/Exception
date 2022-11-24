package ExceptionClass;

public class Sample1 {
	public static void main(String[] args) {
		System.out.println("Start");
		int a =10;
		int b=0;
		try {
		int c=a/b;
		System.out.println(c);
		}
		finally {
			System.out.println("Success");
		}
	}
}
