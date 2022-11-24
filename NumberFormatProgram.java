package ExceptionClass;

public class NumberFormatProgram {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
		String x="45Ball";
		System.out.println(Integer.parseInt(x));
		}
		catch(NumberFormatException n) {
			//System.out.println(n);
			n.printStackTrace();
		}
	}

}
