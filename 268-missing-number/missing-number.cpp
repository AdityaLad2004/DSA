class Solution {
public:
    int missingNumber(vector<int>& nums) {
        // sort(nums.begin(),nums.end());

        // for(int i=0;i<nums.size();i++){
        //     if(nums[i]!=i){
        //         return i;
        //     }
        // }

        int n=nums.size();
        int sumAssume=n*(n+1)/2;
        int actualSum=0;

        for(int i=0;i<nums.size();i++){
            actualSum+=nums[i];
        }

        return sumAssume - actualSum;
    }
};