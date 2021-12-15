
package app.lists;

public class DoublyLinkedList<T> implements IListable<T> {
	private int counter = 0;
	private DoublyLinkedList<T>.Node head = null;
	private DoublyLinkedList<T>.Node tail = null;

	public DoublyLinkedList() {
	}

	public int size() {
		return this.counter;
	}

	public boolean isEmpty() {
		return this.head == null && this.tail == null;
	}

	public void add(T data) {
	}

	public void addFirst(T data) {
	}

	public void addLast(T data) {
		this.add(data);
	}

	public void insert(int index, T data) {
	}

	public void set(int index, T data) {
	}

	public T get(int index) {
		return null;
	}

	public void remove(int index) {
	}

	public void print() {
	}

	public void clear() {
		this.head = null;
		this.tail = null;
		this.counter = 0;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("List: " + System.lineSeparator());

		for(DoublyLinkedList.Node temp = this.head; temp != null; temp = temp.next) {
			builder.append(" " + temp.data + System.lineSeparator());
		}

		return builder.toString();
	}

	private class Node {
		T data;
		DoublyLinkedList<T>.Node next;
		DoublyLinkedList<T>.Node prev;

		private Node() {
		}
	}
}
