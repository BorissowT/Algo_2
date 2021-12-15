package app.lists;

public class SinglyLinkedList<T> implements IListable<T> {

	private Node head = null;
	
	private class Node {
		T data;
		Node next;
	}

	public void addFirst(T data) {
		// TODO Auto-generated method stub
		
	}

	public void insert(int index, T data) {
		// TODO Auto-generated method stub
		
	}

	public void set(int index, T data) {
		// TODO Auto-generated method stub
		
	}

	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}

	public T get(int index) {
		if ((head == null) || (index < 0) || (index >= size())) {
			return null;
			}
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
			}
		return temp.data;
	}

	public int size() {
		int counter = 0;
		Node temp = head;
		while (temp != null) {
			counter++;
			temp = temp.next;
			}
		return counter;
	}

	public void add(T data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public void addLast(T data) {
		add(data);
	}
	
	public void clear() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}		
	}

}
