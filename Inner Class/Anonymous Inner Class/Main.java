

public class Main {

	public static void main(String[] args) {
		
		IStudent student = new IStudent() {

			@Override
			public void study() {
				System.out.println("I am studying");
				
			}

			@Override
			public void attend_lecture() {
				System.out.println("I am attending lecture");
				
			}
		};
		
		student.study();
		student.attend_lecture();
		
		System.out.println("***********************");
		
		AStudent student2 = new AStudent("John Moin", 2408) {

			@Override
			void register() {
				System.out.println("Student is registering..");
				System.out.println("Name : " + getName());
				System.out.println("Number : " + getNumber());
			}
		};
		
		student2.register();
		student2.greeting();
		
	}
	public interface IStudent{
		void study();
		void attend_lecture();
	}
	
	public static abstract class AStudent{
		
		private String name;
		private int number;
		
		public AStudent(String name, int number) {
			this.name = name;
			this.number = number;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		
		abstract void register();
		
		public void greeting() {
			System.out.println("Hello");
		}
	}


}
