/**
Assume you have a method isSubstring which checks if
one word is a substring of another.
Given two strings, s1 and s2, write code to check
if s2 is a rotation of s1 using only one call to isSubstring
(e.g. "waterbottle" is a rotation of "erbottlewat")*/

public boolean isRotation(String s1, String s2){
    if (s1 == null || s2 == null){
        return false;
    }
    int len2 = s2.length();
    if (len2 == s1.length() && len2 > 0){
        String s1s1 = s1 + s1;
        return isSubstring(s1s1, s2);
    }

}

public static boolean isSubstring(String str1, String str2){
    if (str1.indexOf(str2) == -1){

      return false;

    }
    return true;
}
