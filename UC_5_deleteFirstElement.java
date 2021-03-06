package LinkedList;

import java.util.LinkedList;

public class UC_5_deleteFirstElement {

	
	public static void main(String[] args) {
		// Creating object of the
		// class linked list
		LinkedList<Integer> ll = new LinkedList<Integer>();

		// Adding elements to the linked list
		ll.add(56);
		ll.add(70);
		ll.add(1, 30);

		// print the list
		System.out.println("LinkedList :: " + ll);

		// pop the list
		System.out.println("Pop element in the list :: " + ll.pop());

		// print the list
		System.out.println("LinkedList :: " + ll);
	}
}
