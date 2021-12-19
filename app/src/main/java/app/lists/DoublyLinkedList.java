
package app.lists;

import app.data.Student;

public class DoublyLinkedList<T> implements IListable<T> {
	private int counter = 0;
	private DoublyLinkedList<T>.Node head = null;
	private DoublyLinkedList<T>.Node tail = null;
	private T data;

	public DoublyLinkedList() {
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

	public void searchByName(String name){
		Node temp = head;
		while (temp != null) {
			if(getHashedStudent(temp.data.toString())[0].equals(name)){
				System.out.println(temp.data);
				return;
			}
			temp = temp.next;
		}
		System.out.println("not found!");
	}

	public boolean isEmpty() {
		return this.head == null && this.tail == null;
	}

	public void add(T data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.prev = null;

		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
			node.prev = temp;
		}
	}

	public void addFirst(T data) {
		Node node = new Node();
		node.data = data;
		node.prev = null;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			head = node;
			head.next = temp;
			temp.prev = head;
		}
	}

	public void addLast(T data) {
		this.add(data);
	}

	public void insert(int index, T data) {
		Node node = new Node();
		node.data = data;
		Node temp = new Node();
		if (head == null) {
			head = node;
		} else {
			Node prev = head;
			for (int i = 0; i < index-1; i++) {
				prev = prev.next;
			}
			temp = prev.next;
			prev.next = node;
			node.prev = prev;
			node.next = temp;
		}
	}

	public void set(int index, T data) {
		Node node = new Node();
		Node temp = new Node();
		node.data = data;
		if ((head == null) || (index == 0)) {
			temp = head.next;
			head = node;
			head.next = temp;
			head.prev = null;
			return;
		}
		Node prev = head;
		for (int i = 0; i < index-1; i++) {
			prev = prev.next;
		}
		if(prev.next.next == null){
			prev.next = node;
			node.prev = prev;
		}
		else{
			temp = prev.next.next;
			prev.next = node;
			node.next = temp;
			temp.prev = node;
		}
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

	public void remove(int index) {
		if ((head == null) || (index < 0) || (index >= size())) {
			return;
		}
		Node prev = head;
		for (int i = 0; i < index-1; i++) {
			prev = prev.next;
		}
		Node temp = prev.next;
		prev.next = temp.next;
		temp.next.prev = prev;
	}

	public void searchByLastname(String lastname){
		Node temp = head;
		while (temp != null) {
			if(getHashedStudent(temp.data.toString())[1].equals(lastname)){
				System.out.println(temp.data);
				return;
			}
			temp = temp.next;
		}
		System.out.println("not found!");
	}

	public void searchByCourse(int course){
		Node temp = head;
		while (temp != null) {
			if(getHashedStudent(temp.data.toString())[2].equals(Integer.toString(course))){
				System.out.println(temp.data);
				return;
			}
			temp = temp.next;
		}
		System.out.println("not found!");
	}

	public void searchByMNumber(int number){
		Node temp = head;
		while (temp != null) {
			if(getHashedStudent(temp.data.toString())[3].equals(Integer.toString(number))){
				System.out.println(temp.data);
				return;
			}
			temp = temp.next;
		}
		System.out.println("not found!");
	}

	public String[] getHashedStudent(String data){
		String[] newData = data.split(", ");
		String[] returnData = new String[4];
		for(int i=0; i < newData.length; i++){
			returnData[i] = newData[i].split("=")[1];
			if(newData[i].endsWith("]")){
				returnData[i] = returnData[i].substring(0, returnData[i].length() - 1);
			}
		}
		for(String elem:returnData){
			System.out.println(elem);
		}
		return returnData;
	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void clear() {
		this.head = null;
		this.tail = null;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("List: " + System.lineSeparator());

		for(Node temp = this.head; temp != null; temp = temp.next) {
			builder.append(" " + temp.data + System.lineSeparator());
		}

		return builder.toString();
	}

	private class Node {
		T data;
		DoublyLinkedList<T>.Node next;
		DoublyLinkedList<T>.Node prev;
	}

	public void printElem(int index){
		System.out.println(get(index));
	}
}
