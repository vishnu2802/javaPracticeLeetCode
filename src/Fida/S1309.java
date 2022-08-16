package Fida;

public class S1309 {
	public static void main(String[] args) {
		System.out.println(new S1309().freqAlphabets("10#11#12"));
	}
	public String freqAlphabets(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = s.length() - 1; i > -1; i--){
			if(s.charAt(i) == '#'){
				StringBuilder sc = new StringBuilder();
				sc.append(s.charAt(i - 2)).append(s.charAt(i - 1));
				char letterToAppend = (char) (Integer.parseInt(sc.toString()) + 96);
				sb.append(letterToAppend);
				i -= 2;
			} else {
				sb.append((char) (s.charAt(i) + 48));
			}

		}
		return sb.reverse().toString();
	}
}
