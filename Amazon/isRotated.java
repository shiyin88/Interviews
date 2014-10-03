public boolean isRotation(String s1, String s2){
  int len2 = s2.length();
  if (len2 == s1.length() && len2 > 0){
      String s1s1 = s1 + s1;
      return isSubstring(s1s1, s2);
  }

}

public String noVowels(String word){

}
