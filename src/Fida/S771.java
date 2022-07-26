package Fida;

public class S771 {
	public int numJewelsInStones(String jewels, String stones) {

		int noOfJewels = 0;

		for(char indivJewel : jewels.toCharArray()){
			for(char indivStone : stones.toCharArray()){
				if(indivJewel == indivStone){
					noOfJewels++;
				}
			}
		}
		return noOfJewels;
	}
}
