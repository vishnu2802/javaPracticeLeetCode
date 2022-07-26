package Fida;

public class S1108 {
	public String defangIPaddr(String address) {

		return address.replace(".", "[.]");

//         StringBuilder sb = new StringBuilder();


//         for(char indivChar : address.toCharArray()){
//             if(indivChar == '.'){
//                 sb.append("[.]");
//             } else {
//                 sb.append(indivChar);
//             }
//         }

//         return sb.toString();
	}
}
