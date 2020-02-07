// A prime number is a natural number greater than 1 that has no positive
// divisors other than 1 and itself. Write a method that checks if a number is
// prime number.
class PrimeNumber{

  public static Boolean isPrime(Integer n){
    if (n==1)
      return false;
    for (int i = n-1; i > 1; i--){
      if (n%i==0)
        return false;
    }
    return true;
  }

  public static void main(String... args){
    System.out.println(PrimeNumber.isPrime(2)); // output: true
    System.out.println(PrimeNumber.isPrime(10)); // output: false
    System.out.println(PrimeNumber.isPrime(13)); // output: true
  }
}
