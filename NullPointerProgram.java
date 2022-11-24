package ExceptionClass;

public class NullPointerProgram {
	public static void main(String[] args) {
		System.out.println("Start");
		String a= null;
		try {
		char b=a.charAt(2);
		System.out.println(b);
		}
		catch(NullPointerException n) {
			//System.out.println(n);
			//n.printStackTrace();
			System.out.println("Error");
		}
		System.out.println("End");
		
	}

}
