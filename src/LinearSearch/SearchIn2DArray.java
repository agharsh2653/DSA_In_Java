package LinearSearch;
import java.util.Arrays;
public class SearchIn2DArray {
    public static void main(String[] args) {

        int[][] arr = new int[][]{
                {23, 43, 9},
                {18, 3, 2, 12},
                {78, 99, 34, 56},
                {18, 13}
        };
        int target = 99;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr.length; c++) {
                if (arr[r][c] == target) {
                    return new int[]{r, c};
                }
            }
        }
        return new int[]{-1, -1};
    }



}
