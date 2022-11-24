package ExceptionClass;

public class CheckAge {
	public static void main(String[] args) throws AgeException {
		try{
			int age=20;
		
		if(age<18) {
			throw new AgeException("not Eligible");
		}
		else {
			System.out.println("Eligible");
		}
	}
	catch(AgeException ae) {
		ae.printStackTrace();
	}
		
	System.out.println("Sucess");
		
		
	}}
class AgeException extends Exception {
			public AgeException(String s ) {
				super(s);
			}
		}
		
	


