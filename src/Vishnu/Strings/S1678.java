package Vishnu.Strings;

public class S1678 {

    public String interpret(String command) {

        StringBuilder letter = new StringBuilder();

        for(int i=0; i<command.length(); i++){


            if(command.charAt(i)=='G'){
                letter.append("G");

            } else if (command.charAt(i)=='(' & command.charAt(i+1)==')') {
                letter.append("o");
                i++;
            }
            else if(command.charAt(i)=='(' & command.charAt(i+1)=='a'& command.charAt(i+2)=='l'& command.charAt(i+3)==')'){
                letter.append("al");
                i+=3;
            }

        }

        return letter.toString();
    }

}
