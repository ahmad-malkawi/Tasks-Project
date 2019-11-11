package jo.secondstepe.dataStructureTask;

public class SSSLinkedList implements SSSList {
	static class SSSNode {
		int value;
		SSSNode next;

		SSSNode() {
			this.value = 0;
		}

		SSSNode(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public SSSNode getNext() {
			return next;
		}

		public void setNext(SSSNode next) {
			this.next = next;
		}

	}

	private SSSNode head;
	private SSSNode last;
	private int size;

	SSSLinkedList() {
		head = null;
		last = null;
		size = 0;
	}

	@Override
	public void add(int element) {
		SSSNode newNode = new SSSNode(element);
		newNode.next = null;
		if (head == null && last == null) {
			size++;
			head = newNode;
			last = newNode;

		} else {
			size++;
			last.next = newNode;
			last = last.next;

		}
	}

	@Override
	public void add(int index, int element) {
		if (index >= 0 && index < size) {
			SSSNode newNode = new SSSNode(element);
			newNode.next = null;
			if (head == null && last == null) {
				size++;
				head = newNode;
				last = newNode;

			} else if (index == 0) {
				size++;
				newNode.next = head;
				head = newNode;

			} else {
				size++;
				SSSNode temp;
				temp = head;
				for (int i = 2; i <= index; i++) {
					temp = temp.next;
				}
				if (index != size - 1) {
					newNode.next = temp.next;
					temp.next = newNode;
				} else {
					last.next = newNode;
					last = last.next;
				}

			}
		} else {
			System.out.println("null pointer");
		}

	}

	@Override
	public void addFirst(int element) {
		if (size == 0) {
			add(element);
		} else {
			add(0, element);
		}

	}

	@Override
	public void addLast(int element) {
		add(element);

	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean contains(int element) {
		SSSNode temp;
		temp = head;
		while (temp != null) {
			if (temp.value == element) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	@Override
	public int get(int index) {
		if (index >= 0 && index < size) {
			SSSNode temp;
			temp = head;
			for (int i = 1; i <= index; i++) {
				temp = temp.next;
			}
			return temp.value;
		} else {
			return -1;
		}
	}

	@Override
	public void remove(int index) {
		if (index >= 0 && index <= size) {
			if (index == 0) {
				removeFirst();
			} else if (index == size - 1) {
				removeLast();
			} else {
				SSSNode temp, before;
				temp = head.next;
				before = head;
				index--;
				while (index-- != 0) {
					temp = temp.next;
					before = before.next;
				}
				before.next = temp.next;
				temp.next = null;
				size--;
			}
			if (size == 0) {
				head = null;
				last = null;
			}
		} else {

		}

	}

	@Override
	public void removeFirst() {
		SSSNode temp = head;
		head = temp.next;
		temp.next = null;
		size--;
		if (size == 0) {
			head = null;
			last = null;
		}
	}

	@Override
	public void removeLast() {
		SSSNode temp;
		temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		last = temp;
		temp.next = null;
		size--;
		if (size == 0) {
			head = null;
			last = null;
		}

	}

	@Override
	public void addAll(SSSList list) {
		int listSize = list.size();
		for (int i = 0; i < listSize; i++) {
			add(list.get(i));
		}
	}

	@Override
	public void addAll(int index, SSSList list) {
		if (index >= 0 && index < size) {
			int listSize = list.size();
			for (int i = 0; i < listSize; i++) {
				add(index++, list.get(i));
			}
		} else {

		}
	}

	@Override
	public int indexOf(int element) {
		SSSNode temp;
		temp = head;
		int index = 0;
		while (temp != null) {
			if (temp.value == element) {
				return index;
			}
			index++;
			temp = temp.next;
		}
		return -1;
	}

	@Override
	public void clear() {
		head = null;
		last = null;
		size = 0;

	}

	@Override
	public void set(int index, int element) {
		if (index >= 0 && index < size) {
			SSSNode temp;
			temp = head;
			while (index-- != 0) {
				temp = temp.next;
			}
			temp.value = element;
		} else {

		}
	}

	@Override
	public void print() {
		SSSNode temp = head;
		System.out.print("the Linked List is: ");
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
		System.out.println("");
	}

}
