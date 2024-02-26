class Solution {
    public int firstMissingPositive(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correctPosition=nums[i]-1;
            if(nums[i]>0&&nums[i]< nums.length&&nums[i]!=nums[correctPosition]){
                int temp = nums[correctPosition];
                nums[correctPosition]=nums[i];
                nums[i]=temp;
            }else{
                i++;
            }
        }
        for(int j =0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        //System.out.println(Arrays.toString(nums));
        return nums.length+1;
    }
}