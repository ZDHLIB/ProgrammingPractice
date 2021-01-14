package LeetCode.Easy;

public class Q733 {
    int[] xx = new int[]{-1,0,1,0};
    int[] yy = new int[]{0,-1,0,1};

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int[][] visited = new int[image.length][image[0].length];
        dfs(image, sr, sc, image[sr][sc], newColor, visited);
        return image;
    }

    public void dfs(int[][] image, int x, int y, int oldColor, int newColor, int[][] visited){
        if(x<0 || x>=image.length || y<0 || y>=image[0].length || visited[x][y] == 1) return;
        if(image[x][y] == oldColor){
            image[x][y] = newColor;
            visited[x][y] = 1;
            for(int i = 0; i < 4; i++){
                dfs(image, x+xx[i], y+yy[i], oldColor, newColor, visited);
            }
        }
    }
}
