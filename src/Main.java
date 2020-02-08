import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Runner for project.
		
		
		// Take user selection.
		Scanner in = new Scanner(System.in);

		// Possible menu choices.
		String[] arr = {"simpleSort Ascending", "simpleSort Descending", "printSortedFrequency", "numberOfUniqueValues"};
		for( int i = 0; i <= arr.length-1; i++) {
              System.out.println(i+1 + ": " + arr[i]);
		}
		
        System.out.println("q. Quit Program");
        System.out.println(" ");

        boolean quit = false;

        String menuItem;

        do {
              System.out.print("Choose menu item: ");

              menuItem = in.nextLine();

              switch (menuItem) {

              case "1":
                    System.out.println("simpleSort Ascending: ");
                    System.out.println(" ");
                    
                    // Create supplied list and add example elements.
                    List<Integer> ascendingNumList = new ArrayList<Integer>();
                    ascendingNumList.add(24);
                    ascendingNumList.add(12);
                    ascendingNumList.add(8);
                    ascendingNumList.add(12);
                    ascendingNumList.add(19);
                    
            		System.out.println("Supplied List: " + ascendingNumList);
            		
            		// Create instance of Sorter class that implements the interface.
            		Sorter sortListAscending = new Sorter();
            		
            		// Call to simpleSort method.
            		System.out.println("Ascending List after sorting: " + sortListAscending.simpleSort(ascendingNumList));
                    break;
              
              case "2":
                  	System.out.println("simpleSort Descending: ");
                  	System.out.println(" ");
                
                  	// Create supplied list and add example elements.
                  	List<Integer> descendingNumList = new ArrayList<Integer>();
                  	descendingNumList.add(24);
                  	descendingNumList.add(12);
                  	descendingNumList.add(8);
                  	descendingNumList.add(12);
                  	descendingNumList.add(19);
                
                  	System.out.println("Supplied List: " + descendingNumList);
          		
                  	// Create new instance of Sorter class that implements the interface.
                  	Sorter sortListDescending = new Sorter();
                  	
                  	// Call to simpleSort method (descending).
                  	System.out.println("Descending List after sorting: " + sortListDescending.simpleSortDescendingHelper(descendingNumList));
                  	break;
                  	
                  	// Take a list and print them in ascending order to standard out along with number of times 
                  	// that the respective number appears.
             case "3":

            	 	System.out.println("printSortedFrequency: ");
            	 	System.out.println(" ");
            	 	
            	 	// Create supplied list and add example elements.
            	 	List<Integer> sortedListToBePrinted = new ArrayList<Integer>();
            	 	sortedListToBePrinted.add(24);
            	 	sortedListToBePrinted.add(12);
            	 	sortedListToBePrinted.add(8);
            	 	sortedListToBePrinted.add(12);
            	 	sortedListToBePrinted.add(19);
            	 	
            	 	System.out.println("Supplied List: " + sortedListToBePrinted);
            	 	
            	 	// Create instance of Sorter class that implements the interface.
            	 	Sorter frequencyToStandardOut = new Sorter();
            	 	frequencyToStandardOut.printSortedFrequency(sortedListToBePrinted);
            	 	break;
            	 	
            	 	// Take a list and return number of times a unique value appears .
            case "4":

            	 	System.out.println("numberOfUniqueValues: ");
            	 	System.out.println(" ");
            	 	
            	 	// Create supplied list and add example elements.
            	 	List<Integer> listOfUniqueValues = new ArrayList<Integer>();
            	 	listOfUniqueValues.add(24);
            	 	listOfUniqueValues.add(12);
            	 	listOfUniqueValues.add(8);
            	 	listOfUniqueValues.add(12);
            	 	listOfUniqueValues.add(19);
            	 	
            	 	// Additional test case
            	 	
            	 	//listOfUniqueValues.add(24);
  
            	 	
            	 	System.out.println("Supplied List: " + listOfUniqueValues);
            	 	
            	 	// Create instance of Sorter class that implements the interface.
            	 	Sorter uniqueItems = new Sorter();
            	 	System.out.println("Unique values: " + uniqueItems.numberOfUniqueValues(listOfUniqueValues));
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


