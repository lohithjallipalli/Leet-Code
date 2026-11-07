class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }
    void backtrack(List<List<Integer>> res, List<Integer> temp, int[] candidates, int remain, int start) {
        if (remain == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > remain) break;
            temp.add(candidates[i]);
            backtrack(res, temp, candidates, remain - candidates[i], i);
            temp.remove(temp.size() - 1);
        }
    }
}