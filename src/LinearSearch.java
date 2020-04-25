
// Write a method that returns the index of the first occurrence
// of given integer in a list.
// Assume that the index of the first element in the list is zero.
// If the number does not exist return -1.

import java.util.Arrays;

class LinearSearch{

  public Integer search(Integer n, Integer[] arr){
    for(Integer i=0; i<arr.length; i++){
      if(arr[i].equals(n)){
        return i;
      }
    }
    return -1;
	 }

    public static void main(String[] args) {
      Integer[] arr = {3,1,3,2,6,9,7,6};
      System.out.println(
      new LinearSearch().search(6, arr)); //output: 4

      // Outro método, transformando o array numa lista e usando o indexOf
      System.out.println(Arrays.asList(arr).indexOf(8)); //output: -1
    }
}
