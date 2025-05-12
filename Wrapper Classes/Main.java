

// Wrapper Classes = Allow primitive values(int, char, double, boolean)
//                   to be used as objects. "Wrap them in an object".
//                   Generally, don't wrap primitives unless you need an object.
//                   Allows use of Collections Framework and static Utility Methods

public class Main {

	public static void main(String[] args) {
		
		
		// Autoboxing
		Integer a = 4;
		Double b = 3.14;
		Character c = '$';
		Boolean d = false;
		
		
		// Unboxing
		int x = a;
		double y = b;
		char z = c;
		boolean t = d;
		
		
		String i = Integer.toString(123);
		String k = Double.toString(3.14);
		String l = Character.toString('@');
		String m = Boolean.toString(false);
		
		
		
		
	}

}
