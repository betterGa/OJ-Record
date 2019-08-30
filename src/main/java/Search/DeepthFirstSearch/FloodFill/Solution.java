package Search.DeepthFirstSearch.FloodFill;

public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int save=1;
        if(sr>=0&&sc>=0) {

            //上
            if (image[sr - 1][sc] == save) {image[sr-1][sc]=newColor;
                if (sr - 1 >= 1 && sr - 1 <= image.length - 1) {
                    floodFill(image, sr - 1, sc, newColor);
                }
            }
            //右
            if (image[sr][sc + 1] == save) {image[sr][sc+1]=newColor;
                if (sc + 1 >= 0 && sc + 1 <= image[0].length - 2) {
                    floodFill(image, sr, sc + 1, newColor);
                }
            }
            //下
            if (image[sr + 1][sc] == save) {image[sr+1][sc]=newColor;
                if (sr + 1 >= 0 && sr + 1 <= image.length - 2) {
                    floodFill(image, sr + 1, sc, newColor);
                }
            }

            //左
            if (image[sr][sc - 1] == save) {image[sr][sc-1]=newColor;
                if (sc - 1 >= 1 && sc - 1 <= image.length - 1) {
                    floodFill(image, sr, sc - 1, newColor);
                }
            }


        }  return image;}}