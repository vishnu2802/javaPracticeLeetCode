package Vishnu.Strings;

public class S771 {
    public int numJewelsInStones(String jewels, String stones) {

        int value =0;

        for(int i=0; i<jewels.length(); i++){
            for(int j=0; j<stones.length(); j++){
                if(jewels.charAt(i)==stones.charAt(j)){
                    value = value+1;
                }
            }
        }
        return value;

    }
}
