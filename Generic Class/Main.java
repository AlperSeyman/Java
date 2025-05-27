
public class Main {

	public static void main(String[] args) {
		
			Character[] char_array = {'J','A','V','A'};
			
			Integer[] integer_array = {1,2,3,4,5,6};
			
			String[] string_array = {"Java","Python","GoLang"};
			
			Student[] student_array = {new Student("Alice"),new Student("Bob"), new Student("John")};
			
			
			
			System.out.println("Generic Class");
			System.out.println("**********************");
			
			PrintClass<Character> char_print = new PrintClass<Character>();
			PrintClass<Integer> int_print = new PrintClass<Integer>();
			PrintClass<String> string_print = new PrintClass<String>();
			PrintClass<Student> student = new PrintClass<Student>(); 
			
			char_print.print(char_array);
			System.out.println("**********************");
			int_print.print(integer_array);
			System.out.println("**********************");
			string_print.print(string_array);
			System.out.println("**********************");
			student.print(student_array);
			
	}
}
