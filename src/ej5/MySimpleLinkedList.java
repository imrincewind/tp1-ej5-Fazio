package ej5;

public class MySimpleLinkedList {
	protected Node first;
	private Node last;
	private int size = 0;

	public MySimpleLinkedList() {
		first = null;

	}
	
	public void insert(Integer i) {

		Node nodo = new Node(i);
		if (first == null) {
			first = nodo;
			last = first;
		} else {
			last.setNext(nodo);
			last = nodo; 
		}
		size++;
	}

	public void insertOrdenado(Integer i) {

		Node nodo = new Node(i);
		if (first == null) {
			first = nodo;
			last = nodo;
		} else {
			if (first.getData() > i) {
				nodo.setNext(first);
				first = nodo;
			} else {
				Node nodoActual = first;
				Node nodoAnterior = first;
				while ((nodoActual.getNext() != null) && (nodoActual.getData() < i)) {
					nodoAnterior = nodoActual;
					nodoActual = nodoActual.getNext();
				}
				if (nodoActual.getData() < nodo.getData()){
					last.setNext(nodo);
					last = nodo;
				
					
				}else{
					nodo.setNext(nodoActual);
					nodoAnterior.setNext(nodo);	
				}
				
				
			}
		}
		size++;
	}
	public void insertOrdenadoDuplicado(Integer i) {

		Node nodo = new Node(i);
		if (first == null) {
			first = nodo;
			last = nodo;
		} else {
			if (first.getData() > i) {
				nodo.setNext(first);
				first = nodo;
			} else {
				Node nodoActual = first;
				Node nodoAnterior = first;
				while ((nodoActual.getNext() != null) && (nodoActual.getData() < i)) {
					nodoAnterior = nodoActual;
					nodoActual = nodoActual.getNext();
				}
				if (nodoActual.getData() < nodo.getData()){
					last.setNext(nodo);
					last = nodo;
				
					
				}else{
					nodo.setNext(nodoActual);
					nodoAnterior.setNext(nodo);	
				}
				
				
			}
		}
		size++;
	}
	
	// ELIMINA UN NODO POR POSICION, Y VINCULA EL ANTERIOR CON EL SIGUIENTE
	public void deleteElement(int pos) {
		// Node tmp;
		if (size - 1 > pos && first == null) {
		
		} else if (pos == 0) { // Si borro el primero de la lista, el segundo se
								// vuelve el primero
			first = first.getNext();
			size--;
		} else {
			if (size > pos || first == null) {
				Node nodo = at(pos - 1);
				if (nodo != null) {
					nodo.setNext(nodo.getNext().getNext());
					size--;
				}
			}
			
		}

	}

	public Node at(int pos) {
		Node nodo = null;
		if (size < pos - 1 || first == null) {
			return null;
		} else if (pos == 0) {
			return first;
		} else {
			nodo = first;
			for (int i = 0; i < pos; i++) {
				nodo = nodo.getNext();
			}
		}
		return nodo;
	}

	public int getSize() {
		return size;
	}
	
	public void insertElementAlPrincipio(int i){
		Node nodo = new Node(i);
		nodo.setNext(first);
		first = nodo;
		if (size == 0 ){
			last = nodo;
		}
		size++;
	}
	
	public int getMax(){
		int maximo = 0;
		int pos = 0;
		
		for(int i=0; i<size; i++){
			Node nodo = at(i);
			if(maximo<nodo.getData()){
				maximo = nodo.getData();
				pos = i;
			}
			
		}
		return pos;
	}
	
	public void sortByNro(){
		Node nodoActual = first;
		Node nodoTemp;
		Node nodoSig;
		
		for(int i = 0; i < size-1; i++){
			for(int j = 0; j < size-i-1; j++){
				nodoSig = nodoActual.getNext();
				if(nodoActual.compareToInt(nodoSig) > 0){
					nodoTemp = nodoSig;
					nodoActual.setNext(nodoSig.getNext());
					nodoSig.setNext(nodoTemp);
					nodoActual.setNext(nodoSig);
				}
			}
			nodoActual = nodoActual.getNext();
		}
		
	

	}
		
	
	
	
	public void printListRecursivo(Node nodo){
		if(nodo != null){
			System.out.println(nodo.getData());
			if(nodo.getNext() != null){
				this.printListRecursivo(nodo.getNext());
			}
		}
	}

	
}