package DSA.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
    public static void main(String[] args) {
        int[] theNumbers = {5,2,8,9,1,13,17,19};
        int key = 20;
        System.out.println(Arrays.toString(twoSum(theNumbers, key)));
        
    }

    public static int[] twoSum(int[] arr, int key){
        Map<Integer, Integer> valueMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = key - arr[i];
            if(valueMap.containsKey(complement)) {
                return new int[] {valueMap.get(complement), i};
            }
            valueMap.put(arr[i],i);
        }
        
        return  null;
    }
}
