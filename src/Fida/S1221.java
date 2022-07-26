package Fida;

public class S1221 {
	public int balancedStringSplit(String s) {

		int balance = 0;
		int balancedStrings = 0;

		for(char indivChar: s.toCharArray()){

			if(indivChar == 'R'){
				balance++;
			} else {
				balance--;
			}

			if(balance == 0){
				balancedStrings++;
			}
		}

		return balancedStrings;
	}
}
