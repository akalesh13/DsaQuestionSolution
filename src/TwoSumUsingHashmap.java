
import java.util.HashMap;
public class TwoSumUsingHashmap {
    static void findTwoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        int result[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target && map.containsKey(0)) {
                result[0] = i;
                result[1] = map.get(0);
            } else {
                if (map.containsKey(target - arr[i])) {
                    if (map.get(target - arr[i]) > i) {
                        result[0] = i;
                        result[1] = map.get(target - arr[i]);
                        break;

                    }
                }
            }
        }
        System.out.println("elements are :"+"["+result[0]+" "+result[1]+"]");
    }
        public static void main(String[] args){
            int array[] = {12, 23, 14, 87, 56, 39};
            int search = 143;
            findTwoSum(array, search);

        }
    }
