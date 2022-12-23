package doublyLinkedList;

public class DoublyCircularImpl {

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
		Book B5 = new Book(105, "Peaky Blinders", "Thomas shelby", 5000);
		Book B6 = new Book(106, "Friends", "Chandler Bing", 1500);
		
		DoublyCircularImpl D = new DoublyCircularImpl();
		D.addAtFirst(B1);
		D.addAtFirst(B2);
		D.addAtFirst(B3);
		D.addAtFirst(B4);
		D.addAtFirst(B5);
		D.addAtFirst(B6);
	//	D.addAtFirst(B1);
		D.Display();

	}

	public void addAtFirst(Book newBook) {
		if (head == null) {
			head = newBook;
			tail = newBook;
			tail.prev = newBook;
			tail.next = newBook;
			size++;
		}

		else {
			tail.next = newBook;
			newBook.prev = tail;
			head.prev = newBook;
			newBook.next = head;
			head = newBook;
			size++;
		}
	}

	public void addAtLast(Book newBook) {
		if (head == null) {
			head = newBook;
			tail = newBook;
			tail.prev = newBook;
			tail.next = newBook;
			size++;
		} else {
			newBook.next = head;
			head.prev = newBook;
			newBook.prev = tail;
			tail.next = newBook;
			tail = newBook;
			size++;
		}
	}

	public void addAtPost(Book newBook, int pos) {
		if (pos == 1) {
			addAtFirst(newBook);
		} else if (pos == size + 1) {
			addAtLast(newBook);
		} else {
			ptr1 = null;
			ptr = head;
			for (int i = 1; i < pos; i++) {
				ptr1 = ptr;
				ptr = ptr.next;

			}
			ptr.prev = newBook;
			newBook.next = ptr;
			ptr1.next = newBook;
			newBook.prev = ptr1;
			size++;

		}

	}
	
	public void Display()

	{	if(head == null)
		System.out.println("The list is alreday empty");
	else
	{
		ptr = head;
		
		while(ptr.next!=head)
		{
			ptr1 = ptr;
			System.out.println(ptr1.toString());
			
			ptr = ptr.next;
			
		}
		
		System.out.println(ptr.toString());
	}
		
		
	}
}
