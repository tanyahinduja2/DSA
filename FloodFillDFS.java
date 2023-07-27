class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int newColor = image[sr][sc];
        if(newColor == color) {
            return image;
        }
        fill(image, sr, sc, color, newColor);
        return image;
    }
    void fill(int[][] image, int sr, int sc, int color, int newColor) {
        if(sr < image.length && sr>= 0 && sc < image[0].length && sc >= 0 && image[sr][sc] == newColor) {
            image[sr][sc] = color;
            fill(image, sr+1, sc, color, newColor);
            fill(image, sr-1, sc, color, newColor);
            fill(image, sr, sc+1, color, newColor);
            fill(image, sr, sc-1, color, newColor);
        }
    }
}
