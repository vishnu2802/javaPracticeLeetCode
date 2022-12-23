package Vishnu.Strings;

public class S1816 {

    public String truncateSentence(String s, int k) {

        StringBuilder str = new StringBuilder();

        String [] stt = s.split(" ");

        for(int i=0; i<k; i++){

            str.append(stt[i]);
            if(i<(k-1)){

                str.append(" ");
            }
        }

        return str.toString();

    }
}
