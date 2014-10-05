/**
判断两个数，byte格式比如11000101和00011101是不是互为Gray Code。即两个数只有一位不同即为gray码
*/
public static boolean isGreycode(byte s1, byte s2){
		int counter = 0;
		String str1 = Byte.toString(s1);
		String str2 = Byte.toString(s2);
		if (str1.length() != str2.length()){
			return false;
		}
		for (int i = 0; i < str1.length(); i++){
			if (str1.charAt(i) != str2.charAt(i)){
				++counter;
				if (counter > 1){
					return false;
				}
			}
		}
		return counter == 1 ? true : false;
	}
