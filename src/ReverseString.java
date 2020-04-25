// Write a method that reverses a string.
// For example, 'java interview' becomes 'weivretni avaj'.

class ReverseString {

  public String reverter (String s){
    String reverso = "";
    for (int i=s.length()-1; i>=0; i--){
      reverso+=s.charAt(i);
    }
    return reverso;
  }

  public static void main (String... args){
    String str = "Naila";
    System.out.println(new ReverseString().reverter(str)); //output: aliaN

    //Outro jeito utilizando o método reverse da classe StringBuilder:
    System.out.println(new StringBuilder(str).reverse()); //output: aliaN

  }
}
