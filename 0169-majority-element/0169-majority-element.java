class Solution {
    public int majorityElement(int[] nums) {

        int leading = 0;
        int count = 0;

        for(int i=0;i<nums.length;i++){
            if (count==0){
                leading = nums[i];
            }
            if(leading==nums[i]){
                count +=1;
            }
            else{
                count -=1;
            }
        }
        return leading;

        
}
}