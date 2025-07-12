class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] answer = new int[n];
        Arrays.fill(answer,1);
        int pre=1,suf=1;

        for(int i=0;i<n;i++){
            answer[i]=pre;
            pre=pre*nums[i];
        }

        for(int i=nums.length-1;i>=0;i--){
            answer[i]=answer[i]*suf;
            suf=suf*nums[i];
        }

        return answer;
    }
}