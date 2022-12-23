package removeduplicatenodes;

public class duplicateremovalImpl {

	Employee head;
	Employee tail;
	int size = 0;

	public void insertEmployee(Employee newEmployee) {
		if (size == 0) {
			head = newEmployee;
			tail = newEmployee;
			size++;
		} else {
			tail.next = newEmployee;
			tail = newEmployee;
			size++;

		}
	}

	public void display() {

		Employee ptr = head;
		while (ptr != null) {
			System.out.println(ptr);
			ptr = ptr.next;
		}
	}

	public void removeDuplicates() {
		Employee uniqueEmployee[] = new Employee[size];
		Employee defaultEmp = new Employee();
		for (int i = 0; i < uniqueEmployee.length; i++)
			uniqueEmployee[i] = defaultEmp;

		// iterating over the linkedlist
		// we will have to check the array after every iteration so that duplicates can
		// be identified
		int k = 0;
		Employee ptr = head;
		Employee ptr1 = null;
		while (ptr != null) {

			int j = 0;
			for (int i = 0; i < uniqueEmployee.length; i++) {
				if (ptr.getEmpid() == uniqueEmployee[i].getEmpid()) {
					// the code to remove the duplicate
					ptr1.next = ptr.next;
					ptr1 = ptr.next;
					ptr.next = null;
					ptr = ptr1;
					j++;
				}
			}
			if (j == 0) {
				// we have to add this employee in the array
				uniqueEmployee[k++] = new Employee(ptr.getEmpid(), ptr.getEmpName(), ptr.getEmpDept(),
						ptr.getEmpSalary());
				}

			ptr1 = ptr;
			ptr = ptr.next;

		}

	}

}
