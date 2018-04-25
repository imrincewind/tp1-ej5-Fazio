package ej5;

public class Ordenador {

	public static MySimpleLinkedList mezclarListas(MySimpleLinkedList a, MySimpleLinkedList b){
		MySimpleLinkedList m = new MySimpleLinkedList();
		MySimpleLinkedList fin = new MySimpleLinkedList();
		for (int i = 0; i < a.getSize(); i++) {
			m.insertOrdenado(a.at(i).getData());	
		
		}
		for (int i = 0; i < b.getSize(); i++) {
			boolean insert = false;
			for (int j = 0; j < m.getSize(); j++) {
				if(m.at(j).getData() == b.at(i).getData()){
					insert = true;
				}
			}
			if (insert == true){
			fin.insertOrdenado(b.at(i).getData());	
			insert = false;
			}
		}
		return fin;
	}
	
	
}
