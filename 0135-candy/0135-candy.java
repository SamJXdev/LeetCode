class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies,1);

        //left to right
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                candies[i]=1+candies[i-1];
            }
        }

        //right to left
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                candies[i]=Math.max(candies[i],1+candies[i+1]);
            }
        }
        int total =0;
        for(int i : candies){
            total+=i;
        }

        return total;
    }
}