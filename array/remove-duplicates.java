class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int n=nums.length;
        int i=0;
        while(i<n){
            nums[k++]=nums[i];
            int cur=nums[i];
            i++;
            while(i<n && nums[i]==cur){
                i++;
            }
        }
        return k;
    }
}
