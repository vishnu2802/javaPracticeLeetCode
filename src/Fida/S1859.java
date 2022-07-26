package Fida;

public class S1859 {
	public String sortSentence(String s) {

		String[] splitWords = s.split(" ");
		String[] newOrder = new String[splitWords.length];

		for(String indivWord : splitWords){
			int wordIndex = indivWord.charAt(indivWord.length() - 1) - 49;

			newOrder[wordIndex] = new StringBuilder(indivWord).deleteCharAt(indivWord.length() - 1).toString();
		}

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < newOrder.length; i++){
			sb.append(newOrder[i]);
			if(i < newOrder.length - 1){
				sb.append(' ');
			}
		}

		return sb.toString();
	}
}
