package ExceptionClass;

public class ArrayIndexProgram {
	public static void main(String[] args) {
		System.out.println("Start");
		int  [] a= {10,20,30};
		//int b =
		try {
		System.out.println(a[3]);
		}
		/*catch(ArrayIndexOutOfBoundsException x) {
			//System.out.println(x);
			x.printStackTrace();
		}*/
		finally{
			System.out.println("End");
		}
		}
	}


