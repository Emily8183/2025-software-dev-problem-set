/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
//map.put(2, 0)
//int difference = target - map.getKey() 
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            int difference = target-numbers[i];

            if (map.containsKey(difference)) {
                result[0] = map.get(difference) +1;
                result[1] = i+1;
            }


            map.put(numbers[i], i); //key is the number, value is the index
        }

        return result;  
        
    }
}
// @lc code=end

