package ReverseSingly;

public class linkedListImpl {

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

	public void reverse() {

		Employee ptr1 = head;

		Employee ptr2 = ptr1.next;
		Employee ptr3 = ptr2.next;

		ptr1.next = null;
		while (ptr3 != null) {

			ptr2.next = ptr1;
			ptr1 = ptr2;
			ptr2 = ptr3;
			ptr3 = ptr3.next;
		}
		ptr2.next = ptr1;

		head = ptr2;

	}

}
