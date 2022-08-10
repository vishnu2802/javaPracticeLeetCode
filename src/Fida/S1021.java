package Fida;

public class S1021 {
	public static void main(String[] args) {
		System.out.println(new S1021().removeOuterParentheses("(()())(())"));
	}
	public String removeOuterParentheses(String s) {

		//have counter, at 0, remove paranthesis
		int counter = 0;
		StringBuilder sb = new StringBuilder();

		for(char indivChar : s.toCharArray()){
			if(indivChar == '('){
				if(counter > 0){
					sb.append(indivChar);
				}
				counter++;
			} else {
				counter--;
				if(counter > 0){
					sb.append(indivChar);
				}
			}
		}

		return sb.toString();
	}
}
