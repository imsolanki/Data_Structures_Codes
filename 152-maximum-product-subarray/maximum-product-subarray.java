class Solution {
    public int maxProduct(int[] nums) {
       int ans=nums[0];
       int leftProduct = 1;
       int rightProduct = 1;
       for(int i =0;i<nums.length;i++){
           if(leftProduct==0){
               leftProduct = 1;
           }
           if(rightProduct==0){
               rightProduct=1;
           }
           leftProduct = leftProduct*nums[i];
           rightProduct = rightProduct*nums[nums.length-1-i];
           ans = Math.max(ans,Math.max(leftProduct,rightProduct));
       } 
       return ans;
    }
}