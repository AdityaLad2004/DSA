class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int curr=nums[i];

            if(map.containsKey(curr)){
                if(Math.abs(i-map.get(curr))<=k){
                    return true;
                }
            }

            
                map.put(curr,i);
            
        }
        return false;
    }
}