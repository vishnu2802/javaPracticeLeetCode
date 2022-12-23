package Vishnu.Strings;

public class S1021 {
    public String removeOuterParentheses(String s) {

        StringBuilder str = new StringBuilder();

        int value = 0;
        int start = 0;
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == '(') {
                if(value==0){
                    start = i;
                }
                value = value+1;

            } else {
                value = value-1;
            }
            if (value==0){
                str.append(s.substring(start+1, i));

            }
        }
        return str.toString();

    }
}
