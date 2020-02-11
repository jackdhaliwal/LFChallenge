import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Runner for project.

		// Defining variables
		boolean quit = false;
		boolean isAscending = false;
		String mainMenuSelection;
		String simpleSortMenuSelection;

		// Setting up scanner to read user input
		Scanner in = new Scanner(System.in);

		// Supplied list for testing of implemented methods
		int[] suppliedNumList = new int[] { 24, 12, 8, 12, 19 };

		System.out.print(" Supplied List: ");
		// Printing supplied list
		for (int num = 0; num < suppliedNumList.length; num++) {

			System.out.print(suppliedNumList[num] + " ");
		}

		System.out.println(" ");
		System.out.println(" ");

		do {

			System.out.println("MAIN MENU: ");
			System.out.println(" ");

			System.out.println("Choose main menu item: ");

			// Array of possible menu choices.
			String[] arr = { "simpleSort", "printSortedFrequency", "numberOfUniqueValues" };
			for (int i = 0; i <= arr.length - 1; i++) {

				System.out.println(i + 1 + ": " + arr[i]);
			}

			System.out.println("q. Quit Program");

			// Take user input for menu selection
			mainMenuSelection = in.nextLine();

			switch (mainMenuSelection) {

			// Case for simpleSort
			case "1":

				// Sub-menu for sorting either ascending or descending order
				System.out.println("SUB-MENU: ");
				System.out.println(" ");
				System.out.println("Choose sub-menu item: ");

				// Array of possible sub-menu choices
				String[] arr2 = { "simpleSort Ascending", "simpleSort Descending", "Back to Main menu" };

				for (int i = 0; i <= arr2.length - 1; i++) {
					System.out.println(i + 1 + ": " + arr2[i]);
				}
				System.out.println("q. Quit Program");

				// Take user input for sub-menu selection
				simpleSortMenuSelection = in.nextLine();

				switch (simpleSortMenuSelection) {
				// Inner switch for sub-menu
				case "1":
					System.out.println("You chose simpleSort Ascending:");

					// Create instance of Sorter class that implements the interface.
					Sorter sortListAsc = new Sorter();

					// Setting this to true will invoke ascending method for the sort
					isAscending = true;

					// Call to simpleSort method.
					sortListAsc.simpleSort(suppliedNumList, isAscending);

					// Array to store result of method call
					int[] ascendingResult = new int[5];

					// Store resulting list in new array
					ascendingResult = suppliedNumList;

					// Iterate over resulting list and print it
					System.out.print("After Ascending Sort:");

					for (int resultingNum = 0; resultingNum < ascendingResult.length; resultingNum++)

						System.out.print(ascendingResult[resultingNum] + " ");

					System.out.println(" ");
					System.out.println(" ");

					break;

				case "2":
					System.out.println("You chose simpleSort Descending: ");

					// Create instance of Sorter class that implements the interface.
					Sorter sortListDsc = new Sorter();

					isAscending = false;
					// Call to simpleSort method.
					sortListDsc.simpleSortDescendingHelper(suppliedNumList, isAscending);

					// Array to store result of method call
					int[] descendingResult = new int[5];

					// Store resulting list in new array
					descendingResult = suppliedNumList;

					// Iterate over resulting list and print it
					System.out.print("After Descending Sort: ");

					for (int resultingNum = 0; resultingNum < descendingResult.length; resultingNum++)
						System.out.print(descendingResult[resultingNum] + " ");

					System.out.println(" ");
					System.out.println(" ");

					break;

				// Get back to the main menu
				case "3":
					for (int i = 0; i <= arr.length - 1; i++) {
						System.out.println(i + 1 + ": " + arr[i]);
					}
					break;

				case "q":
					quit = true;

					break;

				default:
					System.out.println("Invalid choice");
				}
				// Break out of outer switch
				break;

			// Take a list and print them in ascending order to standard out along with
			// number of times
			// that the respective number appears.
			case "2":

				System.out.println("You Chose printSortedFrequency: ");
				System.out.println(" ");

				// Create instance of Sorter class that implements the interface.
				Sorter frequencyToStandardOut = new Sorter();
				frequencyToStandardOut.printSortedFrequency(suppliedNumList);
				break;

			// Take a list and return number of times a unique value appears .
			case "3":

				// **NOTE: For additional Additional test case, add "24" to end of the
				// suppliedNumList array

				// Create instance of Sorter class that implements the interface.
				Sorter uniqueItems = new Sorter();
				System.out.println("Unique values: " + uniqueItems.numberOfUniqueValues(suppliedNumList));

				break;

			// Quit Program.
			case "q":
				quit = true;

				break;

			// User didn't select a valid menu choice.
			default:
				System.out.println("Invalid choice.");
			}

			// If the user doesn't quit program, keep looping menu.
		} while (!quit);

		// When program exits, print a friendly goodbye message.
		System.out.println("Thank you, Goodbye!");
	}

}
