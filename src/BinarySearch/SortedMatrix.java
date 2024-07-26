package BinarySearch;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
       int[][] arr = {
               {1, 2, 3},
               {4, 5, 6},
               {7, 8, 9}
       };
        System.out.println(Arrays.toString(search(arr,8)));
        System.out.println(Arrays.toString(search(arr,23)));
    }

    static int[] binarySearch(int[][] matrix,int rows, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int cMid = cStart + (cEnd - cStart)/2;
            if(matrix[rows][cMid] == target){
                return new int[]{rows, cMid};
            }
            if(matrix[rows][cMid] < target){
                cStart = cMid +1;
            }else {
                cEnd = cMid -1;
            }
        }
        return new int[]{-1, -1};
    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; // be caution matrix may be empty
        if(rows == 1){
            return binarySearch(matrix,0,0,cols-1, target);
        }
        int rStart = 0;
        int rEnd = rows -1;
        int rMid = cols /2;

        //run the loop till 2 rows are remaining
        while(rStart < (rEnd - 1)){
            //while this is true it will have more than two rows
            int mid = rStart + (rEnd -rStart)/2;
            if(matrix[mid][rMid] == target){
                return new int[] {mid, rMid};
            }
            if(matrix[mid][rMid] < target){
                rStart = mid;
            }
            else{
                rEnd = mid - 1;
            }
        }

        //now we have two rows
        //check whether the target is in the col of 2 row s
        if(matrix[rStart][rMid] == target){
            return new int[] {rStart, rMid};
        }
        if(matrix[rStart+1][rMid] == target){
            return new int[] {rStart+1, rMid};
        }

        //search in 1st half
        if(target <= matrix[rStart][rMid-1]){
           return binarySearch(matrix,rStart,0,rMid-1,target);
        }
        //search in 2nd half
        if(target >= matrix[rStart][rMid+1] && target <= matrix[rStart][cols-1]){
            return binarySearch(matrix,rStart,rMid+1,cols-1,target);
        }
        //search in 3rd half
        if(target <= matrix[rStart+1][rMid-1]){
            return binarySearch(matrix,rStart+1,0,rMid-1,target);
        }else{
            return binarySearch(matrix,rStart+1,rMid+1,cols-1,target);
        }
    }
}
