package ej5;

public class Ordenador {

	public static MySimpleLinkedList mezclarListas(MySimpleLinkedList a, MySimpleLinkedList b){
		MySimpleLinkedList m = new MySimpleLinkedList();
		for (int i = 0; i < a.getSize(); i++) {
			m.insertOrdenado(a.at(i).getData());	
		
		}
		for (int i = 0; i < b.getSize(); i++) {
			m.insertOrdenado(b.at(i).getData());		
		}
		return m;
	}
	
	
}
