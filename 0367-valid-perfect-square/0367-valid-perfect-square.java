class Solution {
    public boolean isPerfectSquare(int num) {
        int low =0;
        int high = num;
        int ans =-1;
        if(num==0||num==1){
            return true;
        }
        while(low<=high){
            int mid  =low +(high-low)/2;

            if(mid <=num/mid){
                ans =mid;
                low =mid+1;
            }
            else{
                high =mid-1;
            }
        }
        if(ans*ans ==num){
            return true;
        }
        return false;
    }
}