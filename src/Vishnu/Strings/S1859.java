package Vishnu.Strings;

public class S1859 {

    public String sortSentence(String s) {

        StringBuilder returnString = new StringBuilder();

        String[] strArray = s.split(" ");

        String[] newStrArray = new String[strArray.length];

        for(int i=0; i<strArray.length; i++){

            newStrArray[Character.getNumericValue(strArray[i].charAt(strArray[i].length()-1))-1] = strArray[i].substring(0, strArray[i].length()-1);
        }

        for(int i=0; i<newStrArray.length; i++){
            returnString.append(newStrArray[i]);
            if(i<newStrArray.length-1){
                returnString.append(" ");
            }

        }


        return returnString.toString();

    }
}
