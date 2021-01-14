package LeetCode.Easy;

import java.util.LinkedList;
import java.util.Queue;

public class Q695 {
    public int maxAreaOfIsland(int[][] grid) {
        int R = grid.length, C = grid[0].length;
        int[][] visited = new int[R][C];

        int res = 0;
        for(int i = 0; i < R; i++){
            for(int j = 0; j < C; j++){
                if(grid[i][j] == 1 && visited[i][j] == 0){
                    visited[i][j] = 1;
                    res = Math.max(res,bfs(i,j,grid,visited));
                }
            }
        }
        return res;
    }

    private int bfs(int i, int j, int[][] grid, int[][] visited){
        int res = 0;
        int R = grid.length, C = grid[0].length;
        int[] xx = new int[]{0,-1,0,1};
        int[] yy = new int[]{-1,0,1,0};
        Queue<Integer> qx = new LinkedList<>();
        Queue<Integer> qy = new LinkedList<>();
        qx.offer(i);
        qy.offer(j);
        while(!qx.isEmpty()){
            i = qx.poll();
            j = qy.poll();
            res++;
            for(int k = 0; k < 4; k++){
                int x = i+xx[k];
                int y = j+yy[k];
                if(x>=0 && x<R && y>=0 && y<C){
                    if(grid[x][y] == 1 && visited[x][y] == 0) {
                        visited[x][y] = 1;
                        qx.offer(x);
                        qy.offer(y);
                    }
                }
            }
        }
        return res;
    }
}
