package Vishnu.Strings;

public class S2103 {

    public int countPoints(String rings) {

        int count=0;

        for(int j=0; j<10; j++){
            boolean red = false;
            boolean blue = false;
            boolean green = false;

            for(int i=0; i<rings.length(); i+=2){

                if(rings.charAt(i)=='B' && rings.charAt(i+1)==Integer.toString(j).charAt(0)){
                    blue = true;
                }
                if(rings.charAt(i)=='G' && rings.charAt(i+1)==Integer.toString(j).charAt(0)){
                    green = true;
                }
                if(rings.charAt(i)=='R' && rings.charAt(i+1)==Integer.toString(j).charAt(0)){
                    red = true;
                }
            }
            if(red && blue && green){
                count = count+1;
            }


        }

        return count;

    }
}
