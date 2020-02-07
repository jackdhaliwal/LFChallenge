import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.HashMap;

public class Sorter implements DifferentListSorting {
	
	@Override
	public List<Integer> simpleSort(List<Integer> a) {
		for (int i = 0; i<a.size(); i++) {
			for(int j =a.size() - 1; j > i; j--) {
				if (a.get(i) > a.get(j)) {
					int temp = a.get(i);
					a.set(i, a.get(j));
					a.set(j, temp);
				}
			}
		}	
		return a;
	}

	@Override
	public void printSortedFrequency(List<Integer> z) {
		
		// a map to hold elements (keys) and respective counts (values)
		// using a TreeMap because we care about the order once we print to output
		Map<Integer, Integer> mapOfNumsAndValues = new TreeMap<Integer, Integer>();

		for (int num : z) {
		    if (mapOfNumsAndValues.containsKey(num)) {
		    	// if element appears more than once in list
		    	mapOfNumsAndValues.put(num, mapOfNumsAndValues.get(num) + 1);
		        
		    } else {
		    	// if element doesn't appear more than once in list
		    	mapOfNumsAndValues.put(num, 1);
		    }
		}
		
		
		// Using Map.Entry which returns a collection-view of all mappings
		// (we can iterate over key/values)
		for (Map.Entry<Integer, Integer> record : mapOfNumsAndValues.entrySet()) {
		    System.out.println(record.getKey() + " appears " + record.getValue() + " time(s)");
		}
	}

	@Override
	public int numberOfUniqueValues(List<Integer> c) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public List<Integer> simpleSortDescendingHelper(List<Integer> b) {
		for (int i = 0; i<b.size(); i++) {
			for(int j =b.size() - 1; j > i; j--) {
				if (b.get(i) < b.get(j)) {
					int temp = b.get(i);
					b.set(i, b.get(j));
					b.set(j, temp);
				}
			}
		}	
		return b;
		
	}
	
	

}
