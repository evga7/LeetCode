class Solution {
    public String reverseWords(String s) {
        String []v=s.split(" ");
        StringBuilder sb=new StringBuilder();
        ArrayList<String> v2=new ArrayList();
        for (String cur :v) {
            if (cur.equals("")) continue;
            v2.add(cur);
        }
        for (int i=v2.size()-1;i>=0;i--)
        {
            if (v2.get(i).equals(""))continue;
            sb.append(v2.get(i));
            if (i==0)break;
            sb.append(" ");
        }
        return sb.toString();
    }
}