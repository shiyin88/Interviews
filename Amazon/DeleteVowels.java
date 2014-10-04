/**
Delete vowels in given string
*/
public class DeleteVowels {

	public static String removeVow(String input){

		/*StringBuilder newStr = new StringBuilder(input);
		int indexOfVowel = newStr.indexOf( "A" + "a" + "E" + "e" + "I" + "i" + "O" + "o" + "U" + "u" );
		newStr.deleteCharAt( indexOfVowel + 1 );

		return new String(newStr);*/

		String vowels = "AEIOUaeiou";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++){
			if (!vowels.contains(Character.toString(input.charAt(i)))){
				sb.append(input.charAt(i));
			}
		}
		return new String(sb);

	}
	public static void main(String[] args) {

		String str = "abcde";
		System.out.println(removeVow(str));
    
	}

}
