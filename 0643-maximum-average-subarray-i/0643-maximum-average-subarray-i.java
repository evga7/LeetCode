class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int right=k;
        int s=0;
        double res=-987654321;
        for (int i=0;i<k;i++)
            s+=nums[i];
            res=Math.max(res,s);
        while (right<nums.length)
        {
            s+=nums[right];
            s-=nums[left];
            res=Math.max(res,s);
            right+=1;
            left+=1;
        }
        return res/k;
    }
}