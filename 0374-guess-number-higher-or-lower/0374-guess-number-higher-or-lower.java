/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long left=0;
        long right=n;
        while (left<=right)
        {
            long mid=left+right>>1;
            int r=guess(Long.valueOf(mid).intValue());
            if (r<0)
                right=mid-1;
            else if (r>0)
                left=mid+1;
            else
                return Long.valueOf(mid).intValue();
        }
        return -1;
    }
}