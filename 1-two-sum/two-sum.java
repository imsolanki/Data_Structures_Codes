class Solution {
    public int[] twoSum(int[] nums, int target) {
                HashMap<Integer,Integer> map = new HashMap<>();
        int[] output=new int[2];
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                output[0] = map.get(target-nums[i]);
                output[1] =i;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return output;
    }
}