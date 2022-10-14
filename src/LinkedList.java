//Jisoo Kim 07/18/2022

//
//Class: LinkedList
//
//Description:
//This class is have the methods to run the program.
//It had the methods to make it as a linked list, and other methods for the program.
//Such as, addEnd(), deleteOne(), searchDelete(), toString()...etc.
//
public class LinkedList<T> {
	private Node<T> head;

	/* addEnd() (to add the value into the end of the linked list)
	 * input : value
	 * output : none
	 * return : true if there is a value, set as a value in the link node
	 * */
	public boolean addEnd(T val) {
		Node<T> newNode = new Node<T>();

		if (head == null) {		
			//if there is one node, just set as a newNode
			newNode.setValue(val);
			newNode.setNext(head);
			head = newNode;
		
		} else {
			//if the nodes are in the list, set newNode next to curNode
			Node<T> curNode = head;
			
			while (curNode.getNext() != null) {		
				curNode = curNode.getNext();	
			}
			curNode.setNext(newNode); //set the new value next to curNode
			newNode.setValue(val);
			
		}
		return true;
		
	}

	
	
	/* searchDelete() (to find the last element in the linked list)
	 * input : node
	 * output : none
	 * return : true if there is a node that is in the last node
	 * */
	public boolean searchDelete() { 
		Node<T> t = head;
		Node<T> prev = null;
		
		while (t != null) {
			if(t.getNext() == null) {  //search the last element in the linked list 
				prev.setNext(t.getNext());
			}
			prev = t;
			t = t.getNext();
		}
		return true;
	}
	
	/* deleteOne() (deletes the value in the list)
	 * input : value
	 * output : none
	 * return : true if there's the same value in the node, and delete it.
	 * */
	public boolean deleteOne(T val) { 
		Node<T> cur = head;
		Node<T> prev = null;
		
		while (cur != null) {
			
			if (cur.getValue().equals(val)) {
				if(prev == null) {
					//if there are no nodes in the list
					head = head.getNext();
					return true;
				}
				//delete the node that equals to the value
				prev.setNext(cur.getNext());
				return true;
			}
			prev = cur;
			cur = cur.getNext();
			
		}
		return false;
	}
	
	/* toString()  (show the linked list into String)
	 * input : node
	 * output : String
	 * return : true if the node exists
	 * */	
	public String toString() {
		String rtn = "";
		Node<T> tmp = head;
		
		while (tmp != null) {
				rtn += tmp.getValue() + " -> " ;
				tmp = tmp.getNext();
				
		}
		if (tmp == null) { //if the list is empty
			System.out.println("<Empty list>");
		} 

		return rtn;
		}

}
