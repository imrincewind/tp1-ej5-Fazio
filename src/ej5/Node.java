package ej5;
public class Node {

	private int data;
	private Node next = null;

	
	public Node(int dt) {
		this.data = dt;
	}

	public void setNext(Node i) {
		next = i;
	}

	
	public int getData() {
		return this.data;
	}


	public Node getNext() {
		return next;
	}

	
	public int compareToInt(Node nodo) {
		if (this.data > nodo.getData())
			return 1;
		else if (this.data < nodo.getData())
			return -1;
		else
			return 0;
	}
	
}