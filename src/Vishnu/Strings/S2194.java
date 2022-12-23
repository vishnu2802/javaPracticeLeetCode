package Vishnu.Strings;

import java.util.ArrayList;
import java.util.List;

public class S2194 {

    public List<String> cellsInRange(String s) {

        List<String> list = new ArrayList<>();

        String s1 = s.substring(0,2);
        String s2 = s.substring(3,5);


        for (char i=s1.charAt(0); i<=s2.charAt(0); i++ ){

            for(char j=s1.charAt(1); j<=s2.charAt(1); j++){

                list.add(""+i+""+j+"");

            }
        }

        return list;

    }
}
