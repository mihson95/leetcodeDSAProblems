// Subset Sum Problem - GeeksForGeeks

// Driver Code Starts
// Driver Code Ends


class Solution{

    public static Boolean helper(int[] arr, int tempSum, int sum, int index) {
        if(tempSum == sum) {
            return true;
        }
        if(tempSum > sum) {
            return false;
        }
        if(index >= arr.length) {
            return false;
        }
        Boolean condition1 = helper(arr, tempSum + arr[index], sum, index+1);
        Boolean condition2 = helper(arr, tempSum, sum, index+1);
        return condition1 || condition2;
    }

    static Boolean isSubsetSum(int N, int arr[], int sum){
        return helper(arr, 0, sum, 0);
    }
}
