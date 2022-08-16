package Fida;

public class S2108 {
	public static void main(String[] args) {

	}
	public String firstPalindrome(String[] words) {

		for(String word : words){
			StringBuilder sb = new StringBuilder(word);
			if(sb.reverse().toString().equals(word)){
				return word;
			}
		}
		return "";
	}
}
