import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Runner for project
		
		
		// Take user selection
		Scanner in = new Scanner(System.in);

		// Array of possible menu choices 
		String[] arr = {"simpleSort Ascending", "simpleSort Descending", "printSortedFrequency"};
		for( int i = 0; i <= arr.length-1; i++)

              System.out.println(i+1 + ": " + arr[i]);

        System.out.println("q. Quit");


        boolean quit = false;

        String menuItem;

        do {

              System.out.print("Choose menu item: ");

              menuItem = in.nextLine();

              switch (menuItem) {

              case "1":

                    System.out.println("simpleSort Ascending: ");
                    System.out.println(" ");

                    List<Integer> someAscendingNums = new ArrayList<Integer>();
                    someAscendingNums.add(24);
                    someAscendingNums.add(12);
                    someAscendingNums.add(8);
                    someAscendingNums.add(12);
                    someAscendingNums.add(19);
            		System.out.println("Supplied List: " + someAscendingNums);
            		Sorter sortListAscending = new Sorter();
            		System.out.println("Ascending List: " + sortListAscending.simpleSort(someAscendingNums));

                    break;
              
              case "2":

                  System.out.println("simpleSort Descending: ");
                  System.out.println(" ");

                  List<Integer> someDescendingNums = new ArrayList<Integer>();
                someDescendingNums.add(24);
                someDescendingNums.add(12);
                someDescendingNums.add(8);
                someDescendingNums.add(12);
                someDescendingNums.add(19);
          		System.out.println("Supplied List: " + someDescendingNums);
          		Sorter sortListDescending = new Sorter();
          		System.out.println("Descending List: " + sortListDescending.simpleSortDescendingHelper(someDescendingNums));

                  break;
              
             case "3":

            	 System.out.println("printSortedFrequency: ");
                 System.out.println(" ");

                List<Integer> someNumsTobePassed = new ArrayList<Integer>();
                someNumsTobePassed.add(24);
                someNumsTobePassed.add(12);
                someNumsTobePassed.add(8);
                someNumsTobePassed.add(12);
                someNumsTobePassed.add(19);
          		System.out.println("Supplied List: " + someNumsTobePassed);
          		Sorter printFreq = new Sorter();
          		printFreq.printSortedFrequency(someNumsTobePassed);

                  break;

     
              case "q":

                    quit = true;

                    break;

              default:

                    System.out.println("Invalid choice.");

              }

        } while (!quit);

        System.out.println("Bye-bye!");

  }

	}


