package app.lists;

public class DoublyLinkedList<T> implements IListable<T> {

	private Node head;
	private Node tail;
	
	private class Node {
		T data;
		Node next;
		Node prev;
	}
	
	public void clear() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return head == null && tail == null;
	}

	
	public void add(T data) {
		// TODO Auto-generated method stub
		
	}

	public void addLast(T data) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		return null;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void print() {
		// TODO Auto-generated method stub
		
	}

}
