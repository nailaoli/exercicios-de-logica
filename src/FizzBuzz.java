// Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the
// multiples of five. For numbers which are multiples of both three and five
// return 'FizzBuzz'. For numbers that are neither, return the input number.

class FizzBuzz{

  static String fizzBuzz(Integer i) {
    String fb = "";
    if (i%3 == 0)
      fb += "Fizz";
    if (i%5 == 0)
      fb += "Buzz";
    if (fb.equals(""))
      fb = String.valueOf(i);
    return fb;
  }

  public static void main(String[] args){
    System.out.println(FizzBuzz.fizzBuzz(3)); // output: Fizz
    System.out.println(FizzBuzz.fizzBuzz(5)); // output: Buzz
    System.out.println(FizzBuzz.fizzBuzz(15)); // output: FizzBuzz
    System.out.println(FizzBuzz.fizzBuzz(11)); // output: 11
  }
}
