package ej5;

public class Main {

	public static void main(String[] args) {
		MySimpleLinkedList listaOrdenada1 = new MySimpleLinkedList();
		listaOrdenada1.insertElementAlPrincipio(1);
		listaOrdenada1.insertElementAlPrincipio(4);
		listaOrdenada1.insertElementAlPrincipio(6);
		listaOrdenada1.insertElementAlPrincipio(7);
		listaOrdenada1.insertElementAlPrincipio(10);
		
		MySimpleLinkedList listaOrdenada2 = new MySimpleLinkedList();
		listaOrdenada2.insertElementAlPrincipio(2);
		listaOrdenada2.insertElementAlPrincipio(3);
		listaOrdenada2.insertElementAlPrincipio(5);
		listaOrdenada2.insertElementAlPrincipio(8);
		listaOrdenada2.insertElementAlPrincipio(9);
		
		MySimpleLinkedList listaMezclada = Ordenador.mezclarListas(listaOrdenada1, listaOrdenada2);
		
		
		for (int i = 0; i < listaMezclada.getSize(); i++) {
			System.out.println(listaMezclada.at(i).getData());		
		}
		
		System.out.println("-----------------");
		
		
		
		MySimpleLinkedList listaDesordenada1 = new MySimpleLinkedList();
		listaDesordenada1.insertElementAlPrincipio(8);
		listaDesordenada1.insertElementAlPrincipio(3);
		listaDesordenada1.insertElementAlPrincipio(10);
		listaDesordenada1.insertElementAlPrincipio(15);
		listaDesordenada1.insertElementAlPrincipio(2);
		
		MySimpleLinkedList listaDesordenada2 = new MySimpleLinkedList();
		listaDesordenada2.insertElementAlPrincipio(9);
		listaDesordenada2.insertElementAlPrincipio(1);
		listaDesordenada2.insertElementAlPrincipio(14);
		listaDesordenada2.insertElementAlPrincipio(5);
		listaDesordenada2.insertElementAlPrincipio(7);
		
		MySimpleLinkedList listaMezclada2 = Ordenador.mezclarListas(listaDesordenada1, listaDesordenada2);
		for (int i = 0; i < listaMezclada2.getSize(); i++) {
			System.out.println(listaMezclada2.at(i).getData());		
		}
		
	}

}
