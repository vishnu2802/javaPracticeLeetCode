package Vishnu.Strings;

public class S2011 {

    public int finalValueAfterOperations(String[] operations) {

        int x =0;

        for(int i=0; i<operations.length; i++){

            if(operations[i].equals("--X") || operations[i].equals("X--")){
                System.out.println(operations[i]);
                x = x-1;
            }
            else{

                x=x+1;

            }

        }
        return x;
    }
}
