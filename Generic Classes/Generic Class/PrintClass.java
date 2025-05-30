
public class PrintClass<E> { // Generic Class
	
	public void print(E[] array) {
		
		for(E e: array) {
			System.out.println(e);
		}
	}
}
