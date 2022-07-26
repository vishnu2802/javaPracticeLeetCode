package Fida;

public class S1528 {
	public String restoreString(String s, int[] indices) {

//         StringBuilder sb = new StringBuilder(s);

//         for(int i = 0; i < s.length(); i++){
//             sb.deleteCharAt(indices[i]);
//             sb.insert(indices[i], s.charAt(i));
//         }

//         return sb.toString();

		char[] newString = new char[s.length()];

		for(int i = 0; i < s.length(); i++){
			newString[indices[i]] = s.charAt(i);
		}

		return String.valueOf(newString);
	}
}
