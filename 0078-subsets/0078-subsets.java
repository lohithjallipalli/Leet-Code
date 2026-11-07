class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backtrackSubsets(res, new ArrayList<>(), nums, 0);
        return res;
    }
    void backtrackSubsets(List<List<Integer>> res, List<Integer> temp, int[] nums, int start) {
        res.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            backtrackSubsets(res, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}