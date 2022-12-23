package Vishnu.Strings;

public class S1684 {

    public int countConsistentStrings(String allowed, String[] words) {

        int count =0;

        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                if(allowed.contains(String.valueOf(words[i].charAt(j)))){

                }
                else{
                    break;

                }
                if(j==(words[i].length()-1)) {
                    count = count+1;
                }


            }

        }
        return count;

    }
}
