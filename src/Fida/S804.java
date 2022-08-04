package Fida;

import java.util.HashSet;
import java.util.Set;

public class S804 {
	public static void main(String[] args) {
		String[] words = {"gin","zen","gig","msg"};
		System.out.println(new S804().uniqueMorseRepresentations(words));
	}

	public int uniqueMorseRepresentations(String[] words) {

		String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		Set<String> uniqueWords = new HashSet<>();
		for(String indivWord : words){
			StringBuilder morse = new StringBuilder();
			for(char indivChar : indivWord.toCharArray()){
				morse.append(morseCode[indivChar - 97]);
			}
			uniqueWords.add(morse.toString());
		}

		return uniqueWords.size();
	}
}
