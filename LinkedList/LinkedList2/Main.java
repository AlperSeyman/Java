import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void print_list(LinkedList<String> places_to_go) {
		
		ListIterator<String> iterator = places_to_go.listIterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public static void add_in_order(LinkedList<String> places_to_go, String new_place) {
		
		ListIterator<String> iterator = places_to_go.listIterator();
		
		while(iterator.hasNext()) {
			
			int compare = iterator.next().compareTo(new_place);  // return 0, 1 or -1. 
			
			if (compare == 0) {
				
				// two variables are equal
				System.out.println("LinkedList already have this variable");
				
				return;
			}
			
			else if (compare < 0) {
				
				// new_place is greater than iterator.next()
				
			} 
			
			else if (compare > 0) {
				
				// new_place is less than iterator.next()
				iterator.previous();
				iterator.add(new_place);
				
				return;
			}
		}
		places_to_go.add(new_place);
		
	}
	
	public static void main(String[] args) {
	
		LinkedList<String> places_to_go = new LinkedList<String>();
		
		add_in_order(places_to_go, "b");
		
		add_in_order(places_to_go, "d");
		
		add_in_order(places_to_go, "c");
		
		add_in_order(places_to_go, "a");
		
		print_list(places_to_go);
	}
	

}
