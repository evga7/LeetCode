class Solution:



    def nearestExit(self, maze: List[List[str]], entrance: List[int]) -> int:
        def is_inside(x,y,N,M):
            return 0<=x<N and 0<=y<M
        dist=[[987654321 for _ in range(101)]for _ in range(101)]
        pq=[]
        sx=entrance[0]
        N=len(maze)
        M=len(maze[0])
        sy=entrance[1]
        dx = [0,-1,0,1]
        dy = [1,0,-1,0]
        pq.append((0,sx,sy))
        dist[sx][sy]=0
        while pq :
            cost,x,y=heapq.heappop(pq)
            for i in range(4):
                n_x=x+dx[i]
                n_y=y+dy[i]
                if not is_inside(n_x,n_y,N,M) or maze[n_x][n_y]=='.':
                    if not is_inside(n_x,n_y,N,M):
                        print(x,y,n_x,n_y)
                        if x!=sx or y!=sy:
                            return cost
                    if is_inside(n_x,n_y,N,M) and dist[n_x][n_y]>cost+1:
                        dist[n_x][n_y]=cost+1
                        heapq.heappush(pq,(cost+1,n_x,n_y))

        return -1

        
        
        