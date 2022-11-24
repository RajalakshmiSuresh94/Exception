package ExceptionClass;

public class StringIndexProgram {
	public static void main(String[] args) {
		System.out.println("Start");
		String a = "Vimal";
		try {
		System.err.println(a.charAt(7));
		}
		catch(StringIndexOutOfBoundsException s) {
			System.err.println(s);
			//s.printStackTrace();
		}
	}

}
