class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for(int i = 0, i < nums.length; i++){
            int diff = target - nums[i];
            if(numMap.containsKey(diff)){
                return new int[] {numMap.get(diff), i};
            }
            numMap.put(nums[i], i);
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.twoSum(new int[]{2, 7, 11, 15}, 9));
    }
}