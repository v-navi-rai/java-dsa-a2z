// User function Template for Java

class Solution {
    public static void reversearray(int arr[],int i,int j){
        int n=arr.length;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n=arr.length;
        d=d%n;
        reversearray(arr,0,d-1);
        reversearray(arr,d,n-1);
        reversearray(arr,0,n-1);
    }
}
