package Vishnu.Strings;

public class S1221 {

    public int balancedStringSplit(String s) {

        int num =0;
        int i= 0;

        for(int j=0; j<s.length(); j++){

            if(s.charAt(j)=='L'){
                i=i+1;
            }
            else{
                i=i-1;
            }
            if(i==0){
                num=num+1;

            }

        }

        return num;

    }
}
