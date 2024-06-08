class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Using brute force
        for (int index = 0; index < nums.length - 1; index++) {
            for (int j = index + 1; j < nums.length; j++) {
                if (nums[index] + nums[j] == target) {
                    // System.out.println("[" + index + "," + j + "]");
                    return new int[] { index, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] inArray = new int[] { 3, 3 };
        twoSum.twoSum(inArray, 6);

    }
}