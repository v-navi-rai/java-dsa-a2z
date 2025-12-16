class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        if(arr.length==1){
            return -1;
        }
        
        int larg=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>larg){
                sec=larg;
                larg=arr[i];
            }
            else if(arr[i]>sec && arr[i]<larg){
                sec=arr[i];
            }
        }
        
        return sec;
    }
}
