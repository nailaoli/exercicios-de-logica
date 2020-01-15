// Write a method that calculates the factorial of a given number.
// Factorial is the product of all positive integers less than or equal to n.
// For example, factorial(4) = 4x3x2x1 = 24.
// TIP: To make it more interesting, try to do it recursively.
// Recursivo = quando o método chama ele mesmo.

class Factorial{
  public Integer factorial (Integer n){
    if (n<= 1){
      return 1;
    }
    else {
      return n *= factorial(n-1);
    }
  }

  public static void main (String [] args){
    System.out.println(new Factorial().factorial(8));
  }
}
