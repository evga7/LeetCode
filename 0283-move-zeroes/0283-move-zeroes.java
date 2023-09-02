class Solution {
    public int swap(int a,int b)
    {
        return a;
    }
    public void moveZeroes(int[] nums) {
        int left=0;
        int right=0;
        while (left<=right && right<nums.length)
        {
            while (nums[right]==0 && right+1<nums.length) {
                right += 1;
                continue;
            }
            if (nums[left]==0)
            {
                nums[right]=swap(nums[left],nums[left]=nums[right]);
            }
            left+=1;
            right+=1;
        }

    }
}