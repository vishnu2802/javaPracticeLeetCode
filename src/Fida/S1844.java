package Fida;

public class S1844 {
	public static void main(String[] args) {
		System.out.println(new S1844().replaceDigits("v0g6s4d"));
	}
	public String replaceDigits(String s) {
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < s.length(); i++){

			if(s.charAt(i) > 47 && s.charAt(i) < 58){
				StringBuilder sc = new StringBuilder();
				int charCounter = -1;
				for(int j = i; j < s.length(); j++){
					if(s.charAt(j) > 47 && s.charAt(j) < 58){
						sc.append(s.charAt(j));
						charCounter++;
					} else {
						break;
					}
				}
				int shift = Integer.parseInt(sc.toString());
				sb.append((char) (s.charAt(i - 1) + shift));
				i += charCounter;
			} else {
				sb.append(s.charAt(i));
			}
		}

		return sb.toString();
	}
}
