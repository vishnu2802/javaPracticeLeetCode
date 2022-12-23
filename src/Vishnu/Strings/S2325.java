package Vishnu.Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class S2325 {

    public String decodeMessage(String key, String message) {

        StringBuilder str = new StringBuilder();

        char c = 'a';

        HashMap<Character, Character> letters = new LinkedHashMap<>();

        for(int i=0; i<key.length(); i++){

            if(key.charAt(i)!=' ' && !letters.containsKey(key.charAt(i))) {
                letters.put(key.charAt(i), c);
                c++;
            }
        }

        for(int i=0; i<message.length(); i++){

            if(message.charAt(i)==' '){
                str.append(" ");
            }
            else{
                str.append(letters.get(message.charAt(i)));
            }

        }

        return str.toString();

    }
}
