class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        //method1
        int j=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int i=j+1; i<arr.length; i++){
            if(arr[i]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
        //method2
        // int k=0;
        // for(int i=0; i<arr.length; ){
        //     if(arr[i]!=0){
        //         arr[k++]=arr[i];
        //         i++;
        //     }
        //     else{
        //         i++;
        //     }
        // }
        // for(int i=k;i<arr.length;i++){
        //     arr[i]=0;
        // }
    }
}
