package Search.DeepthFirstSearch.FloodFill;
/*
public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int save=1;
        if(sr>=0&&sc>=0) {

            //上
            if (image[sr - 1][sc] == save)
            {image[sr-1][sc]=newColor;
            floodFill(image,sr-1,sc,newColor);
                if (sr - 1 <1 || sr - 1 > image.length - 1) {
                    return image;
                }
            }
            //右
            if (image[sr][sc + 1] == save) {image[sr][sc+1]=newColor;
                floodFill(image, sr, sc + 1, newColor);
                if (sc + 1 <0 || sc + 1 >image[0].length - 2) {
                   return image;
                }
            }
            //下
            if (image[sr + 1][sc] == save) {image[sr+1][sc]=newColor;
                floodFill(image, sr + 1, sc, newColor);
                if (sr + 1 <0 ||sr + 1 >image.length - 2) {
                   return image;
                }
            }

            //左
            if (image[sr][sc - 1] == save)
            {image[sr][sc-1]=newColor;
                floodFill(image, sr, sc - 1, newColor);
                if (sc - 1 < 1 || sc - 1 >image.length - 1) {
                   return image;
                }
            }


        }  return image;}}



        */

/*
import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<String> list = new ArrayList<>();
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (list.contains(sr+""+sc)) {
            return image;
        }
        int value = image[sr][sc];
        image[sr][sc] = newColor;
        list.add(sr + "" + sc);
        if (sr - 1 >= 0 && image[sr-1][sc] == value) {
            image = floodFill(image,sr - 1,sc,newColor);
        }
        if (sr + 1 < image.length && image[sr+1][sc] == value) {
            image = floodFill(image,sr + 1,sc,newColor);
        }
        if (sc - 1 >= 0 && image[sr][sc-1] == value) {
            image = floodFill(image,sr,sc-1,newColor);
        }
        if (sc + 1 < image[0].length && image[sr][sc+1] == value) {
            image = floodFill(image,sr,sc+1,newColor);
        }
        return image;
    }
}
*/

import java.util.ArrayList;
import java.util.List;

//自己实现一下
public class Solution
{
    List<String> ifjudged=new ArrayList<>();
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
 //遇到已判断过的，回退即可
               if(ifjudged.contains(sr+""+sc))
        {return image;}

        //先标记为已判断坐标，避免重复判断
       ifjudged.add(sr+""+sc);
        //先把需要判断的当前坐标的值存起来
        int save = image[sr][sc];
//改变当前坐标颜色
        image[sr][sc] = newColor;
//上
        if (sr>= 1&&image[sr - 1][sc] == save) {
            floodFill(image, sr - 1, sc, newColor);
        }

//下
        if ( sr< image.length - 1&&image[sr + 1][sc] == save) {
            floodFill(image, sr + 1, sc, newColor);
        }

        //左
        if ( sc >= 1&&image[sr][sc - 1] == save) {
            floodFill(image, sr, sc - 1, newColor);
        }

        //右
        if (sc<image[0].length-1&&image[sr][sc + 1] == save ) {
            floodFill(image, sr, sc + 1, newColor);
        }

        return image;
    }}