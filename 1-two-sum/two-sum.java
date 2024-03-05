class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int []output=new int[2];
        for(int i =0;i<nums.length;i++){
            int value = target - nums[i];
            if(map.containsKey(value)){
                output[0]=map.get(value);
                output[1]=i;
                return output;
            }else{
                map.put(nums[i],i);
            }
        }
        return output;
    }
}