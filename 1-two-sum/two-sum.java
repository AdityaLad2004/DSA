class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int toFind = target - nums[i];

            if (map.containsKey(toFind)) {
                return new int[] { map.get(toFind), i };
            }

            else {
                map.put(nums[i], i);
            }
        }

        return null;
    }
}