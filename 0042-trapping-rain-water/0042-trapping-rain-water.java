class Solution {
    public int trap(int[] height) {

        int []leftMax = new int[height.length];
        int []rightMax = new int[height.length];

        leftMax[0]=height[0];
        for(int i = 1;i<height.length;i++){
            if(leftMax[i-1]<height[i]){
                leftMax[i]=height[i];
            }
            else{
                leftMax[i]=leftMax[i-1];
            }
        }
        rightMax[rightMax.length-1]= height[height.length-1];
        for(int i = height.length-2;i>=0;i--){
            if(rightMax[i+1]<height[i]){
                rightMax[i]=height[i];
            }
            else{
                rightMax[i]= rightMax[i+1];
            }
        }
        //System.out.println(Arrays.toString(leftMax));
        //System.out.println(Arrays.toString(rightMax));

        int sum = 0;
        for(int i=0;i<height.length;i++){
            sum = sum+((Math.min(leftMax[i],rightMax[i]))-height[i]);
            //System.out.println("Sum is : "+sum);
        }
        return sum;   
    }
}