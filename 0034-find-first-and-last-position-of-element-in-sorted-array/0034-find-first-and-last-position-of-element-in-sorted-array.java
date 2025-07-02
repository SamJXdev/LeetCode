class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findfirst(nums,target);
        int last = findlast(nums,target);
        return new int[] {first,last};
    }
    private int findfirst(int[] nums, int target){
        int left = 0;
        int right=nums.length-1;
        int result = -1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                result=mid;
                right = mid - 1;
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else{
                right = mid - 1;
            }
        }
        return result;
    }
    private int findlast(int[] nums, int target){
        int left = 0;
        int right=nums.length-1;
        int result = -1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                result=mid;
                left = mid + 1;
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else{
                right = mid - 1;
            }
        }
        return result;
    }
}