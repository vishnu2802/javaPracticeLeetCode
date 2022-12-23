package Vishnu.Strings;

public class S1832 {

    public boolean checkIfPangram(String sentence) {

        boolean param = true;

        for(int i=97; i<=122; i++){
            for(int j=0; j<sentence.length(); j++){
                if(i==sentence.charAt(j)){
                    param=true;
                    break;
                }
                else{
                    param = false;
                }
            }
            if(!param){
                break;
            }

        }
        return param;

    }
}
