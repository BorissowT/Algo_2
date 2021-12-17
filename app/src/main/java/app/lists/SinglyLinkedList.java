package app.lists;

import java.util.HashMap;

public class SinglyLinkedList<T> implements IListable<T> {

	private Node head = null;
	
	private class Node {
		T data;
		Node next;
	}

	public void addFirst(T data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			head = node;
			head.next = temp;
		}
	}

	public void insert(int index, T data) {
		Node node = new Node();
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
			node.next = temp;
		}
	}

	public void set(int index, T data) {
		// TODO Auto-generated method stub
		
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
			System.out.println(temp.data.toString());
			temp = temp.next;
		}		
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
		return returnData;
	}

	public void printElem(int index){
		System.out.println(get(index));
	}

}
