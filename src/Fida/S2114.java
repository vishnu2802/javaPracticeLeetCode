package Fida;

public class S2114 {
	public int mostWordsFound(String[] sentences) {

		int maxWords = 1;

		for(int i = 0; i < sentences.length; i++){
			int currentLength = 1;

			for(char indivChar : sentences[i].toCharArray()){
				if(indivChar == ' '){
					currentLength++;
				}
			}
			if(currentLength > maxWords){
				maxWords = currentLength;
			}
		}

		return maxWords;
	}
}
