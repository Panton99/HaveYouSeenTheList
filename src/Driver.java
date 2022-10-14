//Jisoo Kim 07/18/2022
import java.util.InputMismatchException;
import java.util.Scanner;

//---------------------------------------------------------------------------
//
//Have you seen link?
//This program reads the input from the user and inserts the value into a Linked List.
//
//Author: Jisoo Kim
//Date: 07/18/2022
//Class: MET CS342
//Issues: None known
//
//Description:
//This program gets the input from the user and inserts the value in the end of the linked list.
//It is based on generic linked application so that user can easily change the input as an integer or string.
//Lastly, the last element in the linked list is deleted by scanning. 
//
//Assumptions:
//The program will make the linked list as follows.
//____________________________________________________________________________

//
//Class: Driver
//
//Description:
//This is the main class that runs the program. 
//It runs the methods in the LinkedList.class.
//

public class Driver {

	public static void main(String[] args) {
		Driver me = new Driver();
		me.integerInput();
		me.stringInput();
	}

	private void integerInput() {
		LinkedList<Integer> link = new LinkedList<Integer>();
		int val;
		Scanner scan = new Scanner(System.in);
		
		try {	
			boolean exit = true;
			while (exit) {
				
				System.out.println("\nType integer (exit: enter 342 (this number is not in the list) )");
				val = scan.nextInt();
				link.addEnd(val);
				
				if (val == 342) {
					link.deleteOne(342);
					exit = false;
					
				}
			}
			
			System.out.println("\nThis is your list :");
			System.out.println(link);
			link.searchDelete();
			System.out.println("\nDeleting end of the list : ");
			System.out.println(link);
			System.out.println("________________________________________________________");
		}
		catch (InputMismatchException e) {
			System.err.println("Please enter Integers. Bye.");
			System.exit(0);
		}
	}

	private void stringInput() {

		LinkedList<String> link = new LinkedList<String>();
		String val;
		Scanner scan = new Scanner(System.in);

		try {
			boolean exit = true;
			while (exit) {
				System.out.println("\nType String (exit: type . (dot is not in the list))");
				val = scan.nextLine();
				link.addEnd(val);
				
				if (val.equals(".")) {
					link.deleteOne(".");
					exit = false;
				}
				
			}
			
			System.out.println("\nThis is your list :");
			System.out.println(link);
			link.searchDelete();
			System.out.println("\nDeleting end of the list : ");
			System.out.println(link);
			System.out.println("________________________________________________________");
		} 
		catch (InputMismatchException e) {
			System.err.println("Please enter Strings. Bye.");
			System.exit(0);
		}
		
	}
	

}
