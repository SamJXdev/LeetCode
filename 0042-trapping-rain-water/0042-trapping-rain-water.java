class Solution {
    public int trap(int[] height) {
        int left =0;
        int right = height.length-1;
        int leftmax = height[left];
        int rightmax = height[right];
        int result =0;

        while(left<right){
            if(leftmax<=rightmax){
                left++;
                leftmax = Math.max(leftmax,height[left]);
                result += leftmax - height[left];
            }
            else{
                right--;
                rightmax = Math.max(rightmax,height[right]);
                result +=rightmax - height[right];
            }
        }
        return result;

    }
}