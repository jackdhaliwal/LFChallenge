import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.HashSet;

public class Sorter implements SortChallenge {

	// Method to sort list of numbers in ascending order.
	@Override
	public int[] simpleSort(int[] listOfNumsToBeSortedAsc, boolean ascending) {

		// "i" is a pointer for the outer loop.
		for (int i = 0; i < listOfNumsToBeSortedAsc.length; i++) {

			// "j" is a pointer for the inner loop.
			for (int j = listOfNumsToBeSortedAsc.length - 1; j > i; j--) {

				// If value at index of i is greater than value at index of j,
				// then perform a swap.
				if (listOfNumsToBeSortedAsc[i] > listOfNumsToBeSortedAsc[j]) {

					// Swapping
					int temp = listOfNumsToBeSortedAsc[i];
					listOfNumsToBeSortedAsc[i] = listOfNumsToBeSortedAsc[j];
					listOfNumsToBeSortedAsc[j] = temp;
				}
			}
		}

		return listOfNumsToBeSortedAsc;
	}

	// Method to print sorted (ascending) list and number of times each element
	// appears.
	@Override
	public void printSortedFrequency(int[] listTobeSortedAndPrinted) {

		// A map to hold elements (keys) and respective "number of times they appear"
		// counts (values).
		// Using a TreeMap because we care about the order once we print to output.
		Map<Integer, Integer> mapOfNumsAndValues = new TreeMap<Integer, Integer>();

		// Iterate over supplied array
		for (int num : listTobeSortedAndPrinted) {

			// Add elements to map
			// If an element is already in the map, increase the number of times count by 1
			if (mapOfNumsAndValues.containsKey(num)) {
				mapOfNumsAndValues.put(num, mapOfNumsAndValues.get(num) + 1);

			} else {
				// If the element is not already in the map, simply add it and assign "1" to the
				// number of times count
				mapOfNumsAndValues.put(num, 1);
			}
		}

		// Iterating over our old map with a new one
		// For every record (new map) in our old map (mapOfNumsandValues), print the
		// element and respective number of times it appears.
		for (Map.Entry<Integer, Integer> record : mapOfNumsAndValues.entrySet()) {

			System.out.println(record.getKey() + " appears " + record.getValue() + " time(s)");
		}
	}

	// Method to return the number of times a unique value appears.
	@Override
	public int numberOfUniqueValues(int[] listOfPotentialUniqueNums) {

		// Using a set to hold elements as opposed to a map as sets do not have
		// duplicate elements.
		Set<Integer> setOfNums = new HashSet<Integer>();

		// A counter for unique elements.
		int uniqueCount = 0;

		// Add each element from the list to the set if it doesn't already exist in the
		// set.
		for (int num : listOfPotentialUniqueNums) {
			if (!setOfNums.contains(num)) {
				setOfNums.add(num);
			}
		}

		// Iterate over our set and if there are unique elements, increase our unique
		// counter.
		for (int uniqueNum : setOfNums) {
			if (setOfNums.contains(uniqueNum)) {
				uniqueCount++;
			}
		}
		return uniqueCount;
	}

	// Method to sort list of numbers in descending order.
	public int[] simpleSortDescendingHelper(int[] listOfNumsToBeSortedDesc, boolean ascending) {

		// "i" is a pointer for the outer loop.
		for (int i = 0; i < listOfNumsToBeSortedDesc.length; i++) {

			// "j" is a pointer for the inner loop.
			for (int j = listOfNumsToBeSortedDesc.length - 1; j > i; j--) {

				// If value at index of i is less than value at index of j,
				// then perform a swap.
				if (listOfNumsToBeSortedDesc[i] < listOfNumsToBeSortedDesc[j]) {

					// Swapping
					int temp = listOfNumsToBeSortedDesc[i];
					listOfNumsToBeSortedDesc[i] = listOfNumsToBeSortedDesc[j];
					listOfNumsToBeSortedDesc[j] = temp;
				}
			}
		}
		return listOfNumsToBeSortedDesc;

	}

}
