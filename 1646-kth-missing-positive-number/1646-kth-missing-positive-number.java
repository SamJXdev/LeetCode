class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num=1;
        int missing=0;
        int i=0;
        while(true)
        {
            if(i<arr.length && arr[i]==num)
            {
                i++;
            }
            else
            {
                missing++;
                if(missing==k)
                {
                    return num;
                }
            }
            num++;
        }
        
    }
}