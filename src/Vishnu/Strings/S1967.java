package Vishnu.Strings;

public class S1967 {

    public int numOfStrings(String[] patterns, String word) {

        int value=0;

        for(String s: patterns ){
            if(word.contains(s)){
                value = value+1;
            }
        }

        return value;

    }
}
