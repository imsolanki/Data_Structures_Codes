class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int leftProduct=1,rightProduct=1;
        int ans=nums[0];
        
        for(int i=0;i<n;i++){
            
			//if any of l or r become 0 then update it to 1
            if(leftProduct==0){
                leftProduct=1;
            }
            if(rightProduct==0){
                rightProduct=1;
            }
            
            leftProduct *= nums[i];   //prefix product
            rightProduct *= nums[n-1-i];    //suffix product
            
            ans = Math.max(ans,Math.max(leftProduct,rightProduct));
            
        }
        
        return ans;
 
    }
}