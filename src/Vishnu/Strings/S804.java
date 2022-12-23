package Vishnu.Strings;

import java.util.HashSet;
import java.util.Set;

public class S804 {

    public int uniqueMorseRepresentations(String[] words) {

        Set<String> unique = new HashSet<>();
        String[] morse = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};


        for(int i=0; i< words.length; i++){
            StringBuilder s = new StringBuilder();
            for(int j=0; j< words[i].length(); j++){
                s.append(morse[words[i].charAt(j)-'a']);

            }
            unique.add(s.toString());

        }

        return unique.size();

    }
}
