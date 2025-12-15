class Solution {
    public long maxArrayValue(int[] nums) {
        int n=nums.length;
        long curr=nums[n-1];
        long max=curr;
        for(int i=n-2; i>=0; i--){
            if(nums[i]<=curr){
                curr+=nums[i];
            }
            else{
                curr=nums[i];
            }
            max=Math.max(max,curr);
        }
        return max;
    }
}
