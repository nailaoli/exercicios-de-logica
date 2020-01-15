// Write a method that returns the largest integer in the list.
// You can assume that the list has at least one element.

import java.util.Arrays;

class FindMaximum{

  //Usando o for
  public Integer maximum(Integer[] list){
    Integer max = list[0];
    for(int i=0; i<list.length-1; i++){
      if (list[i+1]>list[i]){
        max = list [i+1];
      }
    }
    return max;
  }

  //Usando o laço for each
  public Integer maximum2(Integer[] list){
    Integer max = list[0];
    for(Integer i: list){
      if (i>max)
      max = i;
    }
    return max;
  }

  public static void main (String[] args){
    Integer[] list = {0, 3, 10, 8, -7};
    System.out.println(new FindMaximum().maximum(list)); //output:10
    System.out.println(new FindMaximum().maximum2(list)); //output: 10

    //Usando método de Arrays
    Arrays.sort(list);
    System.out.println(list[list.length-1]); //output: 10
  }
}
