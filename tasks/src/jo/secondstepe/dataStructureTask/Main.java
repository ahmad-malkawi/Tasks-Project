package jo.secondstepe.dataStructureTask;

public class Main {

	public static void main(String[] args) {
		SSSArayList list = new SSSArayList();
		list.add(5);
		list.add(6);
		list.print();
		list.add(1, 7);
		list.print();
		list.remove(1);
		list.print();
		list.set(0, 4);
		list.print();
		list.clear();
		list.addFirst(11);
		list.print();
		list.add(3);
		list.add(5);
		list.add(6);
		list.print();
		System.out.println("the size l1: " + list.size());
		SSSArayList list2 = new SSSArayList();
		list2.add(25);
		list2.add(26);
		list2.add(27);
		System.out.println("the size l2: " + list2.size());
		list.addAll(1, list2);
		list.print();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------");
		SSSLinkedList llist = new SSSLinkedList();
		llist.add(5);
		llist.add(6);
		llist.print();
		llist.add(1, 7);
		llist.print();
		llist.remove(1);
		llist.print();
		llist.set(0, 4);
		llist.print();
		llist.clear();
		llist.addFirst(11);
		llist.print();
		llist.add(3);
		llist.add(5);
		llist.add(6);
		llist.print();
		System.out.println("the size l1: " + llist.size());
		SSSLinkedList llist2 = new SSSLinkedList();
		llist2.add(25);
		llist2.add(26);
		llist2.add(27);
		System.out.println("the size l2: " + llist2.size());
		llist.addAll(1, llist2);
		llist.print();
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------");
		
		llist.addAll(list);
		llist.print();


	}

}