class Solution {
    public static void reversearray(int[] arr,int s,int e){
        while(s<e){
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
    }
    void nextPermutation(int[] arr) {
        // code here
        int idx=-1;
        int n=arr.length;
        
        for(int i=n-2;i>=0; i--){
            if(arr[i]<arr[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            reversearray(arr,0,n-1);
        }
        for(int i=n-1;i>=idx; i--){
            if(arr[i]>arr[idx]){
                int temp=arr[idx];
                arr[idx]=arr[i];
                arr[i]=temp;
            }
        }
        reversearray(arr,idx+1,n-1);
    }
}
