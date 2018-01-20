package Easy;

public class Q463 {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int[] xx = new int[]{-1,0,1,0};
        int[] yy = new int[]{0,-1,0,1};
        int res = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if( grid[i][j] == 1 ){
                    for(int k = 0; k < 4; k++){
                        if( i+xx[k] < 0 || i+xx[k] >= row || j+yy[k] < 0 || j+yy[k] >= column ){
                            res++;
                        }else if( grid[i+xx[k]][j+yy[k]] == 0 ){
                            res++;
                        }
                    }
                }
            }
        }
        return res;
    }
}
