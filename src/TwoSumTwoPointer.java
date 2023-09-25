import java.util.Arrays;
//leetcode question  In this question index value should start from 1 if you counted the array;
public class TwoSumTwoPointer {
        public static int[] twoSum(int[] numbers, int target) {
            int i=0;
            int j=numbers.length-1;
            while(i<j){
                if(numbers[i]+numbers[j]>target){
                    j--;
                }
                else if(numbers[i]+numbers[j]<target){
                    i++;
                }
                else if(numbers[i]+numbers[j]==target){
                    break;
                }

            }
            return new int[] {i+1,j+1};//Array counting Starting from 1.

        }

    public static void main(String[] args) {
        int [] arr={12,14,17,18,28};
        int element=31;
      int result[]=twoSum(arr,element);
        System.out.println(Arrays.toString(result));
    }
    }
