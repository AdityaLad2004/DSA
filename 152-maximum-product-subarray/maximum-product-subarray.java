class Solution {
    public int maxProduct(int[] nums) {
        int mini=1;
        int maxi=1;
        int ans=nums[0];

        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
int tempMin = Math.min(curr, Math.min(mini * curr, maxi * curr));
int tempMax = Math.max(curr, Math.max(mini * curr, maxi * curr));

mini = tempMin;
maxi = tempMax;

            if(maxi>ans){
                ans=maxi;
            }


        }

        return ans;
    }
}