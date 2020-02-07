import java.util.List;
import java.util.ArrayList;

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
	public void printSortedFrequency(List<Integer> b) {
		// TODO Auto-generated method stub
		
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
