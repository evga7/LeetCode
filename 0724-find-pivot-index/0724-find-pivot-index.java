class Solution {
    public int pivotIndex(int[] nums) {
        int N=nums.length;
        int []arr= new int[N+1];
        for (int i=1;i<=N;i++)
        {
            arr[i]=nums[i-1]+arr[i-1];
        }
        for (int i=1;i<=N;i++)
        {
            if ((arr[i-1]-arr[0])==(arr[N]-arr[i]))
                return i-1;

        }
        return -1;
    }
}