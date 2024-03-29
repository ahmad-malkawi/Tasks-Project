package jo.secondstepe.dataStructureTask;

public class SSSArayList implements SSSList {
	private int[] array;
	private int capacity;
	private int size;

	SSSArayList() {
		capacity = 10;
		array = new int[capacity];
		size = 0;
	}

	private int[] increaseCapacity() {
		capacity += Math.ceil(capacity / 2.0);
		int[] temp = new int[capacity];
		for (int i = 0; i < size; i++) {
			temp[i] = array[i];
		}
		return temp;
	}

	private int[] decreaseCapacity() {
		capacity -= Math.floor(capacity / 2.0);
		int[] temp = new int[capacity];
		for (int i = 0; i < size; i++) {
			temp[i] = array[i];
		}
		return temp;
	}

	@Override
	public void add(int element) {
		size++;	
		if (size == capacity) {
			array = increaseCapacity();
		}
		array[size - 1] = element;
	}

	@Override
	public void add(int index, int element) {
		if (index >= 0 && index <= size) {
			if (size == capacity) {
				array = increaseCapacity();
			}
			for (int i = size; i > index; i--) {
				array[i] = array[i - 1];
			}
			array[index] = element;
			size++;
		} else {
			System.out.println("null pointer");
		}
	}

	@Override
	public void addFirst(int element) {
		add(0, element);

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
		for (int i = 0; i < size - 1; i++) {
			if (array[i] == element) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int get(int index) {
		if (index >= 0 && index < size) {
			return array[index];
		}
		return -999999999;
	}

	@Override
	public void remove(int index) {
		if (index >= 0 && index < size) {
			for (int i = index; i < size - 1; i++) {
				array[i] = array[i + 1];
			}
			size--;
			if (size == Math.floor(capacity / 2)) {
				array = decreaseCapacity();
			}
		}
	}

	@Override
	public void removeFirst() {
		remove(0);
	}

	@Override
	public void removeLast() {
		remove(size - 1);

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
		for (int i = 0; i < size; i++) {
			if (array[i] == element) {
				return i;
			}
		}
		return -999999;
	}

	@Override
	public void clear() {
		capacity = 10;
		array = new int[capacity];
		size = 0;
	}

	@Override
	public void set(int index, int element) {
		if (index >= 0 && index < size) {
			array[index]=element;
		}else {
			
		}

	}

	@Override
	public void print() {
		System.out.print("the Array List is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println(" ");

	}

}
