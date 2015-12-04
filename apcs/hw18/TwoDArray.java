import java.util.*;

public class TwoDArray{
    public static int[][] convert ( int [] data , int rows, int cols){
	int[][] ans = new int[rows][cols];
	for(int x = 0; x<data.length; x++){
	    ans[x/cols][x%cols] = data[x];
	}
	return ans;
    }
    public static void main(String[]args){
	int[]test = {1, 2, 3, 4, 5, 6};
	System.out.println(Arrays.deepToString(convert(test, 3, 2)));
    }
}
