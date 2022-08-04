package Fida;

import java.util.HashSet;
import java.util.Set;

public class S1832 {
	public boolean checkIfPangram(String sentence) {
		Set<Character> newSentence = new HashSet<>();

		for(char indivChar : sentence.toCharArray()){
			newSentence.add(indivChar);
		}

		return newSentence.size() == 26;
	}
}
