// A palindrome is a word which reads the same backward or forward.
// 'abcba' is a palindrome.
// Write a method that detects if a string is a palindrome.
// Tip: Use word.charAt(i) to get the character at position i.

public class PalindromeCheck{

// Usando o for
  public static boolean isPalindrome(String word) {
    String wordLowerCase = word.toLowerCase();
    int j = 0;
    for (int i = wordLowerCase.length() - 1; i >= j; i--){
      if (wordLowerCase.charAt(i) != wordLowerCase.charAt(j)){
        return false;
      }
      j++;
    }
    return true;
  }

// Usando o while
  public static boolean isPalindrome2(String word) {
    String wordLowerCase = word.toLowerCase();
    int i1 = 0;
    int i2 = wordLowerCase.length() - 1;
    while (i2 > i1) {
      if (wordLowerCase.charAt(i1) != wordLowerCase.charAt(i2)) {
          return false;
      }
      ++i1;
      --i2;
    }
    return true;
  }

// Usando método para reverter o String
  public static boolean isPalindrome3(String word) {
    String wordLowerCase = word.toLowerCase();
    StringBuilder sb = new StringBuilder("");
    for (int i = wordLowerCase.length() - 1; i>=0; i--){
      sb.append(wordLowerCase.charAt(i));
    }
    if (wordLowerCase.equals(sb.toString()))
      return true;
      return false;
  }


  public static void main(String... args){
    System.out.println(String.valueOf(isPalindrome("Naila"))); // Output: false
    System.out.println(String.valueOf(isPalindrome("Arara"))); // Output: true
    System.out.println(String.valueOf(isPalindrome3("Arara"))); // Output: true

  }

}
