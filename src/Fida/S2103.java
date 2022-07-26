package Fida;

import java.util.HashSet;
import java.util.Set;

public class S2103 {
	public int countPoints(String rings) {

		int allColorRods = 0;
		for(int i = 0; i < 10; i++){
			Set<Character> tracker = new HashSet<>();
			for(int j = 0; j < rings.length(); j++){
				if(rings.charAt(j) - 48 == i){
					tracker.add(rings.charAt(j - 1));
				}
			}
			if(tracker.size() == 3){
				allColorRods++;
			}
		}
		return allColorRods;
	}
}
