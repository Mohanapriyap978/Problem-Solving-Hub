import java.util.*;
class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> res=new ArrayList<>();
        backtrack(nums,new ArrayList<Integer>(),new HashSet<Integer>(),res);
        return res;
    }
    public void backtrack(int[] nums,List<Integer> curr,Set<Integer> added, List<List<Integer>> res){
        if(curr.size() == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!added.contains(i)){
                curr.add(nums[i]);
                added.add(i);
                backtrack(nums,curr,added,res);
                curr.remove(curr.size()-1);
                added.remove(i);
            }
        }
    }
}