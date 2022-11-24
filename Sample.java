package ExceptionClass;

public class Sample {
	public static void main(String[] args) {
		System.out.println("Start");
		int a =10;
		int b=0;
		//try {
		int c=a/b;
		System.out.println(c);
		/*}
		catch(Exception e) {
			//System.out.println("Error occurs");
			//System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("Success");
		}*/
		System.out.println("End");
	}

}
