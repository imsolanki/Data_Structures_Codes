class Solution {
    public void reverseString(char[] s) {
        int low =0;
        int high =s.length-1;
        while(low<=high){
            char temp = s[low];
            //System.out.println(temp);
            s[low]=s[high];
            s[high]=temp;
            low++;
            high--;
        }
    }
}