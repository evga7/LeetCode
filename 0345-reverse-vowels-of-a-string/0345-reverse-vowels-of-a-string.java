class Solution {
    public boolean chk(char c)
    {
        c=Character.toLowerCase(c);
        if (c=='a' || c=='e' || c=='i' || c=='o'||c=='u')
            return true;
        return false;
    }
    public String reverseVowels(String s) {
        StringBuilder sb= new StringBuilder();
        for (int i=0;i<s.length();i++)
        {
            char cur=s.charAt(i);
            if (chk(cur)==true)
            {
                sb.append(cur);
            }
        }
        String r=sb.reverse().toString();
        int idx=0;
        StringBuilder res= new StringBuilder();
        for (int i=0;i<s.length();i++)
        {
            char cur=s.charAt(i);
            if (chk(cur)==true)
            {
                if (idx<r.length())
                {
                    res.append(r.charAt(idx));
                    idx+=1;
                }
            continue;
            }
            res.append(cur);
        }
        return res.toString();
    }
}