package Vishnu.Strings;

public class S557 {

    public String reverseWords(String s) {

        StringBuilder str = new StringBuilder();

        String[] newStr = s.split(" ");

        for (int i = 0; i < newStr.length; i++) {

            for (int j = newStr[i].length()-1; j >= 0; j--) {

                str.append(newStr[i].charAt(j));

            }
            if(i< newStr.length-1){
                str.append(" ");
            }

        }
        return str.toString();

    }
}
