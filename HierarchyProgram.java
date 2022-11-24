package ExceptionClass;

public class HierarchyProgram {
	public static void main(String[] args) {
		String s ="Hello Raji950";
		try {
			System.out.println(s.charAt(23));
		}
		catch(StringIndexOutOfBoundsException se) {
			se.printStackTrace();
			
		}
		catch(IndexOutOfBoundsException ie) {
			ie.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
