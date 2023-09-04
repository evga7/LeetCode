class Solution {
    int visited[]=new int[1001];
    public void go(int cur,List<List<Integer>> rooms)
    {
        visited[cur]=1;
        for (int nxt : rooms.get(cur))
        {
            if (visited[nxt]==0)
            {
                go(nxt,rooms);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        go(0,rooms);
        for (int i=0;i<rooms.size();i++)
            if (visited[i]==0)
                return false;
        return true;
        
        
    }
}