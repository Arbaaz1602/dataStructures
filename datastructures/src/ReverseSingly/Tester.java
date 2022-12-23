package ReverseSingly;

public class Tester {

	public static void main(String[] args) {

		//creating an object of implementation class
		linkedListImpl list = new linkedListImpl();
		
		//creating employees of type Employee
		Employee E1 = new Employee(100, "Arbaaz", "Developement", 50000);
		Employee E2 = new Employee(101, "Arbaaz", "Developement", 50000);
		Employee E3 = new Employee(102, "Arbaaz", "Developement", 50000);
		Employee E4 = new Employee(103, "Arbaaz", "Developement", 50000);
		Employee E5 = new Employee(104, "Arbaaz", "Developement", 50000);
		
		list.insertEmployee(E1);
		list.insertEmployee(E2);
		list.insertEmployee(E3);
		list.insertEmployee(E4);
		list.insertEmployee(E5);
		
		list.display();
		
		list.reverse();
		System.out.println();
		list.display();

	}

}
