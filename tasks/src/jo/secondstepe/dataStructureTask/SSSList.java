package jo.secondstepe.dataStructureTask;

public interface SSSList {
	void add(int element);

	void add(int index, int element);

	void addFirst(int element);

	void addLast(int element);

	int size();

	boolean contains(int element);

	int get(int index);

	void remove(int index);

	void removeFirst();

	void removeLast();

	void addAll(SSSList list);

	void addAll(int index, SSSList list);

	int indexOf(int element);

	void clear();

	void set(int index, int element);

	void print();
}
