import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
	
	public static void print_list(LinkedList<String> places_to_go) {
		ListIterator<String> iterator = places_to_go.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> places_to_go = new LinkedList<String>();
		
		
		
		places_to_go.add("School");
		places_to_go.add("Super Market");
		places_to_go.add("Library");
		places_to_go.add("Gym");
		places_to_go.add("Home");
		
		print_list(places_to_go);
		
		System.out.println("--------------------------------");
		
		places_to_go.add(4, "Shopping Center");
		places_to_go.remove(3);
		print_list(places_to_go);
		 
		
	}
	
	
	

}
