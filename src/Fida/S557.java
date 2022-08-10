package Fida;

public class S557 {
	public String reverseWords(String s) {

		String[] splitSpaces = s.split(" ");
		StringBuilder sb = new StringBuilder();
		StringBuilder sc = new StringBuilder();

		for(int i = 0; i < splitSpaces.length; i++){
			sb = new StringBuilder(splitSpaces[i]);
			splitSpaces[i] = sb.reverse().toString();

			sc.append(sb);
			if(i < splitSpaces.length - 1){
				sc.append(' ');
			}
		}

		return sc.toString();
	}
}
