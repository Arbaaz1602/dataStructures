package doublyLinkedList;

public class DoublyImpl {

	Book head = null;
	Book tail = null;
	Book ptr = null;
	Book ptr1 = null;
	Book ptr2 = null;
	static int size = 0;

	public static void main(String[] args) {

		Book B1 = new Book(101, "Two States", "Chetan Bhagat", 500);
		Book B2 = new Book(102, "Rich dada poor Dad", "Robert String", 800);
		Book B3 = new Book(103, "How i met You mother", "Ross", 1000);
		Book B4 = new Book(104, "Suits", "Mike Ross", 1200);
		Book B5 = new Book(101, "Peaky Blinders", "Thomas shelby", 5000);
		Book B6 = new Book(106, "Friends", "Chandler Bing", 1500);
		
		DoublyImpl D = new DoublyImpl();
		D.insertAtFirst(B1);
		D.insertAtFirst(B2);
		D.insertAtLast(B3);
		D.insertAtLast(B4);
		D.isertAtPosition(B5, 2);
		D.insertAtFirst(B6);
		D.display();
		D.removeDuplicates();
		D.display();

	}

//-----------------------------------------------------------------------------------------------------------------	
	public void insertAtFirst(Book newBook) {
		if (head == null) {
			System.out.println("Entering the first element");
			head = newBook;
			tail = newBook;
			head.prev = null;
			head.next = null;
			size++;

		}

		else {
			head.prev = newBook;
			newBook.next = head;
			head = newBook;
			System.out.println("Element added at the beginning");
			size++;

		}
	}
//----------------------------------------------------------------------------------------------------------------

	public void insertAtLast(Book newBook) {
		if (head == null) {
			System.out.println("Entering the first element");
			head = newBook;
			tail = newBook;
			head.prev = null;
			head.next = null;
			size++;

		} else {
			tail.next = newBook;
			newBook.prev = tail;
			tail = newBook;
			System.out.println("Element added at the last");
			size++;

		}
	}
	// -----------------------------------------------------------------------------------------------

	public void isertAtPosition(Book newBook, int pos) {
		if (head == null)
			insertAtFirst(newBook);
		else if (pos == size + 1)
			insertAtLast(newBook);
		else if (pos > size + 1)
			System.out.println("The position entered is incorrect");
		else {
			ptr = head;
			for (int i = 1; i < pos; i++) {
				ptr1 = ptr;
				ptr = ptr.next;

			}
			ptr1.next = newBook;
			newBook.prev = ptr1;
			newBook.next = ptr;
			ptr.prev = newBook;

			System.out.println("Element added");
			size++;

		}

	}

	// --------------------------------------------------------------------------------------------------

	public void deleteAtFirst() {
		if (head == null)
			System.out.println("The list is already empty");

		else {
			ptr = head.next;
			ptr.prev = null;
			head.next = null;
			head = ptr;
			System.out.println("Element deleted");
			size--;
		}
	}
	// ---------------------------------------------------------------------------------------------------

	public void deleteAtLast() {
		if (head == null)
			System.out.println("The list is already empty");

		else {
			ptr = head;
			while (ptr.next != tail) {
				tail.prev = null;
				ptr.next = null;
				tail = ptr;
				System.out.println("Element deleted from last");
				size--;
			}
		}
	}
	// -------------------------------------------------------------------------------------------------------

	public void deleteAtPosition(int pos) {
		if (pos == 1)
			deleteAtFirst();
		else if (pos == size)
			deleteAtLast();
		else {
			for (int i = 1; i < pos; i++) {
				ptr1 = ptr;
				ptr = ptr.next;

			}

			ptr2 = ptr.next;
			ptr.next = null;
			ptr.prev = null;
			ptr1.next = ptr2;
			ptr2.prev = ptr1;
			System.out.println("Element deleted from position " + pos);
			size--;
		}
	}

	// ------------------------------------------------------------------------------------------------------

	public void display() {
		if (head == null)
			System.out.println("The list is empty");
		else {
			ptr = head;
			while (ptr.next != null) {
				//System.out.println("Inside for loop");
				System.out.println(ptr.toString());
				ptr = ptr.next;
			}
			System.out.println(ptr.toString());
		}
	}

	// -----------------------------------------------------------------------------------------------

	public int getSize() {
		return size;
	}

	// ------------------------------------------------------------------------------

	public boolean isEmpty()
	{
		if(size == 0)
			return true;
		else
			return false;
	}
	//------------------------------------
	public void removeDuplicates()
	{
		Book ptrnew = head;
		Book ptr3 = null;
		System.out.println(ptrnew.toString());
		while(ptrnew!=null)
		{
			ptr3 = ptrnew;
			ptrnew = ptrnew.next;
			
			if(ptr3.getBookNo() == ptrnew.getBookNo())
			{
				ptr3.next = ptrnew.next;
				ptrnew.next.prev = ptr3;
				ptrnew.prev = null;
				ptrnew.next = null;
				ptrnew = ptr3.next;
				size--;
				
			}
		}
		
	}
}
