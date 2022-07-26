package Fida;

import java.util.ArrayList;
import java.util.List;

public class S2194 {
	public List<String> cellsInRange(String s) {

		String[] initCells = s.split(":");

		//outer loop does the letters
		//inner loop does the numbers

		List<String> allCells = new ArrayList<>();
		for(int i = initCells[0].charAt(0); i <= initCells[1].charAt(0); i++){ //'i' represents the char we want, as an int. cast back to char to append to "allCells"

			for(int j = initCells[0].charAt(1); j <= initCells[1].charAt(1); j++){
				allCells.add(Character.toString((char) i) + Character.toString((char) j));
			}
		}
		return allCells;
	}
}
