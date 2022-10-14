//Jisoo Kim 07/18/2022


//
//Class: Node
//
//Description:
//This class has information of the Nodes.
//It has accessors and mutators of value and next.
//
public class Node<E>{ //set as generic class
	private E value;
	private Node<E> next;

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public Node<E> getNext() {
		return next;
	}
	
	public void setNext(Node<E> next) {
		this.next = next;
	}

}