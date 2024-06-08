import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Using two pass hashTable
        HashMap<Integer, Integer> hMap = new HashMap<>();

        // place all the value in hashmap as numbers are key and indices are values
        for (int i = 0; i < nums.length; i++) {
            hMap.put(nums[i], i);
        }

        // generate output
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hMap.containsKey(complement) && hMap.get(complement) != i) {
                System.out.println(i + " "+ hMap.get(complement));
                return new int[] { i, hMap.get(complement), };
            }
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] inArray = new int[] { 2, 3, 3 };
        twoSum.twoSum(inArray, 6);

    }
}