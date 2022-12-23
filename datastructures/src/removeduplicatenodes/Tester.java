package removeduplicatenodes;

public class Tester {

	public static void main(String[] args) {

		//creating an object of implementation class
		duplicateremovalImpl list = new duplicateremovalImpl();
		
		//creating employees of type Employee
		Employee E1 = new Employee(100, "Arbaaz", "Developement", 50000);
		Employee E2 = new Employee(101, "Adnan", "Production", 45000);
		Employee E3 = new Employee(101, "Umer", "Testing", 40000);
		Employee E4 = new Employee(103, "Omkar", "Developement", 80000);
		Employee E5 = new Employee(104, "Rushi", "Editing", 20000);
		
		list.insertEmployee(E1);
		list.insertEmployee(E2);
		list.insertEmployee(E3);
		list.insertEmployee(E4);
		list.insertEmployee(E5);
		
		list.display();
		
		list.removeDuplicates();
		
		System.out.println();
		
		list.display();
		
		

	}

}
