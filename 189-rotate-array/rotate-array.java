class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0, nums.length-1);
        //System.out.println(Arrays.toString(nums));
        reverse(nums,0,k-1);
        //System.out.println(Arrays.toString(nums));
        reverse(nums,k, nums.length-1);
        //System.out.println(Arrays.toString(nums));
    }
    private void reverse(int[]nums,int postOne,int posTwo) {
    while (postOne <= posTwo) {
        int temp = nums[postOne];
        nums[postOne] = nums[posTwo];
        nums[posTwo] = temp;
        postOne++;
        posTwo--;
    }
    }
}