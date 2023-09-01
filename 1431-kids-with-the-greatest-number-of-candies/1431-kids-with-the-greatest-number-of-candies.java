class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int m=0;
        
        for (int c : candies)
            m=Math.max(m,c);
        List<Boolean>res =new ArrayList<>();
        for (int c : candies)
        {
            if (c+extraCandies>=m)
                res.add(true);
            else
                res.add(false);
        }
        return res;
    }
}