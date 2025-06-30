class Solution {
    public int trap(int[] height) {
        int left=0;
        int right = height.length-1;
        int leftmax =height[0];
        int rightmax = height[right];
        int total=0;

        while(left<right){
            if(leftmax<=rightmax){
                left++;
                leftmax=Math.max(leftmax,height[left]);
                total +=leftmax-height[left];
            }
            else{
                right--;
                rightmax=Math.max(rightmax,height[right]);
                total +=rightmax-height[right];
            }
        }
        return total;
    }
}