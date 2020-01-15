// Sum Multiples of Three and Five
// Given a number n, write a method that sums all
// multiples of three and five up to n (inclusive).

class SumMultiplesOfThreeAndFive{
  public Integer sum (int n){
    int soma = 0;
    for (int i=3; i<=n; i++){
     if ((i%3==0) || (i%5==0)){
      soma += i;
      }
    }
    return soma;
  }
  
  public static void main (String... args){
    System.out.println(new
    SumMultiplesOfThreeAndFive().sum(110));
  }
}
