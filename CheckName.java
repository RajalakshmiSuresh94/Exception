package ExceptionClass;

public class CheckName {
	public static void main(String[] args) throws NameException{
		String s = "Rajalaksmi";
		try {
				if(s.length()>5) {
					throw new NameException("Longer than 5");
	}
	else {
		System.out.println("My name is Rajalakshmi");
	}}
		catch(NameException nm) {
		
			nm.printStackTrace();
			//System.out.println(nm);
		}

}}
class NameException extends Exception {
	public NameException(String n) {
		super(n);
	}
	public void printStackTrace() {
			System.out.println("Error");
		
	}
}
