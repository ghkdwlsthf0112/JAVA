package myobj.yacht;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class YachtDice {
	
	ArrayList<Integer> dices = new ArrayList<>();
	
	public YachtDice() {
		for (int i = 0; i < 5; ++i) {
			dices.add(randomDice());
		}
	}
	
	private int randomDice() {
		return (int)(Math.random() * 6 + 1);
	}
	
	public void showAvailableRanks() {
		List<Integer> counts = new ArrayList<>();
		
		for (int i = 1; i < 7; ++i) {
			counts.add(Collections.frequency(dices, 1));
		}
		
		System.out.println("각 주사위 개수: " + counts);
		
		int availNum = 1;
		int maxCount = Collections.max(counts);
		
		if (maxCount == 5) {
			System.out.println(availNum++ + ") Yacht");
		}
		
		if (maxCount >= 4) {
			System.out.println(availNum++ + ") Four of kind");
		}
		
		if (maxCount >= 3) {
			System.out.println(availNum++ + ")  Three of kind");
		}
		
		if (counts.contains(3) && counts.contains(2)) {
			System.out.println(availNum++ + ") Full house");
		}
		
		List<Integer> countinuousCount = new ArrayList<>();
		
		Collections.addAll(countinuousCount, 0, 0, 0);
		int countinuousIndex = 0;
		
		for (Integer count : counts) {
			if (count > 0) {
				countinuousCount.set(countinuousIndex,
						countinuousCount.get(countinuousIndex) + 1);
			} else {
				if (countinuousCount.get(countinuousIndex) != 0) {		
					++countinuousIndex;
				}
			}
		}
		//Collections.max(Collection)
		int maxcountinuousCount = Collections.max(countinuousCount);
		
		if (maxcountinuousCount == 5) {
			System.out.println(availNum++ + ") Large Straihght");
		}
		
		if (maxcountinuousCount >= 4) {
			System.out.println(availNum++ + ") Small Straihght");
		}

	}
	
	@Override
	public String toString() {
		return dices.toString();
	}
}
